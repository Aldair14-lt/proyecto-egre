package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.UsuarioRol;
import pe.gob.ministeriopublico.backend.repository.UsuarioRolRepository;

/** Contiene la logica de negocio de la relacion usuario-rol. */
@Service
public class UsuarioRolService extends CrudService<UsuarioRol, Integer> {
    public UsuarioRolService(UsuarioRolRepository repository) { super(repository); }
}
