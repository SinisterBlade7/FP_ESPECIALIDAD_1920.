package eva2;

import java.util.Scanner;

public class Bateria1{


	public void ejercicios(Scanner _in) {
		int ej=0;
		System.out.println("Bateria 1--> Elija un ejercicio");
		ej=_in.nextInt();
		
		switch(ej) {
		case 2:
			ej2(_in);
			break;
		case 3:
			ej3(_in);
			break;	
		case 4:
			ej4(_in);
			break;	
		case 5:
			ej5(_in);
			break;	
		case 6:
			ej6(_in);
			break;	
		case 7:
			ej7(_in);
			break;
		case 8:
			ej8(_in);
			break;	
		case 9:
			ej9(_in);
			break;	
		case 12:
			ej12(_in);
			break;		
		case 13:
			ej13(_in);
			break;		
			
			
		}
		
	}//----------------------

	public void ej2(Scanner _in) {
		int a[]=new int[100];
	
		for(int i=0;i<=99;i++) {
			a[i]=i+1;
		}
		
		for(int i=0;i<=99;i++) {
			System.out.println(a[i]);
		}
	}
	
	public void ej3(Scanner _in) {
		
		int a[]=new int[100];
		
		for(int i=0;i<=99;i++) {
			a[i]=i+1;
		}
		
		for(int i=99;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	
	public void ej4(Scanner _in) {
		int a[]= new int[50];
		int it=1,index=0;
		
		while(index<=49) {	
			if(it%2==0) {
				a[index]=it;
				index++;
			}
			it++;
		}
		
		for(int i=0;i<=49;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public void ej5(Scanner _in) {
		
		int a[]= new int [50];
		int index=0,x=1;
		
		while(index<=49) {
			if(x%2==1) {
			a[index]=x;
			index++;
			}
			x++;
		}
		
		for(int i=0;i<=49;i++) {
			System.out.println(a[i]);
		}
	}
	
	public void ej6(Scanner _in) {
		
	int tank[]=new int [100];	
	int n=1;
	int index=0;
	int cap=0;
	
	while (n<=100)
	{
		if(primo(n))
		{
			tank[index]=n;
			index++;
			cap++;
		}
		n++;
	}
	int result[]=new int[cap];
	
	for(int i=0;i<cap;i++) {
		result[i]=tank[i];
	}
	for(int u=0;u<cap;u++) {
		System.out.println(result[u]);
	}
	}
	
	public void ej7(Scanner _in) {
		
		int a[]=new int[200];
		int n_mayor=0;
		
		for(int i=0;i<200;i++) {
			a[i]=(int) (Math.random()*200+1);
		}
		
		for(int i=0;i<200;i++) {
			
			if(n_mayor<a[i]) {
				n_mayor=a[i];
			}
		}
		
		for(int i=0;i<200;i++) {
			System.out.println(a[i]);
		}
		System.out.println("n_mayor= "+n_mayor);
		
	}
	
	public void ej8(Scanner _in) {
		
		int a[]=new int[3];
		int res=0;
		
		for(int i=0;i<3;i++) {
			a[i]=_in.nextInt();
		}
		for(int i=0;i<3;i++) {
			res=res+a[i];
		}
		System.out.println(res);
		
	}
	
	public void ej9(Scanner _in) {
		
		int a[]= {1,2,3,4,5};
		
		int vueltas=0;
		System.out.println("Vueltas:");
		vueltas=_in.nextInt();
		
		for(int u=0;u<vueltas;u++) {
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		}
	}
	
	public void ej12(Scanner _in) {
		
		int aux=0,n=0;
		
		System.out.println("Cuantos numeros");
		n=_in.nextInt();
		
		int a[]= new int [n];
		
		for(int i=0;i<n;i++) {
			a[i]=(int) (Math.random()*10);
		}
		System.out.println("Sin ordenar:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("");
		
		for(int i=0;i<=n;i++) {
		
		for(int index=0;index<n-1;index++) {
		
		if(a[index]>a[index+1]) {
			aux=a[index];
			a[index]=a[index+1];
			a[index+1]=aux;
		}
		}	
		
		}
		System.out.print("Ordenados: ");
		
		for(int i=0;i<n;i++) {
			System.out.print(+a[i]+", ");
		}
		
		
	}
	
	public void ej13(Scanner _in) {
		
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];
		
		for(int i=0;i<10;i++) {
			
			if(i<5) {
			
				a[i]=_in.nextInt();
				c[i]=a[i];
			}
			else {
				
				b[i-5]=_in.nextInt();
				c[i]=b[i-5];
			}
			
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean primo(int _n) {
		
		boolean primo=true;
		
		if(_n>2) {
		
		for(int i=2;i<_n;i++) {
			if(_n%i==0) {
				primo=false;
			}
		}
		}
		else {primo=false;}
		return primo;
	}
	
}