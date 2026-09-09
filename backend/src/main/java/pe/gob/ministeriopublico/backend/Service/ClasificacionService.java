package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Clasificacion;
import pe.gob.ministeriopublico.backend.repository.ClasificacionRepository;

/** Contiene la logica de negocio de las clasificaciones. */
@Service
public class ClasificacionService extends CrudService<Clasificacion, Integer> {
    public ClasificacionService(ClasificacionRepository repository) { super(repository); }
}
