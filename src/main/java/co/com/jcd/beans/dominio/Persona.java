package co.com.jcd.beans.dominio;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_persona")
	private Integer idPersona;

	@Column(name="apellido_paterno")
	private String apellidoPaterno;

	private String nombre;

	public Persona() {
	}

	public Persona(String apellidoPaterno, String nombre) {
		super();
		this.apellidoPaterno = apellidoPaterno;
		this.nombre = nombre;
	}	

	public Persona(Integer idPersona, String apellidoPaterno, String nombre) {
		super();
		this.idPersona = idPersona;
		this.apellidoPaterno = apellidoPaterno;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", apellidoPaterno=" + apellidoPaterno + ", nombre=" + nombre + "]";
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}