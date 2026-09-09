package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Equipo;
import pe.gob.ministeriopublico.backend.repository.EquipoRepository;

/** Contiene la logica de negocio del inventario de equipos. */
@Service
public class EquipoService extends CrudService<Equipo, Integer> {
    public EquipoService(EquipoRepository repository) { super(repository); }
}
