package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

/** Representa la relacion entre un usuario y un rol. */
@Entity
@Table(name = "usuario_rol", uniqueConstraints = @UniqueConstraint(columnNames = {"id_usuario", "id_rol"}))
public class UsuarioRol {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_rol") private Integer idUsuarioRol;
    @Column(name = "id_usuario", nullable = false) private Integer idUsuario;
    @Column(name = "id_rol", nullable = false) private Integer idRol;

    public UsuarioRol() { }
    public Integer getIdUsuarioRol() { return idUsuarioRol; }
    public void setIdUsuarioRol(Integer idUsuarioRol) { this.idUsuarioRol = idUsuarioRol; }
    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }
    public Integer getIdRol() { return idRol; }
    public void setIdRol(Integer idRol) { this.idRol = idRol; }
}
