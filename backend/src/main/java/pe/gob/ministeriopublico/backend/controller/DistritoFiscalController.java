package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.DistritoFiscalService;
import pe.gob.ministeriopublico.backend.entity.DistritoFiscal;

/** Expone el CRUD REST de distritos en /api/distritos-fiscales. */
@RestController
@RequestMapping("/api/distritos-fiscales")
public class DistritoFiscalController extends CrudController<DistritoFiscal, Integer> {
    public DistritoFiscalController(DistritoFiscalService service) { super(service); }
}
