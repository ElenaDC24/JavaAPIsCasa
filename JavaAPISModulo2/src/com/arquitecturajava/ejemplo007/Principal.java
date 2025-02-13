package com.arquitecturajava.ejemplo007;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.arquitecturajava.ejemplo006.Persona;

public class Principal {

	public static void main(String[] args) {
		
		// hashset es un conjunto sin oredenar
		//Set<String> conjunto = new HashSet<String>();
		Set<String> conjunto = new TreeSet<String>();
		
		Persona p1=new Persona("pepe","perez","madrid");
		Persona p2=new Persona("ana","gomez","barcelona");
		Persona p3=new Persona("juan","sanchez","bilbao");
		
		//olvidar que salga en el mismo orden que lo insertamos
		conjunto.add("hola");
		conjunto.add("que");
		conjunto.add("tal");
		conjunto.add("estas");
		conjunto.add("amigo");
		
		for (String texto:conjunto) {
			System.out.println(texto);
		}
}
}