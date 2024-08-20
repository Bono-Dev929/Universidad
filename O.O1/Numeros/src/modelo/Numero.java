package modelo;

public class Numero {
	
	//Estado interno (Atributos)
	private int n;
	
	//constructor
	public Numero(int num) {
		this.n = num;
	}
	
	//Metodos
	
	public int sumar(int n) {return (this.n + n);}
	
	public int multiplicar(int n) {return this.n*n;}
	
	public boolean esPar() {return ((this.n % 2 ) == 0 );}
	
	public boolean esPrimo() {
		boolean v = true;
		
		for (int i = 2; i < Math.sqrt(this.n); i++) {
			if(this.n % i == 0) {
				v = false;
			}
		}
		
		return v;
	}
	
	public String convertirAString() {return String.valueOf(this.n);}
	
	public double convertirEnDouble() {return Double.parseDouble(this.convertirAString());}
	
	public double calcularPotencia(int exp) {return Math.pow(this.convertirEnDouble(), exp);}
	
	public int factorial() {
		int f = 1;
		for (int i = 1; i <= this.n; i++) {
			f *= i; 
		}
		return f;
	}
	
	public float numeroCombinatorio(int n1) {
		int comb,f = 1,f1=1;
		if (n<n1 || n<0 || n1<0) {
			comb = 0;//si n1 es mayor a n retorna el 0
		}else {
			for (int i = 1; i <= n1; i++) {
				f *= i; 
			}
			for (int i = 1; i <= (this.n-n1); i++) {
				f1 *= i; 
			}
			comb = this.factorial()/(f*f1);
		}
	
		return comb;
	}
	
	//Fin metodos
	//Accesores
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "[Numero: "+this.n+"]";
	}
	
}

