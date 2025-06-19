package upeu.edu.pe.report_ms.repositories;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.report_ms.beans.LoadBalancerConfiguration;
import upeu.edu.pe.report_ms.models.Pedido;

import java.util.Optional;

@FeignClient(name = "chinomarket-crud")  // Nombre del servicio en Eureka
@LoadBalancerClient(name = "chinomarket-crud", configuration = LoadBalancerConfiguration.class)  // Para usar el balanceador de carga
public interface PedidoRepository {

        @GetMapping(path = "chinomarket-crud/api/pedidos/{id}")  // Endpoint para obtener un Resultado por ID
        Optional<Pedido> findById(@PathVariable("id") Long id);

        @PostMapping(path = "chinomarket-crud/api/pedidos")  // Endpoint para crear un nuevo Resultado
        Pedido save(@RequestBody Pedido pedido);

        @DeleteMapping(path = "chinomarket-crud/api/pedidos/{id}")  // Endpoint para eliminar un Resultado por ID
        void deleteById(@PathVariable("id") Long id);
    }
