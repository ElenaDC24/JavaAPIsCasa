package com.arquitecturajava.bucles;

public class Principal06Anidamiento {

	public static void main(String[] args) {
		
		for (int i=0; i<5;i++) {
			System.out.println(i);
			for (int j=0;j<5;j++) {
				System.out.println("  "+j);
			}
		}

	}

}
