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
@Table(name = "tipo_mantenimiento")
public class TipoMatenimiento {

	// Identificando los atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_mantenimiento")
	private Integer idTipoMantenimiento;

	@Column(name = "nombre_tipo")
	private String nombreTipo;

	@Column(name = "descripcion")
	private String descripcion;

	@OneToMany(mappedBy = "tipoMantenimiento")
	@JsonIgnore
	private List<Mantenimiento> mantenimientos = new ArrayList<>();

	// Constructor vacio
	public TipoMatenimiento() {
	}

	// Constructor con parametros
	public TipoMatenimiento(String nombreTipo, String descripcion) {
		this.nombreTipo = nombreTipo;
		this.descripcion = descripcion;
	}

	// Metodos
	public Integer getIdTipoMantenimiento() {
		return idTipoMantenimiento;
	}

	public void setIdTipoMantenimiento(Integer idTipoMantenimiento) {
		this.idTipoMantenimiento = idTipoMantenimiento;
	}

	public String getNombreTipo() {
		return nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Mantenimiento> getMantenimientos() {
		return mantenimientos;
	}

	public void setMantenimientos(List<Mantenimiento> mantenimientos) {
		this.mantenimientos = mantenimientos;
	}
}
