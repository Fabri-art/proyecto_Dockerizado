package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.DetPedido;
import com.ChinoMarket.pe.proyecto_crud.entities.Pedido;
import com.ChinoMarket.pe.proyecto_crud.entities.Producto;
import com.ChinoMarket.pe.proyecto_crud.entities.Stock;
import com.ChinoMarket.pe.proyecto_crud.repository.PedidoRepository;
import com.ChinoMarket.pe.proyecto_crud.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private StockService stockService;

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Pedido save(Pedido pedido) {
        long totalPagoCalculado = 0;

        Pedido ultimoPedido = pedidoRepository.findTopByOrderByIdPDesc();
        long siguienteNumero = (ultimoPedido != null) ? ultimoPedido.getIdP() + 1 : 1;

        pedido.setNumpedido(siguienteNumero);
        pedido.setNumerocomprobante(10000 + siguienteNumero);
        if (pedido.getDetallesPedido() != null) {
            for (DetPedido detalle : pedido.getDetallesPedido()) {
                detalle.setPedido(pedido);

                Producto producto = productoRepository.findById(detalle.getProducto().getIdPro())
                        .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado con ID: " + detalle.getProducto().getIdPro()));

                detalle.setProducto(producto);

                Long precioUnitario = producto.getPrecio();
                detalle.setPrecioUnitario(precioUnitario);

                totalPagoCalculado += precioUnitario * detalle.getCantidad();

                List<Stock> stockList = stockService.obtenerStockPorProductoId(producto.getIdPro());

                if (stockList.isEmpty()) {
                    throw new IllegalStateException("No existe stock registrado para el producto: " + producto.getNombre());
                }

                Stock stock = stockList.get(0);

                int entradas = stock.getEntradas() != null ? stock.getEntradas() : 0;
                int salidas = stock.getSalidas() != null ? stock.getSalidas() : 0;

                if ((entradas - salidas) < detalle.getCantidad()) {
                    throw new IllegalStateException("Stock insuficiente para el producto: " + producto.getNombre());
                }

                stock.setSalidas(salidas + detalle.getCantidad());
                stock.setBalance(entradas - stock.getSalidas());

                stockService.crearStock(stock);
            }
        }

        pedido.setTotalpago(totalPagoCalculado);

        return pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> obtenerTodosLosPedidos() {
        return pedidoRepository.findAll();
    }

    @Override
    public List<Pedido> obtenerPedidosPorClienteId(Long clienteIdC) {
        return pedidoRepository.findByCliente_IdC(clienteIdC);
    }

    @Override
    public Pedido obtenerPedidoPorId(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado con ID: " + id));
    }

    @Override
    public List<Pedido> obtenerPedidosPorEstado(String estado) {
        return pedidoRepository.findByEstado(estado);
    }

    @Override
    public void eliminarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}