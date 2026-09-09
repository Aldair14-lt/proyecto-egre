package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Personal;
import pe.gob.ministeriopublico.backend.repository.PersonalRepository;

/** Contiene la logica de negocio del personal. */
@Service
public class PersonalService extends CrudService<Personal, Integer> {
    public PersonalService(PersonalRepository repository) { super(repository); }
}
