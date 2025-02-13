package com.arquitecturajava.ejemplo007;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		// hashset es un conjunto sin oredenar
		//Set<String> conjunto = new HashSet<String>();
		Set<String> conjunto = new TreeSet<String>();
		
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