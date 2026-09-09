package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Sede;
import pe.gob.ministeriopublico.backend.repository.SedeRepository;

/** Contiene la logica de negocio de las sedes. */
@Service
public class SedeService extends CrudService<Sede, Integer> {
    public SedeService(SedeRepository repository) { super(repository); }
}
