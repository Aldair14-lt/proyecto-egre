package pe.gob.ministeriopublico.backend.Service;

import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Mantenimiento;
import pe.gob.ministeriopublico.backend.repository.MantenimientoRepository;

/** Contiene la logica de negocio del historial de mantenimientos. */
@Service
public class MantenimientoService extends CrudService<Mantenimiento, Integer> {
    public MantenimientoService(MantenimientoRepository repository) { super(repository); }
}
