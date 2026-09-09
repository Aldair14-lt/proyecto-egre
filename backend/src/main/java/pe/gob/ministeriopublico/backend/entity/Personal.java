package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

/** Representa a una persona y su tipo de personal. */
@Entity
@Table(name = "personal")
public class Personal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personal") private Integer idPersonal;
    @Column(name = "id_tipo_personal", nullable = false) private Integer idTipoPersonal;
    @Column(name = "dni", unique = true) private String dni;
    @Column(name = "nombres") private String nombres;
    @Column(name = "apellido_paterno") private String apellidoPaterno;
    @Column(name = "apellido_materno") private String apellidoMaterno;
    @Column(name = "correo") private String correo;
    @Column(name = "telefono") private String telefono;

    public Personal() { }
    public Integer getIdPersonal() { return idPersonal; }
    public void setIdPersonal(Integer idPersonal) { this.idPersonal = idPersonal; }
    public Integer getIdTipoPersonal() { return idTipoPersonal; }
    public void setIdTipoPersonal(Integer idTipoPersonal) { this.idTipoPersonal = idTipoPersonal; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
    public String getApellidoMaterno() { return apellidoMaterno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
