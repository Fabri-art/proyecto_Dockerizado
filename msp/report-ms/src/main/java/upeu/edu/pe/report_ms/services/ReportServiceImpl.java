package upeu.edu.pe.report_ms.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import upeu.edu.pe.report_ms.helpers.ReportHelper;
import upeu.edu.pe.report_ms.models.Pedido;
import upeu.edu.pe.report_ms.repositories.PedidoRepository;

@Service
public class ReportServiceImpl implements ReportService {

    private final PedidoRepository pedidoRepository;
    private final ReportHelper reportHelper;
    private final ObjectMapper objectMapper;

    public ReportServiceImpl(PedidoRepository pedidoRepository,
                             ReportHelper reportHelper,
                             ObjectMapper objectMapper) {
        this.pedidoRepository = pedidoRepository;
        this.reportHelper = reportHelper;
        this.objectMapper = objectMapper;
    }

    @Override
    public String makeReport(Long id) {
        Pedido pedido = pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        return reportHelper.readTemplate(pedido);
    }

    @Override
    public String saveReport(String jsonReport) {
        try {
            Pedido pedido = objectMapper.readValue(jsonReport, Pedido.class);
            pedidoRepository.save(pedido);
            return "Guardado correctamente";
        } catch (Exception e) {
            throw new RuntimeException("Error al guardar resultado: " + e.getMessage(), e);
        }
    }

    @Override
    public void deleteReport(Long id) {
        pedidoRepository.deleteById(id);
    }
}


