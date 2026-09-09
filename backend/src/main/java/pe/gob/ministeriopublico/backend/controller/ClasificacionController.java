package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.gob.ministeriopublico.backend.Service.ClasificacionService;
import pe.gob.ministeriopublico.backend.entity.Clasificacion;

/** Expone el CRUD REST de clasificaciones en /api/clasificaciones. */
@RestController
@RequestMapping("/api/clasificaciones")
public class ClasificacionController extends CrudController<Clasificacion, Integer> {
    public ClasificacionController(ClasificacionService service) { super(service); }
}
