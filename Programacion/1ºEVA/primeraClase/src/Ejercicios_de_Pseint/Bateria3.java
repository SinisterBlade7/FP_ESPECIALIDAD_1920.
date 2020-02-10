package Ejercicios_de_Pseint;
import java.util.Scanner;
public class Bateria3 {

	int n;
	
	public void getEjercicios(Scanner _input, Printer _p) {
		
		_p.pr("Dime que ejercicio vas a hacer");
		n=_input.nextInt();
		
	}
	
	
	public void ejercicios(Scanner _input, Printer _p) {
		
		getEjercicios(_input,_p);
		
		switch(n) {
		
		case 1:
			uno(_input,_p);		//work in progress
			break;
		case 2:
			dos(_input,_p);		//work in progress :(
			break;
		case 3:
			tres(_input,_p);
			break;
		case 4:
			cuatro(_input,_p);
			break;
		}
		
		
	
	}
	
	public void uno(Scanner _input, Printer _p) {
		
		int n=0;
		
		int i=1;
		
		_p.pr("Insterte un numero");
		n=_input.nextInt();
		_p.pr("Su numero es: "+n);
		
		
		while(n>0) {
			n=n/10;
			i=i*10;	//cuenta cuantas cifras tiene el numero
		}
		
		i=i/10;
		_p.pr(i);
		
		
	
	}
	
	public void dos(Scanner _input, Printer _p) {
		int n=0;
		int n_aux=0;
		int res=1;
		_p.pr("dime un numero");
		n=_input.nextInt();
		n_aux=n;
		while(n_aux>0) {
		
		n=n_aux;	
			
		while(n>0) {
			res=n*res;
			n--;
		}
		_p.pr(res);
		res=1;
		n_aux--;
		}
		}
	
	//binario
	public void binario(Scanner _input, Printer _p,int _num) {
		
		
		
		int n=0;
		n=_num;
		int resto=0;
		
		
		String resultadoString ="";
		while(n>=2)
		{
			resto=n%2;
			n=n/2;
			resultadoString=resto+resultadoString;
			
		}
		resultadoString=n  +resultadoString;
		
		
		
		//resultado = Integer.parseInt(resultadoString.trim());//copia pega de internet porque necesito el resultado como entero para futuras operaciones en otras subrutinas.
		
				_p.pr(resultadoString);
				
		}
	//octal
	public void octal(Scanner _input, Printer _p, int _num) {
		
		String resultadoString="";
		int n=0;
		n=_num;
		int resto=0;
		
		
		while(n>=8)
		{
			resto=n%8;
			n=n/8;
			resultadoString=resto + resultadoString;
			
		}
		resultadoString=n+resultadoString;
		
		_p.pr(resultadoString);
				
		}
	//hexadecimal
	public void hexadecimal(Scanner _input, Printer _p, int _num) {
		
		int n=0;
		n=_num;
		int resto=0;
		
		String res="";
		
		while(n>=16) {
			
			resto=n%16;
			
			switch(resto) {
			case 10:
				res='A'+res;
				break;
			case 11:
				res='B'+res;
				break;
			case 12:
				res='C'+res;
				break;
			case 13:
				res='D'+res;
				break;
			case 14:
				res='E'+res;
				break;
			case 15:
				res='F'+res;
				break;
			}
		
			n=n/16;
			
			if(resto>=0 && resto<=9) {
			res=resto+res;
			}
		}
		switch(n) {
		case 10:
			res='A'+res;
			break;
		case 11:
			res='B'+res;
			break;
		case 12:
			res='C'+res;
			break;
		case 13:
			res='D'+res;
			break;
		case 14:
			res='E'+res;
			break;
		case 15:
			res='F'+res;
			break;
		}
		
		if(n>=0 && n<=9) {
			res=n+res;
			}
		
		_p.pr(res);
	
	}
	
	public void tres(Scanner _input, Printer _p) {
		
		int num=0;
		int f=0;
		_p.pr("Escribe un numero");
		num=_input.nextInt();
		
		_p.pr("¿A qué formato desea pasarlo?");
		_p.pr("1-->Binario");
		_p.pr("2-->Octal");
		_p.pr("3-->Hexadecimal");
		f=_input.nextInt();
		
		switch(f) {
		case 1:
			binario(_input,_p,num);
			break;
		case 2:
			octal(_input,_p,num);
			break;
		case 3:
			hexadecimal(_input,_p,num);
			break;	
		}
	}
		
	public void cuatro(Scanner _input, Printer _p) {
	
		int a=0,b=0,x=0;
		_p.pr("Primer numero");
		a=_input.nextInt();
		_p.pr("Segundo numero");
		b=_input.nextInt();
		
		System.out.println("Que operacion desea hacer");
		System.out.println("1-->suma");
		System.out.println("2-->resta");
		System.out.println("3-->division");
		System.out.println("4-->multiplicacion");
		
		x=_input.nextInt();
		
		switch(x) {
		case 1:
			suma_cuatro(_p,a,b);
			break;
		case 2:
			resta_cuatro(_p,a,b);
			break;
		case 3:
			division_cuatro(_p,a,b);
			break;
		case 4:
			multiplicacion_cuatro(_p,a,b);
			break;
		}
	}
	public void suma_cuatro(Printer _p, int _a, int _b) {
		_p.pr(_a+_b);
	}
	public void resta_cuatro(Printer _p, int _a, int _b) {
		_p.pr(_a-_b);
	}
	public void division_cuatro(Printer _p, int _a, int _b) {
		_p.pr(_a/_b);
	}
	public void multiplicacion_cuatro(Printer _p, int _a, int _b) {
		_p.pr(_a*_b);
	}
	
	
	
	
	
	
	}
	

