package pe.gob.ministeriopublico.backend.Service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/** Centraliza las operaciones CRUD reutilizadas por cada servicio de dominio. */
public abstract class CrudService<T, ID> {
    private final JpaRepository<T, ID> repository;

    protected CrudService(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    /** Devuelve todos los registros de la tabla. */
    public List<T> listar() { return repository.findAll(); }

    /** Busca un registro por su clave primaria. */
    public T buscarPorId(ID id) { return repository.findById(id).orElse(null); }

    /** Inserta un registro o actualiza uno existente. */
    public T guardar(T entity) { return repository.save(entity); }

    /** Elimina un registro por su clave primaria. */
    public void eliminar(ID id) { repository.deleteById(id); }
}
