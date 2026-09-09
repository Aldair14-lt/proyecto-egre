package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.UsuarioService;
import pe.gob.ministeriopublico.backend.entity.Usuario;

/** Expone el CRUD REST de usuarios en /api/usuarios. */
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController extends CrudController<Usuario, Integer> {
    public UsuarioController(UsuarioService service) { super(service); }
}
