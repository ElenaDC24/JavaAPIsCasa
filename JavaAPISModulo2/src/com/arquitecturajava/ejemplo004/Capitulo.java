package com.arquitecturajava.ejemplo004;

import java.util.Objects;

public class Capitulo {


		private String titulo;
		//metodos para revisar la igualdad
		@Override
		public int hashCode() {
			return Objects.hash(paginas, titulo);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Capitulo other = (Capitulo) obj;
			return paginas == other.paginas && Objects.equals(titulo, other.titulo);
		}
		public Capitulo(String titulo, int paginas) {
			super();
			this.titulo = titulo;
			this.paginas = paginas;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getPaginas() {
			return paginas;
		}
		public void setPaginas(int paginas) {
			this.paginas = paginas;
		}
		private int paginas;
		
		

	}


