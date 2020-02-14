package eva2;

import java.util.Scanner;

public class Bateria2 {

	public void ejercicios(Scanner _in) {
		int ej=0;
		System.out.println("Bateria 2--> Elija un ejercicio");
		ej=_in.nextInt();
		
		switch(ej) {
		
		case 1:
			ej1(_in);
		break;
		case 2:
			ej2(_in);
		break;
		case 3:
			ej3(_in);
		break;
		case 4:
			ej4(_in);
		break;
		case 6:
			ej6(_in);
		break;
		case 7:
			ej7(_in);
		break;
		case 12:
			ej12(_in);
		break;
		case 13:
			ej13(_in);
		break;
		
		}
	
	
	
	}
	
	public void ej1(Scanner _in) {
		
		int a[][]=new int [5][5];
		
		for(int i=0;i<5;i++) {
			
			for(int u=0;u<5;u++) {
				
				a[i][u]=(int)(Math.random()*10)+1;
				
			}
			
		}
		for(int i=0;i<5;i++) {
			
			for(int u=0;u<5;u++) {
				
				System.out.print(a[i][u]);
				System.out.print(",");
			}
			System.out.println("");
		}
	}
	
	public void ej2(Scanner _in) {
		
		int a[][]=new int [5][20];
		int x=1;
		
		for(int i=0;i<a.length;i++) {
			
			for(int u=0;u<a[0].length;u++) {
				
				a[i][u]=x;
				x++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			
			for(int u=0;u<a[0].length;u++) {
				
				System.out.print(a[i][u]+", "); 
				
			}
			System.out.println("");
		}
		
	}
	
	public void ej3(Scanner _in) {
		
		int a[][]=new int [6][20];
		int x=1;
		
		for(int i=0;i<a.length-1;i++) {
				
			for(int u=0;u<a[0].length;u++) {
				
				a[i][u]=x;
				x++;
		}
		}
		
		
		//sexta fila
		for(int col=0;col<a[0].length;col++) 
		{
			for(int fil=0;fil<a.length-1;fil++)
			{
				x=x+a[fil][col];
				if (fil == a.length-2)
				{
					a[fil+1][col] = x;
				}
			}
		}

		
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int u=0;u<a[0].length;u++) {
				
				System.out.print(a[i][u]+", "); 
				
			}
			System.out.println("");
		}
		
		
		
	}
	
	public void ej4(Scanner _in) {
		
	int size=0;
	int rnumber=0;
	int axis[]=new int[2];
	
	System.out.println("Dime el tamaño del array");
	size=_in.nextInt();
	int a[][]=new int [size][size];
		
	for(int filas=0;filas<size;filas++) {
		
		for(int columnas=0;columnas<size;) {
			rnumber=(int) (Math.random()*100+1);
			if(rnumber%2==0) {
				a[filas][columnas]=rnumber;
				columnas++;
			}			
		}
	}
	
	for(int filas=0;filas<size;filas++) {
		for(int columnas=0;columnas<size;columnas++) {
			System.out.print(a[filas][columnas]+" ,");	
		}
		System.out.println("");
	}
	
	System.out.println("Seleccione las coordenadas");
	System.out.println("X-->");
	axis[0]=_in.nextInt();
	System.out.println("Y-->");
	axis[1]=_in.nextInt();
	System.out.println("El numero contenido es:");
	System.out.println(a[axis[1]-1][axis[0]-1]);
	
	}
	
	public void ej6(Scanner _in) {
	
		int a[][]= new int [4][5];
		int n=(int)(Math.random()*9);
		int axis[]=new int[2];
		boolean once=true;
		System.out.println("efsdvfs");
		for(int filas=0;filas<4;filas++) {
			
			for(int column=0;column<5;column++) {
				a[filas][column]=(int)(Math.random()*9);
				
				if(once==true)
				{
					if(a[filas][column]==n)
					{
						axis[0]=filas+1;
						axis[1]=column+1;
						once=false;
					}
				}
			}	
		}	
		for(int filas=0;filas<4;filas++) {
			
			for(int column=0;column<5;column++) {
				System.out.print(a[filas][column]+", ");
				
			}
			System.out.println("");
		}
		
		System.out.println("El numero clave es:"+n);
		System.out.println("Su posicion es X="+axis[1]+" ,Y="+axis[0]);
	
	}
	
	public void ej7(Scanner _in) {
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		
		for(int filas=0;filas<3;filas++) {
			for(int column=0;column<3;column++) {
				a[filas][column]=(int) (Math.random()*9);
				b[column][filas]=a[filas][column];
			}
		}
		
		for(int filas=0;filas<3;filas++) {
			for(int column=0;column<3;column++) {
				
			System.out.print(a[filas][column]+", ");	
				
			}
			System.out.println("");
		}
		
		System.out.println("Traspuesta");
		
		for(int filas=0;filas<3;filas++) {
			for(int column=0;column<3;column++) {
				
			System.out.print(b[filas][column]+", ");	
				
			}
			System.out.println("");
		}
		
		
	}
	
	public void ej12(Scanner _in)/*multiplicar matrices=CHUNGUISIMO BRO*/ {
		
		
		System.out.println("Dimensiones del primer array");
		int fila1=_in.nextInt();
		int columna1=_in.nextInt();
		
		System.out.println("Dimensiones del segundo array");
		int fila2=_in.nextInt();
		int columna2=_in.nextInt();

		int a[][]=new int [fila1][columna1];
		int b[][]=new int [fila2][columna2];
		
	if(fila2==columna1)
	{	
		int col_it=0,fil_it=0;
		int c[][]=new int [fila1][columna2];
		
		a=setRandom_array2(a, fila1, columna1, 10);
		b=setRandom_array2(b, fila2, columna2, 10);
		
		System.out.println("Primer array");
		sysoArray2(a, fila1, columna1);
		System.out.println("Segundo array");
		sysoArray2(b, fila2, columna2);
		
		
		for(int fila_aux=0;fila_aux<fila1;fila_aux++) {
		
			
			for(int column_aux=0;column_aux<columna2;column_aux++) {
				
				
				c[fila_aux][column_aux]=matrizCalculator(col_it,fil_it, a, b, fila1, columna1, fila2, columna2);
				
				col_it++;
				
			}
			col_it=0;
			
			fil_it++;
			
		}
		System.out.println("");
		System.out.println("");
		sysoArray2(c, fila1, columna2);
		}
	
	else {System.out.println("error");}
	}	
	public int matrizCalculator(int col_it,int fil_it, int a[][],int b[][],
			int fila1,int columna1,int fila2,int columna2) {
		
		int num1[]=new int [columna1];
		int num2[]=new int [fila2];
		int r=0;
		
		for(int columna=0;columna<columna1;columna++){//matriz1
				num1[columna]=a[fil_it][columna];		
		}
		
		for(int fila=0;fila<fila2;fila++){//matriz2
			num2[fila]=b[fila][col_it];		
		}
		
		
		
		
		
		for(int m=0;m<fila2;m++) {
			r=r+(num1[m]*num2[m]);
		}
		return r;
	}
	
	public void ej13(Scanner _in) {
		
		int r_fil=0;
		int r_col=0;
		int filas=4,columnas=5;
		int a[][]=new int [filas][columnas];
		setRandom_array2(a, filas, columnas, 9);
		
		for(int filas_aux=0;filas_aux<filas;filas_aux++) {
			for(int column_aux=0;column_aux<columnas;column_aux++) {
				
			r_fil=r_fil+a[filas_aux][column_aux];
				
			System.out.print(a[filas_aux][column_aux]+", ");
			
			if(column_aux==columnas-1) {
				System.out.println(r_fil);
			}	
			}
			r_fil=0;
			System.out.println("");
		}
		
		for(int column_aux=0;column_aux<columnas;column_aux++) {
			
			for(int fila_aux=0;fila_aux<filas;fila_aux++) {
				
				r_col=r_col+a[fila_aux][column_aux];
				
				if(fila_aux==filas-1) {
					System.out.print(r_col+", ");
				}	
			}
			r_col=0;
		}
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
				System.out.println(_array[index_aux]);
		}
	}
	
	
	
	
}
