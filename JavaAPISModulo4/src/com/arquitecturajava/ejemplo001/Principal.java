package com.arquitecturajava.ejemplo001;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.arquitecturajava.ejemplo002.FiltroLibros;
import com.arquitecturajava.ejemplo002.FiltroPaginas;
import com.arquitecturajava.ejemplo002.FiltroPrecio;

public class Principal {

	public static void main(String[] args) {
		

		Libro l1= new Libro("El juego del ender",400, "ciencia ficcion",20);
		Libro l2= new Libro("Harry Potter y el caliz de fuego",600, "fantasia",25);
		Libro l3= new Libro("Las hijas del frio",300, "novela negra",15);
		Libro l4= new Libro("Los pilares de la tierra",1000, "historica",30);
		
		List<Libro> milista=Arrays.asList(l1,l2,l3,l4);
		
		//diseñar algun metodo de filtrado
		List<Libro> listaFiltro= new ArrayList<Libro>();
		
		
		//filtroPrecio(milista, listaFiltro);
		//filtroPaginas(milista, listaFiltro);
		
		//filtro(milista,listaFiltro, new FiltroPrecio());
		filtro(milista,listaFiltro,new FiltroPaginas());
		mostrarLibros(listaFiltro);
		//mostrarLibros(milista);
		
	}
    //mas general y mas flexible apoyandonos en los interfaces
	//tiene menos codigo repetido
	private static void filtro(List<Libro> milista, List<Libro> listaFiltro, FiltroLibros f) {
		//mas general
		for(Libro l:milista) {
			
			if (f.test()) {
				
				listaFiltro.add(l);
			}
		}
	}
	
//	//practicamente identicos
//	private static void filtroPrecio(List<Libro> milista, List<Libro> listaFiltro) {
//		for(Libro l:milista) {
//			
//			if (l.getPrecio()>15) {
//				
//				listaFiltro.add(l);
//			}
//		}
//	}
//
//	private static void filtroPaginas(List<Libro> milista, List<Libro> listaFiltro) {
//		for (Libro l:milista) {
//		
//			if (l.getPaginas()>400) {
//				listaFiltro.add(l);
//			}
//		}
//	}
		
		private static void mostrarLibros(List<Libro>milista) {
		for(Libro l:milista) {
			System.out.println(l.getTitulo());
		}
		
	}

}
