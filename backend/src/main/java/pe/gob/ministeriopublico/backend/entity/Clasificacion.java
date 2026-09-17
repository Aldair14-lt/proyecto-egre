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
@Table(name = "clasificacion")
public class Clasificacion {

	// Identificando los atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_clasificacion")
	private Integer idClasificacion;

	@Column(name = "nombre_clasificacion")
	private String nombreClasificacion;

	@Column(name = "descripcion")
	private String descripcion;

	@OneToMany(mappedBy = "clasificacion")
	@JsonIgnore
	private List<Equipo> equipos = new ArrayList<>();

	// Constructor vacio
	public Clasificacion() {
	}

	// Constructor con parametros
	public Clasificacion(String nombreClasificacion, String descripcion) {
		this.nombreClasificacion = nombreClasificacion;
		this.descripcion = descripcion;
	}

	// Metodos
	public Integer getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(Integer idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getNombreClasificacion() {
		return nombreClasificacion;
	}

	public void setNombreClasificacion(String nombreClasificacion) {
		this.nombreClasificacion = nombreClasificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
}
