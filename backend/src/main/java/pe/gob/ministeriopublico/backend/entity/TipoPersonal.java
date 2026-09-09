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
@Table(name = "tipo_personal")
public class TipoPersonal {

	// Identificando los atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_personal")
	private Integer idTipoPersonal;

	@Column(name = "nombre_tipo_personal")
	private String nombreTipoPersonal;

	@Column(name = "descripcion")
	private String descripcion;

	// Constructor vacio
	public TipoPersonal() {
	}

	// Constructor con parametros
	public TipoPersonal(String nombreTipoPersonal, String descripcion) {
		this.nombreTipoPersonal = nombreTipoPersonal;
		this.descripcion = descripcion;
	}

	// Metodos
	public Integer getIdTipoPersonal() {
		return idTipoPersonal;
	}

	public void setIdTipoPersonal(Integer idTipoPersonal) {
		this.idTipoPersonal = idTipoPersonal;
	}

	public String getNombreTipoPersonal() {
		return nombreTipoPersonal;
	}

	public void setNombreTipoPersonal(String nombreTipoPersonal) {
		this.nombreTipoPersonal = nombreTipoPersonal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
