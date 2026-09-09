package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.TipoPersonalService;
import pe.gob.ministeriopublico.backend.entity.TipoPersonal;

/** Expone el CRUD REST de tipos de personal en /api/tipos-personal. */
@RestController
@RequestMapping("/api/tipos-personal")
public class TipoPersonalController extends CrudController<TipoPersonal, Integer> {
    public TipoPersonalController(TipoPersonalService service) { super(service); }
}
