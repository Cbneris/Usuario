package com.cbns.examen.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TT_USUARIO")
public class UsuarioDAO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -465669422247574185L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario")
	private Long idusuario;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "correo")
	private String correo;

	@Column(name = "fec_nacimiento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fec_nacimiento;

	public UsuarioDAO() {
		super();
	}

	public UsuarioDAO(Long idusuario, String nombre, String apellido, String correo, Date fec_nacimiento) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.fec_nacimiento = fec_nacimiento;
	}

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFec_nacimiento() {
		return fec_nacimiento;
	}

	public void setFec_nacimiento(Date fec_nacimiento) {
		this.fec_nacimiento = fec_nacimiento;
	}
	
}
