package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.RolService;
import pe.gob.ministeriopublico.backend.entity.Rol;

/** Expone el CRUD REST de roles en /api/roles. */
@RestController
@RequestMapping("/api/roles")
public class RolController extends CrudController<Rol, Integer> {
    public RolController(RolService service) { super(service); }
}
