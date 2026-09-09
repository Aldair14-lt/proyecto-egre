package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.AsignacionEquipo;

/** Acceso CRUD a las asignaciones de equipos. */
public interface AsignacionEquipoRepository extends JpaRepository<AsignacionEquipo, Integer> { }
