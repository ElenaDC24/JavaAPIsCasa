package com.arquitecturajava.ejemplo002;

public class Libro {
	private String categoria;
	private int paginas;
	private double precio;
	private String titulo;
	
	
	public Libro(String titulo, int paginas, String categoria, double precio) {
		super();
		this.categoria = categoria;
		this.paginas = paginas;
		this.precio = precio;
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
