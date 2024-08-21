package modelo;

import modelo.Punto;

public class Circulo {

	//Atributos
	private Punto origen;
	private double radio;
	
	//Constructor
	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;
	}
	
	//Metodos
	
	
	
	public double calcularPerimetro() {return 2*Math.PI*radio;}
	
	public double calcularArea() {return Math.PI*radio * Math.pow(radio, 2);}
	
	private double calcularDistancia(Circulo c) {return this.getOrigen().calcularDistancia(c.getOrigen());}
	
	
	//Accesores
	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	/**
	 * no retorna nada, osea no hace nada*/
	public void setRadio(Punto p){}
	
	@Override
	public String toString() {
		return "[Origen: " + origen.toString() + ", Radio: " + radio + "]";
	}
	
	
	public boolean equals(Circulo c) {
		return origen.equals(c.origen) && radio == c.getRadio();
	}

}
