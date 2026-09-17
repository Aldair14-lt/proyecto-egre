package pe.gob.ministeriopublico.backend.controller;

import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.DistritoFiscalService;
import pe.gob.ministeriopublico.backend.Service.ReporteService;
import pe.gob.ministeriopublico.backend.entity.DistritoFiscal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/distritos-fiscales")
public class DistritoFiscalController extends CrudController<DistritoFiscal, Integer> {

    private final DistritoFiscalService distritoFiscalService;
    private final ReporteService reporteService;

    public DistritoFiscalController(DistritoFiscalService service, ReporteService reporteService) {
        super(service);
        this.distritoFiscalService = service;
        this.reporteService = reporteService;
    }

    // Ruta diferenciada para evitar conflictos con /{id} de CrudController
    @GetMapping("/exportar/pdf")
    public ResponseEntity<byte[]> generarReportePdf() {
        try {
            List<DistritoFiscal> listaDistritos = distritoFiscalService.listar();

            Map<String, Object> parametros = new HashMap<>();
            parametros.put("TITULO_REPORTE", "MINISTERIO PÚBLICO - REPORTE DE DISTRITOS FISCALES");
            parametros.put("TOTAL_REGISTROS", listaDistritos.size());

            byte[] pdfBytes = reporteService.generarReportePdfDesdeLista("distrito_fiscal_reporte", parametros, listaDistritos);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDisposition(ContentDisposition.inline()
                    .filename("reporte_distritos_fiscales.pdf")
                    .build());

            return ResponseEntity.ok()
                    .headers(headers)
                    .body(pdfBytes);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
}