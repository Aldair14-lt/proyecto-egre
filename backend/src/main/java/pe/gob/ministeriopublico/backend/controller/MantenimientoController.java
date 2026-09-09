package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.MantenimientoService;
import pe.gob.ministeriopublico.backend.entity.Mantenimiento;

/** Expone el CRUD REST de mantenimientos en /api/mantenimientos. */
@RestController
@RequestMapping("/api/mantenimientos")
public class MantenimientoController extends CrudController<Mantenimiento, Integer> {
    public MantenimientoController(MantenimientoService service) { super(service); }
}
