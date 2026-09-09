package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Marca;
import pe.gob.ministeriopublico.backend.repository.MarcaRepository;

/** Contiene la logica de negocio de las marcas. */
@Service
public class MarcaService extends CrudService<Marca, Integer> {
    public MarcaService(MarcaRepository repository) { super(repository); }
}
