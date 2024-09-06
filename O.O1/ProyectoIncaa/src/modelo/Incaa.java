package modelo;

import java.util.ArrayList;
import java.util.List;

public class Incaa {

	//atributos
	List<Pelicula> catalogo;
	List<Genero> generos;

	//constructor
	public Incaa() {
		this.catalogo = new ArrayList<Pelicula>();
		this.generos = new ArrayList<Genero>();
	}
	
	//metodos
	public boolean agregarPelicula(String p,Genero g) {
	
		boolean existe = false,agregada = false;
		int i = 0, id = 1;
		
		while(i < catalogo.size() && !existe) {
			if (catalogo.get(i).getPelicula().equals(p)) {
				existe = true;
			}
			i += 1;
		}
		/*
		 if(traerPelicula(p) != null){
		 	throw new Exception("La pelicula ya existe");
		 }
		  **/
		
		//genero obtenido desde la lista de generos
		
		//si es false = true y si es true = false
		if (!existe) {
			if (catalogo.size() != 0) {
				id = catalogo.get(catalogo.size()-1).getIdPelicula()+1;	
			}
			Pelicula p1 = new Pelicula(id, p, g);
			catalogo.add(p1);
			agregada = true;
		}
		
		return agregada;
	}
	
	public Pelicula traerPelicula(int idPelicula) {
		
		int i =0;
		Pelicula p = null;
		while(i<catalogo.size() && p == null) {
			if(catalogo.get(i).getIdPelicula() == idPelicula) {
				p = catalogo.get(i);
			}
			i +=1;
		}
		
		return p;
	}
	
	public List<Pelicula> traerPelicula(String pName) {
		
		List<Pelicula> listPelis = new ArrayList<>();
		String[] aux;
		
		for (Pelicula p : catalogo) {
			aux = p.getPelicula().split(" ");
			for (String s : aux) {
				if (s.equals(pName)) {
					Pelicula pe = p;
					listPelis.add(pe);
				}
			}
		}
		return listPelis;
	}
	
	public List<Pelicula> traerPelicula(Genero g) {
		
		List<Pelicula> listPelis = new ArrayList<>();
		Genero aux;
		
		for (Pelicula pelicula : catalogo) {
			aux = pelicula.getGenero();
			if (aux.equals(g)) {
				Pelicula p = pelicula;
				listPelis.add(p);
			}
		}
		
		return listPelis;
	}
	
	public void modificarPelicula(int idPelicula, String pelicula, Genero g) throws Exception {
		
		if (this.traerPelicula(idPelicula) == null) {
			throw new Exception("La pelicula con id {"+idPelicula+"} no existe");
		}
		
		catalogo.get(idPelicula-1).setPelicula(pelicula);
		catalogo.get(idPelicula-1).setGenero(g);
		
		
	}
	
	public void eliminaPelicula(int idPelicula) throws Exception {
		
		if (this.traerPelicula(idPelicula) == null) {
			throw new Exception("La pelicula con id {"+idPelicula+"} no existe");
		}
		
		catalogo.remove(idPelicula-1);
		
	}
	
	public boolean agregarGenero(String g) {
		
		int i = 0, id=1;
		boolean v = false;
		
		while(i<generos.size() && !v) {
			if(generos.get(i).getGenero().equals(g)) {
				v=true;
			}
			i++;
		}
		if(!v) {
			if (generos.size() != 0) {
				id = generos.get(generos.size()-1).getIdGenero()+1;	
			}
			Genero ge = new Genero(id, g);
			generos.add(ge);
			v = true;
		}
		
		return v;
	}
	
	public Genero traerGenero(String g) {
		
		Genero ge = null;
		int i =0;
		
		while(i<generos.size() && ge == null) {
			if(generos.get(i).getGenero().equals(g)) {
				ge = generos.get(i);
			}
			i +=1;
		}
		
		return ge;
	}
	
	public Genero traerGenero(int idGen) {
		
		Genero ge = null;
		int i =0;
		
		while(i<generos.size() && ge == null) {
			if(generos.get(i).getIdGenero()== idGen) {
				ge = generos.get(i);
			}
			i +=1;
		}
		
		return ge;
	}
	
	//accesores
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	
	public List<Genero> getGeneros() {
		return generos;
	}
	
	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}
	
	@Override
	public String toString() {
		return "Catalogo["+catalogo+"]\nGeneros["+generos+"]";
	}
	
	
}
