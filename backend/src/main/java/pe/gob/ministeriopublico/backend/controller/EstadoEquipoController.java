package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.EstadoEquipoService;
import pe.gob.ministeriopublico.backend.entity.EstadoEquipo;

/** Expone el CRUD REST de estados en /api/estados-equipo. */
@RestController
@RequestMapping("/api/estados-equipo")
public class EstadoEquipoController extends CrudController<EstadoEquipo, Integer> {
    public EstadoEquipoController(EstadoEquipoService service) { super(service); }
}
