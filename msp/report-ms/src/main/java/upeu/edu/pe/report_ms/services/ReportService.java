package upeu.edu.pe.report_ms.services;

public interface ReportService {
    String makeReport(Long id);
    String saveReport(String report);
    void deleteReport(Long id);
}

