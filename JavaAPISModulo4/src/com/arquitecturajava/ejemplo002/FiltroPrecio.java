package com.arquitecturajava.ejemplo002;

public class FiltroPrecio implements FiltroLibros {

	@Override
	public boolean test(Libro l) {
		
		return l.getPrecio()>15;
		
	}

	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}
		
}


