package pe.gob.ministeriopublico.backend.entity;

import java.time.*;
import jakarta.persistence.*;

/** Representa un equipo registrado en el inventario. */
@Entity
@Table(name = "equipo")
public class Equipo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo") private Integer idEquipo;
    @Column(name = "id_modelo", nullable = false) private Integer idModelo;
    @Column(name = "id_clasificacion", nullable = false) private Integer idClasificacion;
    @Column(name = "id_estado_equipo", nullable = false) private Integer idEstadoEquipo;
    @Column(name = "codigo_patrimonial", nullable = false, unique = true) private String codigoPatrimonial;
    @Column(name = "numero_serie", unique = true) private String numeroSerie;
    @Column(name = "observacion") private String observacion;
    @Column(name = "fecha_adquisicion") private LocalDate fechaAdquisicion;
    @Column(name = "fecha_registro") private LocalDateTime fechaRegistro;

    public Equipo() { }
    public Integer getIdEquipo() { return idEquipo; }
    public void setIdEquipo(Integer idEquipo) { this.idEquipo = idEquipo; }
    public Integer getIdModelo() { return idModelo; }
    public void setIdModelo(Integer idModelo) { this.idModelo = idModelo; }
    public Integer getIdClasificacion() { return idClasificacion; }
    public void setIdClasificacion(Integer idClasificacion) { this.idClasificacion = idClasificacion; }
    public Integer getIdEstadoEquipo() { return idEstadoEquipo; }
    public void setIdEstadoEquipo(Integer idEstadoEquipo) { this.idEstadoEquipo = idEstadoEquipo; }
    public String getCodigoPatrimonial() { return codigoPatrimonial; }
    public void setCodigoPatrimonial(String codigoPatrimonial) { this.codigoPatrimonial = codigoPatrimonial; }
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }
    public LocalDate getFechaAdquisicion() { return fechaAdquisicion; }
    public void setFechaAdquisicion(LocalDate fechaAdquisicion) { this.fechaAdquisicion = fechaAdquisicion; }
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}
