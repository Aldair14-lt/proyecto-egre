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
@Table(name = "rol")
public class Rol {

	// Identificando los atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol")
	private Integer idRol;

	@Column(name = "nombre_rol")
	private String nombreRol;

	@OneToMany(mappedBy = "rol")
	@JsonIgnore
	private List<UsuarioRol> usuariosRoles = new ArrayList<>();

	// Constructor vacio
	public Rol() {
	}

	// Constructor con parametros
	public Rol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	// Metodos
	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public List<UsuarioRol> getUsuariosRoles() {
		return usuariosRoles;
	}

	public void setUsuariosRoles(List<UsuarioRol> usuariosRoles) {
		this.usuariosRoles = usuariosRoles;
	}
}
