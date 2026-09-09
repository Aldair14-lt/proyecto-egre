package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

/** Representa un modelo perteneciente a una marca. */
@Entity
@Table(name = "modelo")
public class Modelo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelo") private Integer idModelo;
    @Column(name = "id_marca", nullable = false) private Integer idMarca;
    @Column(name = "nombre_modelo", nullable = false) private String nombreModelo;
    @Column(name = "descripcion") private String descripcion;

    public Modelo() { }
    public Integer getIdModelo() { return idModelo; }
    public void setIdModelo(Integer idModelo) { this.idModelo = idModelo; }
    public Integer getIdMarca() { return idMarca; }
    public void setIdMarca(Integer idMarca) { this.idMarca = idMarca; }
    public String getNombreModelo() { return nombreModelo; }
    public void setNombreModelo(String nombreModelo) { this.nombreModelo = nombreModelo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
