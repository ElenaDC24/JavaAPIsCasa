package com.arquitecturajava.ejemplo004;

import java.util.ArrayList;
import java.util.List;

public class CajaProducto <T extends Producto> extends Caja<T>{
	
	List<T> lista= new ArrayList<T>();
	private int tope;
	
	
	
	public CajaProducto(int tope) {
		super();
		this.tope = tope;
	}

	public void borrar(T elemento) {
		
		lista.remove (elemento);
	}

	public List<T> getLista() {
		return lista;
	}

	public void setLista(List<T> lista) {
		this.lista = lista;
	}

	//el de precio total porque solo se puede aplicar a productos
	public double precioTotal() {
		double total=0;
		for (T mitipo: lista) {
			total=total+mitipo.getPrecio();
		}
		return total;
	}
}
