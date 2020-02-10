package Ejercicios_de_Pseint;
import java.util.Scanner;
import  java.util.Random ;
public class Bateria5 {

	public void ejercicios(Scanner _input) {
		int a=0;
		System.out.println("Inserte el ejercicio que quiere hacer");
		a=_input.nextInt();
		switch(a) {
		
		case 1:
			ejercicio1( _input);
		break;
		
		case 2:
			ejercicio2( _input);
		break;
		
		case 3:
			ejercicio3( _input);
		break;
		
		case 4:
			ejercicio4( _input);
		break;
		
		case 5:
			ejercicio5( _input);
		break;
		case 6:
			ejercicio6_primos( _input);
		break;
		
		}
		
	}
	
	public void ejercicio1(Scanner _input) {
		
		String cadena="";
		String cadena2="";
		int cadena_long=0;
		
		System.out.println("Escribe una cadena");
		_input.nextLine();
		cadena=_input.nextLine();
		cadena_long=cadena.length()-1;
		
		for(int i=0;i<=cadena_long;i++) {
			if (cadena.charAt(i) ==' ') {}
			else {
				cadena2=cadena2+cadena.charAt(i);
			}	
		}
		System.out.println(cadena2);
	}
	
	public void ejercicio2(Scanner _input) {
		String cadena="",cadena1="",cadena2="",cadena3="";
		int trigger=0;
		int last_space=0;
		System.out.println("Dime una frase");
		_input.nextLine();
		cadena=_input.nextLine();
		int cadena_long=cadena.length()-1;
		
		for(int i=0;i<=cadena_long;i++)//p1
		{			
			cadena1=cadena1+cadena.charAt(i);
			
			
			if(Character.isWhitespace(cadena.charAt(i)))
			{
				i=cadena_long+1;
			}
		}		
		
		
		for(int i=0;i<=cadena_long;i++) {//p2
			
			if(Character.isWhitespace(cadena.charAt(i))) {
				last_space=i;
				
			}
			
		}
			for(int i=0;i<=cadena_long;i++) {	
				
				if(Character.isWhitespace(cadena.charAt(i)))
				{trigger=1;}
				
					if(trigger==1) {
						
						for(int z=i+1;z<last_space;z++) {
							cadena2=cadena2+cadena.charAt(z);
							}
						i=cadena_long+1;	
						}						
			}
		for(int i=last_space+1;i<=cadena_long;i++) {
			cadena3=cadena3+cadena.charAt(i);
		}
		System.out.println(cadena3+" "+cadena2+" "+cadena1);		
	}

	public void ejercicio3(Scanner _input) {
		String dni="";
		char letra = 0;
		int dni_n=0;
		int modulo=0;
		_input.nextLine();
		System.out.println("Dime tu numero de dni");
		dni=_input.nextLine();
		dni_n=Integer.parseInt(dni);
		modulo=dni_n%23;
		letra= mod(modulo);
		System.out.println(dni+letra);
	}
	
	public void ejercicio4(Scanner _input) {
		Random x=new Random();
		int a=0,b=0;
		
		a=x.nextInt();
		if(a<0) {
			a=a*(-1);
		}
		a=a%6;
		b=x.nextInt();
		if(b<0) {
			b=b*(-1);
		}
		b=b%6;
		if(a==0) {
			a++;
		}
		if(b==0) {
			b++;
		}
		System.out.println(a);
		System.out.println(b);
	}
	
	public void ejercicio5(Scanner _input) {
		int radio=0;
		float angulo=0;
		System.out.println("Radio");
		radio=_input.nextInt();
		System.out.println("Angulo");
		angulo=_input.nextFloat();
	
		System.out.println("Resultado-->");
		System.out.println((Math.PI*radio*radio*angulo)/360);
		
	}
	
	public void ejercicio6_primos(Scanner _input) {
		int a=0;
		boolean primo=true;
		System.out.println("escribe un numero");
		a=_input.nextInt();
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				primo=false;}}
		System.out.println(primo);}
	
	
	public char mod(int modulo)
	{
		char _letra=0;
		switch(modulo)
		{
		case 0:
			_letra='T';
			break;
		case 1:
			_letra='R';
			break;
		case 2:
			_letra='W';
			break;
		case 3:
			_letra='A';
			break;
		case 4:
			_letra='G';
			break;
		case 5:
			_letra='M';
			break;	
		case 6:
			_letra='Y';
			break;
		case 7:
			_letra='F';
			break;
		case 8:
			_letra='P';
			break;
		case 9:
			_letra='D';
			break;
		case 10:
			_letra='X';
			break;
		case 11:
			_letra='B';
			break;		
		case 12:
			_letra='N';
			break;
		case 13:
			_letra='J';
			break;
		case 14:
			_letra='Z';
			break;
		case 15:
			_letra='S';
			break;
		case 16:
			_letra='Q';
			break;
		case 17:
			_letra='V';
			break;	
		case 18:
			_letra='H';
			break;
		case 19:
			_letra='L';
			break;
		case 20:
			_letra='C';
			break;	
		case 21:
			_letra='K';
			break;
		case 22:
			_letra='E';
			break;	
		}
		return _letra;
	}
	
}
