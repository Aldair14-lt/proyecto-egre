package pe.gob.ministeriopublico.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/** Representa un despacho ubicado dentro de una sede. */
@Entity
@Table(name = "despacho")
public class Despacho {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_despacho") private Integer idDespacho;
    @Column(name = "id_sede", nullable = false) private Integer idSede;
    @Column(name = "nombre_despacho", nullable = false) private String nombreDespacho;
    @Column(name = "tipo_proceso") private String tipoProceso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sede", insertable = false, updatable = false)
    private Sede sede;

    @OneToMany(mappedBy = "despacho")
    @JsonIgnore
    private List<AsignacionEquipo> asignaciones = new ArrayList<>();

    public Despacho() { }
    public Integer getIdDespacho() { return idDespacho; }
    public void setIdDespacho(Integer idDespacho) { this.idDespacho = idDespacho; }
    public Integer getIdSede() { return idSede; }
    public void setIdSede(Integer idSede) { this.idSede = idSede; }
    public String getNombreDespacho() { return nombreDespacho; }
    public void setNombreDespacho(String nombreDespacho) { this.nombreDespacho = nombreDespacho; }
    public String getTipoProceso() { return tipoProceso; }
    public void setTipoProceso(String tipoProceso) { this.tipoProceso = tipoProceso; }
    public Sede getSede() { return sede; }
    public void setSede(Sede sede) { this.sede = sede; }
    public List<AsignacionEquipo> getAsignaciones() { return asignaciones; }
    public void setAsignaciones(List<AsignacionEquipo> asignaciones) { this.asignaciones = asignaciones; }
}
