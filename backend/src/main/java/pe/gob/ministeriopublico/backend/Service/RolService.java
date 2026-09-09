package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Rol;
import pe.gob.ministeriopublico.backend.repository.RolRepository;

/** Contiene la logica de negocio de los roles. */
@Service
public class RolService extends CrudService<Rol, Integer> {
    public RolService(RolRepository repository) { super(repository); }
}
