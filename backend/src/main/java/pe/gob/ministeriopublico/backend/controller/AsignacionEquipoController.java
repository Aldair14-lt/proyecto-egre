package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.AsignacionEquipoService;
import pe.gob.ministeriopublico.backend.entity.AsignacionEquipo;

/** Expone el CRUD REST de asignaciones en /api/asignaciones-equipo. */
@RestController
@RequestMapping("/api/asignaciones-equipo")
public class AsignacionEquipoController extends CrudController<AsignacionEquipo, Integer> {
    public AsignacionEquipoController(AsignacionEquipoService service) { super(service); }
}
