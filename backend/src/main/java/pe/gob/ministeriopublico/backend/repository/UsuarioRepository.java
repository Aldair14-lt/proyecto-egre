package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Usuario;

/** Acceso CRUD a las cuentas de usuario. */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> { }
