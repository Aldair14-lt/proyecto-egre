package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.AsignacionEquipo;
import pe.gob.ministeriopublico.backend.repository.AsignacionEquipoRepository;

/** Contiene la logica de negocio de las asignaciones de equipos. */
@Service
public class AsignacionEquipoService extends CrudService<AsignacionEquipo, Integer> {
    public AsignacionEquipoService(AsignacionEquipoRepository repository) { super(repository); }
}
