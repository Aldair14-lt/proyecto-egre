package pe.gob.ministeriopublico.backend.controller;

import net.sf.jasperreports.engine.JREmptyDataSource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.ReporteService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    private final ReporteService reporteService;

    // Inyección de dependencias por constructor
    public ReporteController(ReporteService reporteService) {
        this.reporteService = reporteService;
    }

    /**
     * Endpoint GET para generar y visualizar el PDF de prueba.
     * URL de acceso: GET http://localhost:8080/api/reportes/ejemplo-pdf
     */
    @GetMapping("/ejemplo-pdf")
    public ResponseEntity<byte[]> descargarReporteEjemplo() {
        try {
            // 1. Definir los parámetros que se pasarán a la plantilla JRXML
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("TITULO_REPORTE", "SISTEMA DE GESTIÓN - MINISTERIO PÚBLICO");
            parametros.put("USUARIO_IMPRESION", "Aldair Taipe");

            // 2. Invocar el servicio de reportes (usando un DataSource vacío para esta prueba)
            byte[] pdfBytes = reporteService.generarReportePdf("ejemplo", parametros, new JREmptyDataSource());

            // 3. Configurar las cabeceras HTTP para que el navegador identifique y abra el archivo PDF
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            
            // "inline" permite ver el PDF directamente en el navegador web
            // "attachment" forzaría la descarga automática del archivo
            headers.setContentDisposition(ContentDisposition.inline()
                    .filename("reporte_ejemplo.pdf")
                    .build());

            // 4. Retornar el ResponseEntity con estado HTTP 200 OK, cabeceras y el PDF en el cuerpo
            return ResponseEntity.ok()
                    .headers(headers)
                    .body(pdfBytes);

        } catch (Exception e) {
            e.printStackTrace();
            // Retorna un error 500 si falla la compilación o generación
            return ResponseEntity.internalServerError().build();
        }
    }
}