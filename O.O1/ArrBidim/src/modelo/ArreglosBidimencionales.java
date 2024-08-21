package modelo;

public class ArreglosBidimencionales {

	//Atributos
	private double[][] matriz;

	//constructor
	public ArreglosBidimencionales(double[][] matriz) {
		this.matriz = matriz;
	}

	//Metodos
	
	public boolean dimensionar(double[][] matrizB) {
		boolean v = true;
		
		if (matriz.length == matrizB.length) {
			for (int i = 0; i < matriz.length; i++) {
				if (matriz[i].length != matrizB[i].length) {
					v = false;
				}
			}
		}else {
			v=false;
		}
		
		return v;
	}
	
	public double[][] sumar(double[][] matrizB){
		double[][] suma = new double [matriz.length][matriz[0].length];
		
		if (dimensionar(matrizB)) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					suma[i][j] = matriz[i][j] + matrizB[i][j];
				}
			}
		}
		return suma;
	}
	
	public double[][] restar(double[][] matrizB){
		double[][] resta = new double [matriz.length][matriz[0].length];
			
		if (dimensionar(matrizB)) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					resta[i][j] = matriz[i][j] - matrizB[i][j];
				}
			}
		}
		return resta;
	}
	
	public double[][] transponer(){
		double[][] transpuesta = new double[matriz[0].length][matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				transpuesta[j][i] = matriz[i][j];
			}
		}
		
		return transpuesta;
	}
	
	public double[][] multiplicar(double n){
		double[][] multi = new double [matriz.length][matriz[0].length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				multi[i][j] = matriz[i][j] *n;
			}
		}
		
		return multi;
	}
	
	public double[][] multiplicar(double[][] m){
		double[][] C = new double [matriz.length][m[0].length];
		
		if(matriz[0].length != m.length) {
			C = null;
		}else {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					for (int k = 0; k < matriz[0].length; k++) {
						C[i][j] += matriz[i][k] * m[k][j];
					}
				}
			}
		}
		
		
		return C;
	}
	
	
	//Accesores
	public double[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(double[][] matriz) {
		this.matriz = matriz;
	}

	@Override
	public String toString() {
		String s = "";
		
		for (int i = 0; i < matriz.length; i++) {
			s += "[";
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == matriz[i].length-1) {
					s += matriz[i][j];
				}else {s += matriz[i][j]+", ";}
				
			}
			s+= "]\n";
		}
		
		return "ArreglosBidimencionales \n"+s;
	}
	
	
	public boolean equals(ArreglosBidimencionales a1) {
		
		int cont = 0;
		
		if (dimensionar(a1.getMatriz())) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] == a1.getMatriz()[i][j]) {
						cont ++;
					}
				}
			}
		}
		
		
		return cont == matriz.length*matriz[0].length;
	}

	
	
}
