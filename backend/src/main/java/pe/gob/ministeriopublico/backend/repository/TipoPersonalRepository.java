package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.TipoPersonal;

/** Acceso CRUD a los tipos de personal. */
public interface TipoPersonalRepository extends JpaRepository<TipoPersonal, Integer> { }
