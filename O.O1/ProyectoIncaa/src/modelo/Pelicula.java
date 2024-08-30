package modelo;

import modelo.Genero;

public class Pelicula {
	
	//atributos
	private int idPelicula;
	private String pelicula;
	private Genero genero;
	
	//Constructor
	public Pelicula(int idPelicula, String pelicula, Genero genero) {
		super();
		this.idPelicula = idPelicula;
		this.pelicula = pelicula;
		this.genero = genero;
	}
	

	//accesores
	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
		
	@Override
	public String toString() {
		return "[IdPelicula: "+idPelicula+", Nombre: "+pelicula+"]"+genero.toString();
	}
	
	
	public boolean equals(Pelicula p) {
		return idPelicula == p.getIdPelicula() && pelicula.equalsIgnoreCase(p.getPelicula()) && genero.equals(p.getGenero());
	}
	
	
}
