package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.DistritoFiscal;
import pe.gob.ministeriopublico.backend.repository.DistritoFiscalRepository;

/** Contiene la logica de negocio de los distritos fiscales. */
@Service
public class DistritoFiscalService extends CrudService<DistritoFiscal, Integer> {
    public DistritoFiscalService(DistritoFiscalRepository repository) { super(repository); }
}
