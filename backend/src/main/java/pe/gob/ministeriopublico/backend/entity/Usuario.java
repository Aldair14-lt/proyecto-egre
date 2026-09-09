package pe.gob.ministeriopublico.backend.entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;

/** Representa una cuenta de usuario del sistema. */
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario") private Integer idUsuario;
    @Column(name = "usuario", nullable = false, unique = true) private String usuario;
    @Column(name = "contrasena", nullable = false) private String contrasena;
    @Column(name = "nombre_completo", nullable = false) private String nombreCompleto;
    @Column(name = "correo_electronico") private String correoElectronico;
    @Column(name = "estado") private String estado;
    @Column(name = "fecha_creacion") private LocalDateTime fechaCreacion;

    public Usuario() { }
    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }
    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public LocalDateTime getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(LocalDateTime fechaCreacion) { this.fechaCreacion = fechaCreacion; }
}
