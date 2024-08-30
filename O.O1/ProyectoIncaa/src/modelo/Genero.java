package modelo;

public class Genero {

	//ATRIBUTOS
	private int idGenero;
	private String genero;
	
	//CONSTRUCOR
	public Genero(int idGenero, String genero) {
		super();
		this.idGenero = idGenero;
		this.genero = genero;
	}
	
	//METODOS
	
	
	
	//ACCESORES
	public int getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "[Genero: "+genero+", IdGenero: "+idGenero+"]";
	}
	
	public boolean equals(Genero g) {
		return idGenero == g.getIdGenero() && genero.equalsIgnoreCase(g.getGenero());
	}
	
}
