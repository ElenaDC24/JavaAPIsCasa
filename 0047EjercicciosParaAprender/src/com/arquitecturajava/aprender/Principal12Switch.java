package com.arquitecturajava.aprender;

public class Principal12Switch {

	public static void main(String[] args) {

		String dia = "viernes";

		switch (dia) {
		case "lunes":
			System.out.println("que pena");
			break;
			
		case "martes":
			System.out.println("vamos avanzando");

			break;
		 
		case "miercoles":
			System.out.println("mitad de semana");

			break;
		
		case "jueves":
			System.out.println("ya estamos terminando");

			break;
		
		case "viernes":
			System.out.println("la semana termino");

			break;
			

		default:
			System.out.println("es fin de semana");
			break;
		}
	}
		}

