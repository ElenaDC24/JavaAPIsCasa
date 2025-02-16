package com.arquitecturajava.ejemplo002;

import java.util.Objects;

public class Galleta {

	private String sabor;
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	
}
	
	
	public Galleta (String sabor) {
		super();
		this.sabor = sabor;
}

	//@Override
	public int hashCode() {
		return Objects.hash(sabor);
	}

	//@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Galleta other = (Galleta) obj;
		return Objects.equals(sabor, other.sabor);
	}

}