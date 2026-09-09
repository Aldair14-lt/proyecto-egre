package pe.gob.ministeriopublico.backend.entity;

import java.time.*;
import jakarta.persistence.*;

/** Representa la asignacion de un equipo a un despacho y personal. */
@Entity
@Table(name = "asignacion_equipo")
public class AsignacionEquipo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignacion") private Integer idAsignacion;
    @Column(name = "id_equipo", nullable = false) private Integer idEquipo;
    @Column(name = "id_despacho", nullable = false) private Integer idDespacho;
    @Column(name = "id_personal", nullable = false) private Integer idPersonal;
    @Column(name = "fecha_inicio", nullable = false) private LocalDate fechaInicio;
    @Column(name = "fecha_fin") private LocalDate fechaFin;
    @Column(name = "observacion") private String observacion;
    @Column(name = "fecha_registro") private LocalDateTime fechaRegistro;

    public AsignacionEquipo() { }
    public Integer getIdAsignacion() { return idAsignacion; }
    public void setIdAsignacion(Integer idAsignacion) { this.idAsignacion = idAsignacion; }
    public Integer getIdEquipo() { return idEquipo; }
    public void setIdEquipo(Integer idEquipo) { this.idEquipo = idEquipo; }
    public Integer getIdDespacho() { return idDespacho; }
    public void setIdDespacho(Integer idDespacho) { this.idDespacho = idDespacho; }
    public Integer getIdPersonal() { return idPersonal; }
    public void setIdPersonal(Integer idPersonal) { this.idPersonal = idPersonal; }
    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }
    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }
    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}
