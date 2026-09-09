package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Despacho;

/** Acceso CRUD a los despachos. */
public interface DespachoRepository extends JpaRepository<Despacho, Integer> { }
