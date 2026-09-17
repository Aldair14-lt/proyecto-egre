package pe.gob.ministeriopublico.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

//identificanco un Entidad
@Entity
//especificando la tabla
@Table(name="distrito_fiscal")

// mencionado la clase
public class DistritoFiscal {

//idetificando los atributos

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id_distrito_fiscal")
private Integer idDistritoFiscal;

@Column(name="nombre_distrito")
private String nombreDistrito;

@OneToMany(mappedBy = "distritoFiscal")
@JsonIgnore
private List<Sede> sedes = new ArrayList<>();

//constructor vacio 
public DistritoFiscal(){

}
//constructor con  parametros
public DistritoFiscal(String nombreDistrito){


    this.nombreDistrito=nombreDistrito;
}

// metodos 

public Integer getIdDistritoFiscal() {
    return idDistritoFiscal;
}
public void setIdDistritoFiscal(Integer idDistritoFiscal) {
    this.idDistritoFiscal = idDistritoFiscal;
}
public String getNombreDistrito() {
    return nombreDistrito;
}
public void setNombreDistrito(String nombreDistrito) {
    this.nombreDistrito = nombreDistrito;
}

public List<Sede> getSedes() {
    return sedes;
}

public void setSedes(List<Sede> sedes) {
    this.sedes = sedes;
}





}
