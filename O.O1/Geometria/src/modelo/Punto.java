package modelo;

public class Punto {
	
	//Atributos
	private int x;
	private int y;
	
	//constructor
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Metodos
	
	public double calcularDistancia(Punto p) {
		return Math.sqrt( Math.pow(x - p.getX(),2) + Math.pow(y - p.getY(),2));
	}
	
	//accesores
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//esto es sobrecarga de metodos
	public boolean equals(Punto p) {
		return ((this.x==p.getX())&&(this.y == p.getY()));
	}
	
	//re-definicion de metodos @override
	@Override
	public String toString() {
		return "( "+this.x+" , "+this.y+" )";
	}
	
	
}
