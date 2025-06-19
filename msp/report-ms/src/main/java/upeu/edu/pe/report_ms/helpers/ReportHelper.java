package upeu.edu.pe.report_ms.helpers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import upeu.edu.pe.report_ms.models.Pedido;
import upeu.edu.pe.report_ms.models.DetPedido;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ReportHelper {

    @Value("${report.template}")  // Asegúrate de definir esta clave en application-ant.properties
    private String pedidoTemplate;

    private String fillTemplate(String template, Map<String, String> values) {
        String result = template;
        for (Map.Entry<String, String> entry : values.entrySet()) {
            String placeholder = "{" + entry.getKey() + "}";
            result = result.replace(placeholder, entry.getValue() != null ? entry.getValue() : "");
        }
        return result;
    }

    public String readTemplate(Pedido pedido) {
        return fillTemplate(pedidoTemplate, toMap(pedido));
    }

    public Map<String, String> toMap(Pedido pedido) {
        Map<String, String> map = new HashMap<>();

        map.put("idP", pedido.getIdP() != null ? pedido.getIdP().toString() : "");
        map.put("numpedido", pedido.getNumpedido() != null ? pedido.getNumpedido().toString() : "");
        map.put("estado", pedido.getEstado() != null ? pedido.getEstado() : "");
        map.put("totalpago", pedido.getTotalpago() != null ? pedido.getTotalpago().toString() : "");
        map.put("tipocomprobante", pedido.getTipocomprobante() != null ? pedido.getTipocomprobante() : "");
        map.put("numerocomprobante", pedido.getNumerocomprobante() != null ? pedido.getNumerocomprobante().toString() : "");
        map.put("metodopago", pedido.getMetodopago() != null ? pedido.getMetodopago() : "");
        map.put("fechaEmision", pedido.getFechaEmision() != null ? pedido.getFechaEmision().toString() : "");

        // Cliente
        if (pedido.getCliente() != null) {
            map.put("clienteNombre", pedido.getCliente().getNombres() != null ? pedido.getCliente().getNombres() : "");
        } else {
            map.put("clienteNombre", "");
        }

        return map;
    }
}
