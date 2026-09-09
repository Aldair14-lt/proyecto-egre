package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.ModeloService;
import pe.gob.ministeriopublico.backend.entity.Modelo;

/** Expone el CRUD REST de modelos en /api/modelos. */
@RestController
@RequestMapping("/api/modelos")
public class ModeloController extends CrudController<Modelo, Integer> {
    public ModeloController(ModeloService service) { super(service); }
}
