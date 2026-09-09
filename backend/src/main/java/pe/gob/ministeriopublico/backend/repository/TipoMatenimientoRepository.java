package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.TipoMatenimiento;

/** Acceso CRUD a los tipos de mantenimiento. */
public interface TipoMatenimientoRepository extends JpaRepository<TipoMatenimiento, Integer> { }
