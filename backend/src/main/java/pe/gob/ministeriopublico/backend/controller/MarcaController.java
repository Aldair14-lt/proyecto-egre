package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.MarcaService;
import pe.gob.ministeriopublico.backend.entity.Marca;

/** Expone el CRUD REST de marcas en /api/marcas. */
@RestController
@RequestMapping("/api/marcas")
public class MarcaController extends CrudController<Marca, Integer> {
    public MarcaController(MarcaService service) { super(service); }
}
