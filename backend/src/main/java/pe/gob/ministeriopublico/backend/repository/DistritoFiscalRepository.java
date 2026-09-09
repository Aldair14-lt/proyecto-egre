package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.DistritoFiscal;

/** Acceso CRUD a la tabla de distritos fiscales. */
public interface DistritoFiscalRepository extends JpaRepository<DistritoFiscal, Integer> { }
