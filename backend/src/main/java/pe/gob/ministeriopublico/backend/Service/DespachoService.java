package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Despacho;
import pe.gob.ministeriopublico.backend.repository.DespachoRepository;

/** Contiene la logica de negocio de los despachos. */
@Service
public class DespachoService extends CrudService<Despacho, Integer> {
    public DespachoService(DespachoRepository repository) { super(repository); }
}
