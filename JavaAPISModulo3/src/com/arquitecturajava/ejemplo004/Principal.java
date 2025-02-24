package com.arquitecturajava.ejemplo004;

public class Principal {

	public static void main(String[] args) {
	
		Galleta g1= new Galleta("chocolate",0.1);
		Galleta g2= new Galleta("vainilla",0.1);
		Galleta g3= new Galleta("fresa",0.2);
		
		CajaProducto<Galleta> cajaGalletas= new CajaProducto<Galleta>(2);
		
		cajaGalletas.add(g1);
		cajaGalletas.add(g2);	
		//no se insertaba porque no cabía
		cajaGalletas.add(g3);
		
		System.out.println(cajaGalletas.precioTotal());
	}

}
