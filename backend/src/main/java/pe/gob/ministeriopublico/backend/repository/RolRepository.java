package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Rol;

/** Acceso CRUD a los roles del sistema. */
public interface RolRepository extends JpaRepository<Rol, Integer> { }
