package pe.gob.ministeriopublico.backend.Service;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Service
public class ReporteService {

    public byte[] generarReportePdf(String nombreReporte, Map<String, Object> parametros, JRDataSource dataSource) throws Exception {
        String rutaPlantilla = "reports/" + nombreReporte + ".jrxml";
        InputStream inputStream = new ClassPathResource(rutaPlantilla).getInputStream();

        JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, dataSource);

        return JasperExportManager.exportReportToPdf(jasperPrint);
    }

    // Método que falta en tu ReporteService:
    public <T> byte[] generarReportePdfDesdeLista(String nombreReporte, Map<String, Object> parametros, List<T> listaDatos) throws Exception {
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(listaDatos);
        return generarReportePdf(nombreReporte, parametros, dataSource);
    }
}