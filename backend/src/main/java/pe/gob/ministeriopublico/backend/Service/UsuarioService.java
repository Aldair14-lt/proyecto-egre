package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Usuario;
import pe.gob.ministeriopublico.backend.repository.UsuarioRepository;

/** Contiene la logica de negocio de las cuentas de usuario. */
@Service
public class UsuarioService extends CrudService<Usuario, Integer> {
    public UsuarioService(UsuarioRepository repository) { super(repository); }
}
