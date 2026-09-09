package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Identificando una entidad
@Entity
// Especificando la tabla
@Table(name = "estado_equipo")
public class EstadoEquipo {

	// Identificando los atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estado_equipo")
	private Integer idEstadoEquipo;

	@Column(name = "nombre_estado")
	private String nombreEstado;

	@Column(name = "descripcion")
	private String descripcion;

	// Constructor vacio
	public EstadoEquipo() {
	}

	// Constructor con parametros
	public EstadoEquipo(String nombreEstado, String descripcion) {
		this.nombreEstado = nombreEstado;
		this.descripcion = descripcion;
	}

	// Metodos
	public Integer getIdEstadoEquipo() {
		return idEstadoEquipo;
	}

	public void setIdEstadoEquipo(Integer idEstadoEquipo) {
		this.idEstadoEquipo = idEstadoEquipo;
	}

	public String getNombreEstado() {
		return nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
