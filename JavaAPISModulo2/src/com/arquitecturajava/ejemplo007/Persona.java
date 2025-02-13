package com.arquitecturajava.ejemplo007;

import java.util.Objects;

public class Persona implements Comparable{

	
	private String nombre;
	private String apellidos;
	private String ciudad;
	
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Persona(String nombre, String apellidos, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
	}


	

	
	//dos personas con el mismo nombre tienen mismo hash
	//no implica que dos personas con distinto nombre tengan distinto hash
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Object p) {
		//casting
		Persona personaParametro=(Persona)p;
		return this.getApellidos().compareTo(personaParametro.getApellidos());
		
	}

}
