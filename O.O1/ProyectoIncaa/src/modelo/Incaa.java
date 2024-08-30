package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modelo.*;

public class Incaa {

	//atributos
	List<Pelicula> catalogo;

	//constructor
	public Incaa() {
		this.catalogo = new ArrayList<Pelicula>();
	}
	
	//metodos
	public boolean agregarPelicula(String p,Genero g) {
		Pelicula peli = new Pelicula(0, p, g);
		boolean existe = false,agregada = false;
		int i = 0;
		
		while(i < catalogo.size()) {
			if (catalogo.get(i).getPelicula().equals(p)) {
				i = catalogo.size();
				existe = true;
			}
			i += 1;
		}
		//si es false = true y si es true = false
		if (!existe) {
			if (catalogo.size() == 0) {
				catalogo.add(peli);
			}else {
				peli.setIdPelicula(catalogo.get(catalogo.size()-1).getIdPelicula()+1);
				catalogo.add(peli);
			}
			agregada = true;
		}
		
		return agregada;
	}
	
	public Pelicula traerPelicula(int idPelicula) {
		
		int i =0;
		Pelicula p = new Pelicula(-1, null,null);
		while(i<catalogo.size()) {
			if(catalogo.get(i).getIdPelicula() == idPelicula) {
				p = catalogo.get(i);
				i = catalogo.size()+1;
			}else {
				p = null;
			}
			i +=1;
		}
		
		return p;
	}
	
	public List<Pelicula> traerPelicula(String pName) {
		
		List<Pelicula> listPelis = new ArrayList<>();
		Pelicula p = new Pelicula(-1, null, null);
		String[] aux;
		
		for (int i = 0; i < catalogo.size(); i++) {
			aux = catalogo.get(i).getPelicula().split(" ");
			for (int j = 0; j < aux.length; j++) {
				if (aux[j].equals(pName)) {
					p = catalogo.get(i);
					listPelis.add(p);
				}
			}
		}
		
		
		
		return listPelis;
	}
	
	public List<Pelicula> traerPelicula(Genero g) {
		
		List<Pelicula> listPelis = new ArrayList<>();
		Pelicula p = new Pelicula(-1, null, null);
		Genero aux;
		
		for (int i = 0; i < catalogo.size(); i++) {
			
			aux = catalogo.get(i).getGenero();

			if (aux.equals(g)) {
				p = catalogo.get(i);
				listPelis.add(p);
			}
		}
		
		return listPelis;
	}
	
	public void modificarPelicula(int idPelicula, String pelicula, Genero g) throws Exception {
		
		if (this.traerPelicula(idPelicula) == null) {
			throw new Exception("La pelicula con id {"+idPelicula+"} no existe");
		}else {
			catalogo.get(idPelicula).setPelicula(pelicula);
			catalogo.get(idPelicula).setGenero(g);
		}
		
	}
	
	public void eliminaPelicula(int idPelicula) throws Exception {
		
		if (this.traerPelicula(idPelicula) == null) {
			throw new Exception("La pelicula con id {"+idPelicula+"} no existe");
		}else {
			catalogo.remove(idPelicula);
		}
	}
	
	//accesores
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	
	@Override
	public String toString() {
		String cata = "";
		
		for (int i = 0; i < catalogo.size(); i++) {
			cata += catalogo.get(i).toString()+"\n";
		}
		
		cata +=". . .";
		return cata;
	}
	
	
}
