package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.UsuarioRol;

/** Acceso CRUD a la relacion entre usuarios y roles. */
public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, Integer> { }
