package upeu.edu.pe.report_ms.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.report_ms.services.ReportService;

import java.util.Map;

@RestController
@RequestMapping("report")
public class ReportController {
    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Map<String, String>> getReport(@PathVariable Long id) {
        var response = Map.of("report", this.reportService.makeReport(id));
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<String> postReport(@RequestBody String jsonReport) {
        return ResponseEntity.ok(reportService.saveReport(jsonReport));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReport(@PathVariable Long id) {
        reportService.deleteReport(id);
        return ResponseEntity.noContent().build();
    }
}


