package pe.gob.ministeriopublico.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/** Representa un modelo perteneciente a una marca. */
@Entity
@Table(name = "modelo")
public class Modelo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelo") private Integer idModelo;
    @Column(name = "id_marca", nullable = false) private Integer idMarca;
    @Column(name = "nombre_modelo", nullable = false) private String nombreModelo;
    @Column(name = "descripcion") private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_marca", insertable = false, updatable = false)
    private Marca marca;

    @OneToMany(mappedBy = "modelo")
    @JsonIgnore
    private List<Equipo> equipos = new ArrayList<>();

    public Modelo() { }
    public Integer getIdModelo() { return idModelo; }
    public void setIdModelo(Integer idModelo) { this.idModelo = idModelo; }
    public Integer getIdMarca() { return idMarca; }
    public void setIdMarca(Integer idMarca) { this.idMarca = idMarca; }
    public String getNombreModelo() { return nombreModelo; }
    public void setNombreModelo(String nombreModelo) { this.nombreModelo = nombreModelo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Marca getMarca() { return marca; }
    public void setMarca(Marca marca) { this.marca = marca; }
    public List<Equipo> getEquipos() { return equipos; }
    public void setEquipos(List<Equipo> equipos) { this.equipos = equipos; }
}
