package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Sede;

/** Acceso CRUD a las sedes. */
public interface SedeRepository extends JpaRepository<Sede, Integer> { }
