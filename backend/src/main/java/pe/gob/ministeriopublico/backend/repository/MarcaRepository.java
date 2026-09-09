package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Marca;

/** Acceso CRUD a la tabla de marcas. */
public interface MarcaRepository extends JpaRepository<Marca, Integer> { }
