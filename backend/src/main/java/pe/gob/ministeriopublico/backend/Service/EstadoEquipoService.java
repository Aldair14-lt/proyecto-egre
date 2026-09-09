package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.EstadoEquipo;
import pe.gob.ministeriopublico.backend.repository.EstadoEquipoRepository;

/** Contiene la logica de negocio de los estados de equipos. */
@Service
public class EstadoEquipoService extends CrudService<EstadoEquipo, Integer> {
    public EstadoEquipoService(EstadoEquipoRepository repository) { super(repository); }
}
