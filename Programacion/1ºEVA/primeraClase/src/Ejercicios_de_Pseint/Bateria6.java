package Ejercicios_de_Pseint;
import java.util.Scanner;

public class Bateria6 {
	public void ejercicios(Scanner _input) {
		int n=0;
		System.out.println("Que ejercicios quieres hacer?");
		n=_input.nextInt();
		switch(n) {
		case 1:
			ejercicio1(_input);
		break;
		case 2:
			ejercicio2(_input);
		break;
		case 3:
			ejercicio3(_input);
		break;
		case 4:
			ejercicio4(_input);
		break;
		case 5:
			ejercicio5(_input);
		break;
		case 6:
			ejercicio6(_input);
		break;
		case 7:
			ejercicio7(_input);
		break;
		case 8:
			ejercicio8(_input);
		break;
		case 9:
			ejercicio9(_input);
		break;
		case 10:
			ejercicio10(_input);
		break;
		case 11:
			ejercicio11(_input);
		break;
		case 12:
			ejercicio12(_input);
		break;
		
		}
		
	}
	
	public void ejercicio1(Scanner _input) {
		int a=0,b=0;
		for(int i=1;i<=5;i++) {
			System.out.println("Escribe el numero "+i+":");
			b=_input.nextInt();
			a=a+b;
		}
		System.out.println("Resultado: "+a);
	}
	
	public void ejercicio2(Scanner _input) {
		int a=0,b=0,lim=0;
		System.out.println("Cuantos numeros quiere insertar");
		lim=_input.nextInt();
		for(int i=1;i<=lim;i++) {
			System.out.println("Escribe el numero "+i+":");
			b=_input.nextInt();
			a=a+b;
		}
		System.out.println("Resultado: "+a);
	}
		
	public void ejercicio3(Scanner _input) {
		
		int año=0;
		boolean a=false;
		System.out.println("Di un año");
		año=_input.nextInt();
		
		if(año%4==0) {
			a=true;
			
			if(año%100==0) {
				a=false;
				if(año%400==0) {
					a=true;
				}
						
			}
		}
		System.out.println(a);
		
	}
	
	public void ejercicio4(Scanner _input) {
		
		int dia=0,mes=0,año=0;
		boolean a=false;
		System.out.println("dia");
		dia=_input.nextInt();
		System.out.println("mes");
		mes=_input.nextInt();
		System.out.println("año");
		año=_input.nextInt();
		
		dia++;
		if((mes==1 ||mes==3 ||mes==5||mes==7||mes==8||mes==10||mes==12) && dia==32) {
			dia=1;
			mes++;
			}
			
		
		if((mes==4||mes==6||mes==9||mes==11) && dia==31) {
			dia=1;
			mes++;
		}
		if(mes==2) {
			
			if(año%4==0) {
				a=true;
				
				if(año%100==0) {
					a=false;
					if(año%400==0) {
						a=true;
					}
							
				}
			}
			if(a==true && dia==30) {
				dia=1;
				mes++;	
			}
			if(a==false && dia==29) {
				dia=1;
				mes++;	
			}
				
		}
		
		if(((mes==1 ||mes==3 ||mes==5||mes==7||mes==8||mes==10||mes==12) && dia>32)||((mes==4||mes==6||mes==9||mes==11) && dia>31)||
				(mes==2 && a==true && dia>30)||(mes==2 && a==false && dia>29)){
			System.out.println("error");
		}
		else {
		System.out.println("dia :"+dia);
		System.out.println("mes :"+mes);
		System.out.println("año :"+año);
		}
		
	}

	public void ejercicio5(Scanner _input) {
		int a=0;
		double b=0;
		String result="";
		System.out.println("Insterte el tipo de conversion que desea");
		System.out.println("1: Galones-Litros");
		System.out.println("2: Pies a otros sistemas de medida");
		a=_input.nextInt();
		System.out.println("Inserte una cantidad");
		b=_input.nextDouble();
		switch(a) {
		case 1:
			result=galones_litros(_input,b,result)+"";
			
			break;
		case 2:
			result=pies_cosas(_input,b,result);
			break;
		}
		System.out.println(result);
	}
	
	public void ejercicio6(Scanner _input) {
		
		double cap=0;
		int a=1;
		int meses=0;
		System.out.println("Introduce un capital");
		cap=_input.nextDouble();
		double cap_aux=cap;
		
		while(a==1) {
			meses++;
			cap=cap*1.06d;
			if(cap>=cap_aux*3) {
				a=2;
			}
		}
		System.out.println(meses);
		}
			
	public void ejercicio7(Scanner _input) {
		
		int num=0;
		System.out.println("Escribe un numero mayor que dos");
		num=_input.nextInt();
		for(int i=2;i<num;i++) {
			
			for(int u=2;u<num;u++) {
				
				if(u*i==num) {
					System.out.println(u+"*"+i);
				}	
			}
		}	
	}

	public void ejercicio8(Scanner _input) {
		
		int termino=0;
		int razon=0;
		int num=0;
		int suma=0;
		
		System.out.println("Inserte termino");
		termino=_input.nextInt();
		System.out.println("Inserte razon");
		razon=_input.nextInt();
		System.out.println("Inserte numero");
		num=_input.nextInt();
		suma=num;
		for(int i=1;i<=termino;i++) {
			num=num*razon;
			suma=suma+num;
			System.out.print(num+", ");
		}
		System.out.println("La suma de los términos de la serie es "+suma );
	}

	public void ejercicio9(Scanner _input) {
		
		int n=1;
		int resto0=0;
		
		while(n>0) {
		
			System.out.println("Inserte un numero para combrobar si es o no perfecto---Insertar 0 para salir del sistema");
			n=_input.nextInt();
			if(n<=0) {
				System.out.println("log out");
				break;
			}
			
		for(int divisor=1;divisor<n;divisor++) {
			if(n%divisor==0) {
				resto0=resto0+divisor;
			}			
		}
		System.out.println(resto0);
		if(resto0==n) {
			System.out.println("El "+n+" es un numero perfecto");
		}
		else {
			System.out.println("El "+n+" no es un numero perfecto");
			}
		resto0=0;
		}
	}	

	public void ejercicio10(Scanner _input) {
		
		int h=0;
		int estrellas=1;
		System.out.println("Altura");
		h=_input.nextInt();
		
		
		while(h>0) {
			
			for(int i=1;i<=estrellas;i++) {
				System.out.print("*");
			}
			System.out.println("");
			estrellas++;
			h--;
		}	
	}
	
	
	public void ejercicio11(Scanner _input) {
		
		int h=0;
		int estrellas=1;
		int num=1;
		System.out.println("Altura");
		h=_input.nextInt();
		while(h>0) {
			
			for(int i=1;i<=estrellas;i++) {
				System.out.print(num);
				num++;
			}
			num=1;
			System.out.println("");
			estrellas++;
			h--;
		}	
	}

	public void ejercicio12(Scanner _input) {
		
		int lim=0;
		
		System.out.println("Inserte un numero");
		lim=_input.nextInt();
		
		for(int i=1;i<=lim;i++) {
		
			System.out.print(i+"   |   "+(int)Math.pow(i, 2)+"   |   "+(int)Math.pow(i, 3));
			System.out.println("");
		}
	}
	
	

	public String galones_litros(Scanner _input,double _b,String _result) {
		_b=_b* 3.7854;
		_result=_b+" Litros";
		return _result;
	}
	public String pies_cosas(Scanner _input,double _b,String _result) {
		
		int pulgadas=0;
		double yarda=0;
		double cm=0;
		double m=0;
		pulgadas=(int) (_b*12);
		yarda=(pulgadas*2.54)/94;
		cm=(pulgadas*2.54);
		m=cm/100;
		_result="Pulgadas:"+pulgadas+" Yarda:"+yarda+" Centímetros:"+cm+" Metros"+m;
		return _result;
	}
	
}
