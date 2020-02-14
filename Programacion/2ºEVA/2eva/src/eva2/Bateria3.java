package eva2;

import java.util.Scanner;

public class Bateria3 {

	
	
	public void ejercicios(Scanner _in) {
		int index=100000;
		int[] array = new int [index];
		setRandom_array1(array, index, 10);
		sysoArray1(array, index);
		
		int ej=0;
		System.out.println("");
		System.out.println("Bateria 2--> Elija un ejercicio");
		ej=_in.nextInt();
		
		switch(ej) {
		
		case 1:
			ej1(_in,array,index);
		break;
		case 2:
			ej2(_in,array,index);
		break;
		
		
		
		}
	
	/*
	
	2 3 3 7 4 5 3
          j i 
    aux = 4
    
	2 3 3 4 7 5 3
	        j i
	aux = 5
	2 3 3 4 5 7 3
              j i
       aux = 3	

   	2 3 3 4 5 3 7
        j       i
       aux = 3	
       
       */
	}
	
	
	
	public void ej1(Scanner _in,int[] array,int index) {
		
		long tiempoinNano= System.nanoTime();
		int aux=0;
		
	for(int u=0;u<index;u++) {	
		for(int i=0;i<index;i++) {	
		if(i<index-1) {	
			if(array[i]>array[i+1]) {
				aux=array[i];
				array[i]=array[i+1];
				array[i+1]=aux;	
			}
		}
	}
}		
	long tiempofinNano= System.nanoTime();
	
	sysoArray1(array, index);
	System.out.println("");
	System.out.println(tiempofinNano-tiempoinNano+" unidad de tiempo");
	}

	public void ej2(Scanner _in,int[] array,int index) {
		
		
		
	}
	
	
	



	public void sysoArray2(int _array[][],int filas,int column) {
		
		for(int filas_aux=0;filas_aux<filas;filas_aux++) {
			for(int column_aux=0;column_aux<column;column_aux++) {
				
			System.out.print(_array[filas_aux][column_aux]+", ");	
				
			}
			System.out.println("");
		}
	}
	
	public int[][] setRandom_array2(int _array[][],int filas,int column,int multi_Random) {
		
		for(int filas_aux=0;filas_aux<filas;filas_aux++) {
			for(int column_aux=0;column_aux<column;column_aux++) {
				
				_array[filas_aux][column_aux]=(int) (Math.random()*multi_Random);
				
			}
		}
		return _array;
	}
	
	public int[] setRandom_array1(int _array[],int index,int multi_Random) {
		
		for(int index_aux=0;index_aux<index;index_aux++) {
				_array[index_aux]=(int) (Math.random()*multi_Random);
			}
		return _array;
	}
	
	public void sysoArray1(int _array[],int index) {
		for(int index_aux=0;index_aux<index;index_aux++) {
				System.out.print(_array[index_aux]+", ");
		}
	}


}
