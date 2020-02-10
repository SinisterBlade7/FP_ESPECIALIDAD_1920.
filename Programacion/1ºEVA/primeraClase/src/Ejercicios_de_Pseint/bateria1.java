package Ejercicios_de_Pseint;

import java.util.Scanner;

public class bateria1 {

	
	int n=0;
	
	
	public void setN( Scanner _input, Printer _p) {
		_p.pr("dime el ejercicio que quieres hacer");
		n=_input.nextInt();	
	}
	public void ejer( Printer _p, Scanner _input) {
		
		switch (n) {
		case 1:
			uno(_p,_input);
			break;
		
		case 2:
			dos(_p,_input);
			break;
		
		case 3:
			tres(_p,_input);
			break;
		case 4:
			cuatro(_input);
			break;	
			
		}
	}
	
	
	public void uno(Printer _p, Scanner _input) {
		
		int lim,n=0,m,r,i=0;
		m=1;
		lim=_input.nextInt();
		
		while(i<lim) {
			r=m+n;
			_p.pr(r);
			n=m;
			m=r;
			i++;
		}
		
		
	}

	public void dos(Printer _p, Scanner _input) {
		
		int a=1;
		int r=1;
		int b=1;
		int r2=1;
		
		_p.pr("dime el PRIMER numero para hallar el factorial");
		a=_input.nextInt();
		
		for(int i=1;i<=a;i++) {
			r=r*i;	
		}
		
		_p.pr("dime el SEGUNDO numero para hallar el factorial");
		b=_input.nextInt();
		
		for(int i=1;i<=b;i++) {
			r2=r2*i;	
		}
		
		if(a>b) {
			
			if(r>=b && r<=a) {
				_p.pr(r);
			}
			if(r2>=b && r2<=a) {
				_p.pr(r2);
			}
			
		}
		else {
			if(r<=b && r>=a) {
				_p.pr(r);
			}
			if(r2<=b && r2>=a) {
				_p.pr(r2);
			}
		}
			
	}
	
	public void tres(Printer _p, Scanner _input) {	
		
		int n=0;
		int estrellas=1;
		int default_estrellas=0;
		int espacios=0;
		int cantidad_espacios=0;
		
		_p.pr("numero de pisos");
		n=_input.nextInt();
		//numero de pisos ya pedidos------------------
		//-------------------------------
	
		for(int i=1;i<=n;i++) 
	    {	
			estrellas=n+(n-1);//CALCULADOR DE ESTRELLAS	
		}
		default_estrellas=estrellas;
		
		while(n>0) {
		
			while(espacios<cantidad_espacios) {		//IMPRESOR DE ESPACIOS
				System.out.print(" ");
				espacios++;
			}
			cantidad_espacios=cantidad_espacios+1;
			
		while(estrellas>0) {	//impresor de estrellas
			
			System.out.print("*");
			estrellas--;
		}
		default_estrellas=default_estrellas-2;
		estrellas=default_estrellas;    //reiniciador de estrellas
		
		System.out.println("");
		n--;	//bajada de nivel
		espacios=0;
		}
	}
	
	public void cuatro(Scanner _input) {
		
		int estrellas=0;
		estrellas=_input.nextInt();
		int estrellas_aux=estrellas;
		int espacios=0;
		int filas=estrellas-2;				
													
		while(estrellas>0) {				
			System.out.print("*");			
			estrellas--;
		}
		estrellas=estrellas_aux;
		
		while(filas>0) {
		
		espacios=estrellas-2;
		System.out.println("");
		System.out.print("*");
		while(espacios>0) {
			System.out.print(" ");
			espacios--;
		}
		espacios=estrellas-2;
		System.out.print("*");
		filas--;
		}
		System.out.println("");
		while(estrellas>0) {				
			System.out.print("*");			
			estrellas--;
		}
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	

	
	

