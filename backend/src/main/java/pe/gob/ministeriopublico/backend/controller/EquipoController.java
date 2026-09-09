package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.EquipoService;
import pe.gob.ministeriopublico.backend.entity.Equipo;

/** Expone el CRUD REST de equipos en /api/equipos. */
@RestController
@RequestMapping("/api/equipos")
public class EquipoController extends CrudController<Equipo, Integer> {
    public EquipoController(EquipoService service) { super(service); }
}
