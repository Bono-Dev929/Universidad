package test;

import modelo.ArreglosBidimencionales;

public class ArregloBidimencionalTest {

	public static void main(String[] args) {
		
		double[][] mat1 = {{1,6,5,8},{1,5,4,10},{25,63,16,14}};
		double[][] mat2 = {{9,5,6,1},{-25,36,-2,0},{25,63,16,14}};
		double[][] mat3 = {{1,6,5,8},{1,5,4,10},{25,63,16,14}};
		double[][] mAux = {{2,3,6},{6,2,1},{1,0,7},{9,4,8}};
		
		
		ArreglosBidimencionales m1 = new ArreglosBidimencionales(mat1);
		ArreglosBidimencionales m2 = new ArreglosBidimencionales(mat2);
		ArreglosBidimencionales m3 = new ArreglosBidimencionales(mat3);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		//-------
		double[][] matA = (m1.sumar(m2.getMatriz()));
		ArreglosBidimencionales mS = new ArreglosBidimencionales(matA);
		System.out.println("Suma de matriz 1 y 2:\n"+mS.toString());
		
		//--------------
		System.out.println("Son iguales? "+m1.equals(m3));
		
		//----------------
		ArreglosBidimencionales mT = new ArreglosBidimencionales(m1.transponer());
		System.out.println("Matriz Transpuesta: "+m1.toString()+"\n"+mT.toString());
		
		//--------------------------------------------------
		ArreglosBidimencionales mM = new ArreglosBidimencionales(m1.multiplicar(10));
		System.out.println("Matriz Multiplicada: \n"+mM.toString());
		
		//-----------------------------------------------------------
		ArreglosBidimencionales m4 = new ArreglosBidimencionales(m1.multiplicar(mAux));
		
		System.out.println(m4.toString());
		
	}

}
