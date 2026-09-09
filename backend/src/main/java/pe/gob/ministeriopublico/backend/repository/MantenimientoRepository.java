package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Mantenimiento;

/** Acceso CRUD al historial de mantenimientos. */
public interface MantenimientoRepository extends JpaRepository<Mantenimiento, Integer> { }
