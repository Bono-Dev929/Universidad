package test;

import modelo.*;

public class TestIncaa {

	public static void main(String[] args) {
		
		//creando Generos
		Genero accion= new Genero(0, "Accion");
		Genero comedia= new Genero(1, "Comedia");
		Genero fantasia= new Genero(2, "Fantasia");
		
		//Creando los nombres de las peliculas
		String p1 = "Harry Potter 1";
		String p2 = "Harry Potter 2";
		String p3 = "Piratas del caribe: 1";
		String p4 = "Harry  El principe";
		String p5 = "Piratas del caribe: 2";
		String p6 = "Piratas a bordo";
		String p7 = "Cuidado , Piratas";
		
		//creando incaas
		Incaa inca = new Incaa();
		Incaa catalogoAux = new Incaa();//inca auxiliar
		
		//agregando peliculas
		System.out.println("Agregando Peliculas:");
		System.out.println(inca.agregarPelicula(p1,fantasia));
		System.out.println(inca.agregarPelicula(p2,fantasia));
		System.out.println(inca.agregarPelicula(p3,fantasia));
		System.out.println(inca.agregarPelicula(p4,accion));
		System.out.println(inca.agregarPelicula(p5,fantasia));
		System.out.println(inca.agregarPelicula(p6,comedia));
		System.out.println(inca.agregarPelicula(p7,comedia));
		
		//Guardando las peliculas que compartan parte del nombre
		catalogoAux.setCatalogo(inca.traerPelicula("Piratas"));
		
		//trayendo pelis segun el indice
		System.out.println("\nTrayendo pelicula por su indice");
		System.out.println("Indice 4: "+inca.traerPelicula(4));
		System.out.println("Indice 10: "+inca.traerPelicula(10));
		
		
		System.out.println("\nMostrando lista de peliculas");
		System.out.println(inca.toString());
		
		System.out.println("\nTrayendo peliculas que conpartan una parte del nombre");
		System.out.println(catalogoAux.toString());
		
		try {
			
			System.out.println("Modificando Pelicula con id 3");
			inca.modificarPelicula(3, "El senior de los anillos",fantasia);
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		System.out.println("\nMostrando lista de peliculas");
		System.out.println(inca.toString());
		
		try {
			
			System.out.println("Eliminando Pelicula con id 3");
			inca.eliminaPelicula(3);
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		
		System.out.println("\nMostrando lista de peliculas");
		System.out.println(inca.toString());
		/*
		catalogoAux.setCatalogo(inca.traerPelicula(accion));
		System.out.println("Peliculas de accion:");
		System.out.println(catalogoAux.toString());
		
		catalogoAux.setCatalogo(inca.traerPelicula(comedia));
		System.out.println("Peliculas de comedia:");
		System.out.println(catalogoAux.toString());
		
		catalogoAux.setCatalogo(inca.traerPelicula(fantasia));
		System.out.println("Peliculas de fantasia:");
		System.out.println(catalogoAux.toString());*/
		
		System.out.println("Indice 3: "+inca.traerPelicula(3));
		
		
		
		
		
		
		
	}

}
