package com.pruebanttdata.samir.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {
	
	
	private static final long serialVersionUID = -8176021673668731848L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="CedulaDeCiudadania",nullable=false)
	private Long CeduladeCiudadania;

	
	@Column(name="PrimerNombre",length=50,nullable=false)
	private String primerNombre;
	@Column(name="SegundoNombre",nullable=false,length=50)
	private String segundoNombre;
	@Column(name="PrimerApellido",nullable=false,length=50)
	private String primerApellido;
	@Column(name="SegundoApellido",nullable=false,length=50)
	private String segundoApellido;
	@Column(name="Telefono",nullable=false)
	private Long telefono;
	@Column(name="Direccion",nullable=false,length=50)
	private String direccion;
	@Column(name="CiudadDeResidencia",nullable=false,length=50)
	private String ciudadResidencia;
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudadResidencia() {
		return ciudadResidencia;
	}
	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCeduladeCiudadania() {
		return CeduladeCiudadania;
	}
	public void setCeduladeCiudadania(Long ceduladeCiudadania) {
		CeduladeCiudadania = ceduladeCiudadania;
	}
	
	
	
	

}
