package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.SedeService;
import pe.gob.ministeriopublico.backend.entity.Sede;

/** Expone el CRUD REST de sedes en /api/sedes. */
@RestController
@RequestMapping("/api/sedes")
public class SedeController extends CrudController<Sede, Integer> {
    public SedeController(SedeService service) { super(service); }
}
