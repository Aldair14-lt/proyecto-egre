package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.TipoMatenimientoService;
import pe.gob.ministeriopublico.backend.entity.TipoMatenimiento;

/** Expone el CRUD REST de tipos de mantenimiento en /api/tipos-mantenimiento. */
@RestController
@RequestMapping("/api/tipos-mantenimiento")
public class TipoMatenimientoController extends CrudController<TipoMatenimiento, Integer> {
    public TipoMatenimientoController(TipoMatenimientoService service) { super(service); }
}
