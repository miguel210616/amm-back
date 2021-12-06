/**
 * 
 */
package com.tecsup.ammApi.persistence.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;
/**
 * @author miguel
 *
 */
@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	private String id;
	@NotNull
	private String nombres;
	@NotNull
	private String apellidos;
	@NotNull
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	@NotNull
	private Integer dni;
	@NotNull
	private boolean vacunado;
	@Column(name="nombre_vacuna")
	private String nombreVacuna;
	@Column(name="lugar_vacunacion")
	private String lugarVacunacion;
	@Column(name="nombre_enfermera")
	private String nombreEnfermera;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public boolean isVacuando() {
		return vacunado;
	}

	public void setVacuando(boolean vacuando) {
		this.vacunado = vacuando;
	}

	public String getNombreVacuna() {
		return nombreVacuna;
	}

	public void setNombreVacuna(String nombreVacuna) {
		this.nombreVacuna = nombreVacuna;
	}

	public String getLugarVacunacion() {
		return lugarVacunacion;
	}

	public void setLugarVacunacion(String lugarVacunacion) {
		this.lugarVacunacion = lugarVacunacion;
	}

	public String getNombreEnfermera() {
		return nombreEnfermera;
	}

	public void setNombreEnfermera(String nombreEnfermera) {
		this.nombreEnfermera = nombreEnfermera;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", dni=" + dni + ", vacuando=" + vacunado + ", nombreVacuna=" + nombreVacuna
				+ ", lugarVacunacion=" + lugarVacunacion + ", nombreEnfermera=" + nombreEnfermera + "]";
	}

}
