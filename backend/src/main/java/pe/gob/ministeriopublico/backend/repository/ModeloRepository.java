package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Modelo;

/** Acceso CRUD a los modelos de equipos. */
public interface ModeloRepository extends JpaRepository<Modelo, Integer> { }
