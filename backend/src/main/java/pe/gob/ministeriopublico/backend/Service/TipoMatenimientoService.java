package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.TipoMatenimiento;
import pe.gob.ministeriopublico.backend.repository.TipoMatenimientoRepository;

/** Contiene la logica de negocio de los tipos de mantenimiento. */
@Service
public class TipoMatenimientoService extends CrudService<TipoMatenimiento, Integer> {
    public TipoMatenimientoService(TipoMatenimientoRepository repository) { super(repository); }
}
