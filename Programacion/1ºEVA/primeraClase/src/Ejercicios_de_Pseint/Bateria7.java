package Ejercicios_de_Pseint;

import java.util.Scanner;

public class Bateria7 {

	public void ejercicios(Scanner _input) {
		int a=0;
		
		System.out.println("Inserte un ejercicio a realizar");
		a=_input.nextInt();
		
		switch(a) {
		
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
			
		}
	}
	
	public void ejercicio1(Scanner _input) {
		
		double a=0;
		a=Math.random()*200;
		a=(int)a;
		if(a==0) {
			a++;
		}
		System.out.println(a);
		
		int num=0;
		int i=0;
		int dif=0;
		
		System.out.println("Seleccione una dificultad");
		System.out.println("1-Fácil=50 intentos");
		System.out.println("2-Normal=25 intentos");
		System.out.println("3-Difícil=5 intentos");
		
		dif=_input.nextInt();
		
		switch(dif) {
		
		case 1:
			dif=50;
			break;
		case 2:
			dif=25;
			break;
		case 3:
			dif=5;
			break;	
		}
		while(i<=dif) {
		
			System.out.println("Adivina el numero");
			num=_input.nextInt();
			
			if(a==num) {
				System.out.println("Eureka¡¡");
				i++;
				break;
			}
			if(a<num) {
				System.out.println("x < "+num);
				i++;
			}
			if(a>num) {
				System.out.println("x > "+num);
				i++;
			}
		}
		if(a==num) {
		System.out.println("Has acertado en "+i+" intentos");
		}
		else {System.out.println("Has fallado");
		};
	}//-----
	
	public void ejercicio2(Scanner _input) {
		
		int a=0,b=0;
		int a_sum=0,b_sum=0;
		
		System.out.println("Inserte dos numeros");
		a=_input.nextInt();
		b=_input.nextInt();
		
		for(int i=1;i<a;i++) {
			
			if(a%i==0) {
				a_sum=a_sum+i;
			}
		}
		
		for(int i=1;i<b;i++) {
					
			if(b%i==0) {
				b_sum=b_sum+i;
			}
		}
		if(a==b_sum && b==a_sum) {
			System.out.println("Son numeros amigos");
		}
		else {
			System.out.println("No son numeros amigos");
		}
		
		
		
	}//----

	public void ejercicio3(Scanner _input) {
		int dia=0,mes=0,año=0;
		int res=0;
		int res_s_length=0;
		String res_s="";
		System.out.println("dia");
		dia=_input.nextInt();
		System.out.println("mes");
		mes=_input.nextInt();
		System.out.println("año");
		año=_input.nextInt();

		res=dia+mes+año;
		res_s=res+"";
		res=0;
		res_s_length=res_s.length()-1;
		for(int i=0;i<=res_s_length;i++) {
			res=res+Integer.parseInt(res_s.charAt(i)+"");
		}
		if(res>9) {
			res_s=res+"";
			res=0;
			res_s_length=res_s.length()-1;
			for(int i=0;i<=res_s_length;i++) {	
				res=res+Integer.parseInt(res_s.charAt(i)+"");
			}
		}
		System.out.println(res);	
	}//----
	
	public void ejercicio4(Scanner _input) {
		
		int h=0;
		System.out.println("Inserte una altura");
		h=_input.nextInt();
		
		//primer modulo
		for(int i=1;i<=h-1;i++) {
			
			System.out.print("*");
			
			for(int u=1;u<=h-2;u++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");	
		}
		
		System.out.print(" ");
		
		for(int y=1;y<=h-2;y++) {
			System.out.print("*");
		}
		
	}
	
	public void ejercicio5(Scanner _input) {
		
		String cad="";
		String cad_aux="";
		int cad_long=0;
		System.out.println("Pon una Cadena");
		_input.nextLine();
		cad=_input.nextLine();
		cad_long=cad.length()-1;
		
		for(int i=0;i<=cad_long;i++) {
			if(cad.charAt(i)=='a') {
				cad_aux=cad_aux+'e';
			}
			else {
				cad_aux=cad_aux+cad.charAt(i);
			}
		}
		System.out.println(cad_aux);	
		}
	
	
	
	}
	

