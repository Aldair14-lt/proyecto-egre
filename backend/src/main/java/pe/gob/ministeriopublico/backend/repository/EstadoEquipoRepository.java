package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.EstadoEquipo;

/** Acceso CRUD a los estados de los equipos. */
public interface EstadoEquipoRepository extends JpaRepository<EstadoEquipo, Integer> { }
