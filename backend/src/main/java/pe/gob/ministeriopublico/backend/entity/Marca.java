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

// Identificando una entidad
@Entity
// Especificando la tabla
@Table(name = "marca")
public class Marca {

	// Identificando los atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_marca")
	private Integer idMarca;

	@Column(name = "nombre_marca")
	private String nombreMarca;

	@OneToMany(mappedBy = "marca")
	@JsonIgnore
	private List<Modelo> modelos = new ArrayList<>();

	// Constructor vacio
	public Marca() {
	}

	// Constructor con parametros
	public Marca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	// Metodos
	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}
}
