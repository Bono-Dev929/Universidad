package modelo;

public class ArregloUnidimencional {
	
	//atributos
	private int[] vector;

	//constructor
	public ArregloUnidimencional(int[] vector) {
		this.vector = vector;
	}

	//metodos
	
	
	public int traerElMenor() {
		int menor = vector[0];
		
		for (int i = 0; i < vector.length; i++) {
			if (menor > vector[i]) {
				menor = vector[i];
			}
		}
		
		return menor;
	}
	
	public int traerElMayor() {
		int mayor = vector[0];
		
		for (int i = 0; i < vector.length; i++) {
			if (mayor < vector[i]) {
				mayor = vector[i];
			}
		}
		
		return mayor;
	}
	
	public double promedio() {
		
		int suma = 0;
		
		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		
		return suma/vector.length;
	}
	
	
	public int[] ordenarAcendente() {
		int[] a = vector;
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] > a[j+1]) {
					int aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
			}
		}
		
		return a;
	}
	
	
	public int[] ordenarDescendente() {
		int[] a = vector;
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] < a[j+1]) {
					int aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
			}
		}
		return a;
	}
	
	
	public double frecuencia(int n) {
		double f = 0;
		
		for (int i = 0; i < vector.length; i++) {
			if (n == vector[i]) {
				f +=1;
			}
		}
		
		
		return f/vector.length;
	}
	
	public int moda() {
		int m = vector[0];
		
		for (int i = 0; i < vector.length-1; i++) {
			if (frecuencia(vector[i]) > frecuencia(vector[i+1])) {
				m = vector[i];
			}
		}
		
		return m;
	}
	
	
	//Accesores
	public int[] getVector() {
		return vector;
	}
	
	public void setVector(int[] vector) {
		this.vector = vector;
	}

	
	public boolean equals(ArregloUnidimencional a) {
		int cont = 0;
		
		for (int i = 0; i < vector.length-1; i++) {
			if(vector[i] == a.getVector()[i]) {
				cont +=1;
			}
		}
		
		
		return cont == vector.length;
	}
	
	@Override
	public String toString() {
		String array = "";
		
		for (int i = 0; i < vector.length; i++) {
			array += vector[i]+", ";
		}
		
		return array;
	}
}
