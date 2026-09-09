package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

/** Representa una sede asociada a un distrito fiscal. */
@Entity
@Table(name = "sede")
public class Sede {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sede") private Integer idSede;
    @Column(name = "id_distrito_fiscal", nullable = false) private Integer idDistritoFiscal;
    @Column(name = "nombre_sede", nullable = false) private String nombreSede;
    @Column(name = "direccion") private String direccion;

    public Sede() { }
    public Integer getIdSede() { return idSede; }
    public void setIdSede(Integer idSede) { this.idSede = idSede; }
    public Integer getIdDistritoFiscal() { return idDistritoFiscal; }
    public void setIdDistritoFiscal(Integer idDistritoFiscal) { this.idDistritoFiscal = idDistritoFiscal; }
    public String getNombreSede() { return nombreSede; }
    public void setNombreSede(String nombreSede) { this.nombreSede = nombreSede; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}
