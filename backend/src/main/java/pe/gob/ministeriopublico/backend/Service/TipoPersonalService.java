package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.TipoPersonal;
import pe.gob.ministeriopublico.backend.repository.TipoPersonalRepository;

/** Contiene la logica de negocio de los tipos de personal. */
@Service
public class TipoPersonalService extends CrudService<TipoPersonal, Integer> {
    public TipoPersonalService(TipoPersonalRepository repository) { super(repository); }
}
