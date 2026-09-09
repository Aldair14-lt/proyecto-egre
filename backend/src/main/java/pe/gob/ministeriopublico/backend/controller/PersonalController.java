package pe.gob.ministeriopublico.backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.ministeriopublico.backend.Service.PersonalService;
import pe.gob.ministeriopublico.backend.entity.Personal;

/** Expone el CRUD REST de personal en /api/personal. */
@RestController
@RequestMapping("/api/personal")
public class PersonalController extends CrudController<Personal, Integer> {
    public PersonalController(PersonalService service) { super(service); }
}
