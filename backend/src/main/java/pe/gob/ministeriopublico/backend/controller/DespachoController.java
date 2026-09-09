package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.DespachoService;
import pe.gob.ministeriopublico.backend.entity.Despacho;

/** Expone el CRUD REST de despachos en /api/despachos. */
@RestController
@RequestMapping("/api/despachos")
public class DespachoController extends CrudController<Despacho, Integer> {
    public DespachoController(DespachoService service) { super(service); }
}
