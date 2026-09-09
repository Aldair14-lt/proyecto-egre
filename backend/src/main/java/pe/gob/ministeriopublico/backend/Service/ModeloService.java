package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Modelo;
import pe.gob.ministeriopublico.backend.repository.ModeloRepository;

/** Contiene la logica de negocio de los modelos. */
@Service
public class ModeloService extends CrudService<Modelo, Integer> {
    public ModeloService(ModeloRepository repository) { super(repository); }
}
