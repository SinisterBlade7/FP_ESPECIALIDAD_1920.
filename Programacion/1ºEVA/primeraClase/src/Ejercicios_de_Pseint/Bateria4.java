package Ejercicios_de_Pseint;
import java.util.Scanner;
public class Bateria4 {

	public void ejercicios(Scanner _input) {
		int a=0;
		System.out.println("Qué ejercicio desea hacer?");
		a=_input.nextInt();
		
		switch(a) {
		case 1:
			uno(_input);
			break;
		case 2:
			dos(_input);
			break;
		case 3:
			tres(_input);
			break;	
		case 4:
			cuatro(_input);
			break;	
		
		case 5:
			cinco(_input);
			break;
			
		case 6:
			seis(_input);
			break;	
			
		case 7:
			siete(_input);
			break;		
			
		case 8:
			ocho(_input);
			break;	
			
		case 9:
			nueve(_input);
			break;		
			
		case 10:
			diez(_input);
			break;	
		case 11://WORK IN PROGRESS;
			once(_input);
			break;		
			
			
		}
	}
	
	public void uno(Scanner _input) {
		String cadena="";
		String a;
		char x;
		int i=0;
		
		_input.nextLine();
		System.out.println("Escriba una cadena");
		cadena=_input.nextLine();
		System.out.println("Escriba un caracter");
		a=_input.nextLine();
		
		if (a.length() ==1) {
		int length=0;	
		int contador=0;
		length=cadena.length();	
		length--;
		
		while (i<=length) {
			
			x=cadena.charAt(i);
			if(x==a.charAt(0))
			{
				contador++;
			}
			
			i++;
		}
		System.out.println("El caracter se repite "+contador+" veces en la cadena");	
		}
		else {
			System.out.println("error");
		}
		
		
	}
	
	public void dos(Scanner _input) {
		
	String a="";
	int longitud=0;
	char caracter;
	int digito=0,letras=0,espacios=0;;
	String espacio=" ";
	boolean x=true;
	
	
	System.out.println("Di una cadena");
	_input.nextLine();
	a=_input.nextLine();
	longitud=a.length();
	longitud--;
	
	for(int i=0;i<=longitud;) {
		
		caracter=a.charAt(i);
		
		if(caracter=='0' || caracter=='1' || caracter=='2' || caracter=='3' || caracter=='4' || caracter=='5' ||
				caracter=='6' || caracter=='7' | caracter=='8' || caracter=='9') {
			digito++;
			System.out.println("digitos++");
			x=false;
		}
		
		
		if(caracter==espacio.charAt(0)) {
			espacios++;
			System.out.println("espacios++");
			x=false;
		}
		
		if(x==true) {
			letras++;
			System.out.println("letras++");
		}
		
		
		i++;
	}
		System.out.println("letras:");
		System.out.println(letras);
		
		System.out.println("digitos:");
		System.out.println(digito);
		
		System.out.println("espacios:");
		System.out.println(espacios);
		
	}
	
	public void tres(Scanner _input) {
		
		String cadena="";
		int longitud=0;
		System.out.println("Escribe una cadena");
		
		_input.nextLine();
		cadena=_input.nextLine();
		
		longitud=cadena.length();
		longitud--;
		
		while(longitud>=0) {
			System.out.print(cadena.charAt(longitud));
			longitud--;
		}
	}
	
	public void cuatro(Scanner _input) {
		int Lado=0,lado=0,h=0;
		System.out.println("Lado A");
		Lado=_input.nextInt();
		System.out.println("Lado B");
		lado=_input.nextInt();
		System.out.println("Altura");
		h=_input.nextInt();
		System.out.println("El volumen de la piramide es: "+Lado*lado*h/3);
	}
	
	public void cinco(Scanner _input) {
		int a=0,b=0;
		a=(int)(Math.random()*100);
		if(a==0) {
			a=1;
		}
		System.out.println("A="+a);
		
		for(int i=0;i<6;i++) {
			System.out.println("Adivina el numero");
			b=_input.nextInt();
			if(b==a) {
				System.out.println("Correcto");
				i=6;
			}
			if(b!=a && i!=5) {
				System.out.println("Vuelve a intentarlo");
			}
		}
		if(b!=a) {
		System.out.println("Supero el limite de intentos.");
		}	
	}		
	
	public void seis(Scanner _input) {
		
		String a="";
		String b="";
		int lim=0;
		int i=0;
		
		_input.nextLine();
		System.out.println("Primera cadena");
		a=_input.nextLine();
		System.out.println("Segunda cadena");
		b=_input.nextLine();
		
		lim=a.length()-1;
		System.out.println(lim);
		
		while(i<=lim)
		{
			if(a.charAt(i)==b.charAt(i))
			{
				a = a.replace(a.charAt(i), a.toUpperCase().charAt(i));
				System.out.println("funciona"+a);
			}
			i++;
		}
		System.out.println(a);
		//String aux;
		//aux = ""+a.charAt(i);
		//a.replace(aux, aux.toUpperCase());		
		
		
	}

	public void siete (Scanner _input) {
		String cadena="";
		int cadena_long=0;
		System.out.println("Escribe una cadena");
		_input.nextLine();
		cadena=_input.nextLine();
		cadena_long=cadena.length()-2;
		
		System.out.print(cadena);
		
		while(cadena_long>=0) {
			System.out.print(cadena.charAt(cadena_long));
			cadena_long--;
		}
		
		
	}
	
	public void ocho(Scanner _input) {
		int a=0;
		while(a<=90) {
			System.out.print("Grados"+a);
			System.out.println(" => Radianes equivalente"+Math.toRadians(a));
			System.out.println(Math.cos(Math.toRadians(a)));
			a=a+5;
		}
	}
	
	public void nueve(Scanner _input) {
		int x=0,y=0;
		System.out.println("x-->");
		x=_input.nextInt();
		System.out.println("y-->");
		y=_input.nextInt();
		System.out.println(Math.sqrt(x+4*Math.pow(y, 3)	));	
	}
	
	public void diez(Scanner _input) {
		int x=0,y=0;
		String n="";
		float t= (1.0f/3.0f),z=0;
		
		System.out.println("x-->");
		x=_input.nextInt();
		System.out.println("y-->");
		y=_input.nextInt();
		System.out.println(t);
		z=(float) Math.pow(( x*y  ),t);
		n=""+z;
		System.out.println(n);
	}
		
	public void once(Scanner _input) {
		
		String a ="";
		String a_aux="";
		String b ="";
		String b_aux="";
		String c ="";
		int a_long=0;
		int i=0;
		int cont=0;
		int b_long=0;
		int contador=1;
		int u=0;
		boolean cr=true;
		
		_input.nextLine();
		System.out.println("Inserte la primera cadena");
		a=_input.nextLine();
		System.out.println("Inserte la segunda cadena");
		b=_input.nextLine();
		a_long=a.length()-1;
		b_long=b.length()-1;
		
		
		for(int o=0;o<=b_long;o++) {
			if(Character.isWhitespace(b.charAt(o))) {
				contador++;
			}
			
		}
		
		for(int x=1;x<=contador;x++) {
		
		
		
		//pilla b_aux
		while(u<=b_long && cr==true)	{
			
			if(Character.isWhitespace(b.charAt(u))) {
				
				cr=false;
			}
			else {
				b_aux=b_aux+b.charAt(u);
			}	
		u++;
		}
		System.out.println("b_aux: "+b_aux);
		cr=true;
		
		
		
		while(i<=a_long) {
		
		
		while(i<=a_long && cr==true) {	
			
			if(Character.isWhitespace(a.charAt(i))){
				i++;
				cr=false;
			}		
			else {
			a_aux=a_aux+a.charAt(i);
			i++;
			}
		}//coge a_aux
		cr=true;
		System.out.println("a_aux: "+a_aux);
		
		if(a_aux.contentEquals(b_aux)) {
			c=c+" "+a_aux.toUpperCase();
			
		}
		else {
			c=c+" "+a_aux;
		}
		
		a_aux="";
		
		
		}
		b_aux="";
		}
		
		
		System.out.println(c);

		}
	
}
