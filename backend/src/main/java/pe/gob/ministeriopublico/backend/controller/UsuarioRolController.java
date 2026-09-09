package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.UsuarioRolService;
import pe.gob.ministeriopublico.backend.entity.UsuarioRol;

/** Expone el CRUD REST de relaciones usuario-rol en /api/usuarios-roles. */
@RestController
@RequestMapping("/api/usuarios-roles")
public class UsuarioRolController extends CrudController<UsuarioRol, Integer> {
    public UsuarioRolController(UsuarioRolService service) { super(service); }
}
