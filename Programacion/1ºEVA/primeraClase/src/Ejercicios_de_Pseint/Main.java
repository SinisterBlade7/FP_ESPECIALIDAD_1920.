package Ejercicios_de_Pseint;
import java.util.Scanner;

public class Main 
{
	public static void uno (Scanner _input) {
		int a;
		a=_input.nextInt();
		if (a%2==0) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}
	}
	
	public static void dos (Scanner _input) {
		int horas,salario;
		System.out.println("Horas");
		horas=_input.nextInt();
		System.out.println("Salario");
		salario=_input.nextInt();
		System.out.println("Cobrará: "+horas*salario);
	}
	
	public static void tres(Scanner _input) {
		String nombre;
		String pass;
		String pass2;
		_input.nextLine();//El problema es que el scanner se queda bloqueado pensando que espera un número o que contiene basura, solución pedir una cadena antes para limpiarlo
		
		System.out.println("Nombre");
		nombre=_input.nextLine();
		
		System.out.println("Contraseña");
		pass=_input.nextLine();
		
		
		
		System.out.print("Para iniciar sesion como "+nombre);
		System.out.println(" inserte su contraseña");
		
		for(int i=1;i<=3;i++) 
		{
			
			pass2=_input.nextLine();
			
			if(pass.contentEquals(pass2)) 
			{
			System.out.println("Joined");
			}
			else {
			System.out.println("Error");
			}
		}
		
		
	}
	
	public static void cuatro(Scanner _input,Printer _p) {
		
		int resultado=0,n=0;
		int i=1,resto=0;
		System.out.println("Dime un numero: ");
		n=_input.nextInt();
		while(n>=2)
		{
			resto=n%2;
			n=n/2;
			resultado=(resto*i)+resultado;
			i=i*10;
		}
		resultado=(i*n)+resultado;
		
		_p.pr(resultado);
	}
	
	public static void cinco(Scanner _input, Printer _p) {
		
		for(int i=1;i<=100;i++) {
			_p.pr(i);
		}
	}
	
	public static void seis(Scanner _input, Printer _p) {
		int a;
		_p.pr("Dime un numero");
		a=_input.nextInt();
		for(int i=1;i<=10;i++) {
		_p.pr(a*i);	
		}	
	}
	
	public static void siete(Scanner _input, Printer _p) {
		
		int a,b=0;
		int lim=10;
			for(int i=1;i<=lim;i++)
			{
				a=_input.nextInt();
				b=a+b;
		}
			_p.pr("Suma:");
			_p.pr(b);
			_p.pr("Media");
			_p.pr(b/lim);
	}
	
    public static void ocho(Scanner _input, Printer _p) {
		
    	int a=0,x=0,y=0;
    	
    	for(int i=1;i<=10;i++)
    	{
		_p.pr("Insterte un numero");
		
    	a=_input.nextInt();
    	
    		if(a>=7) 
    		{
    		x++;
    		}
    		else {
    		y++;	
    		}
    	}
    	
    	_p.pr("Aprobados: ");  _p.pr(x);
    	_p.pr("Suspensos: ");  _p.pr(y);
	}

    public static void nueve(Scanner _input, Printer _p) {
    	
    	int a=0,n1=0,n2=0,n3=0;
    	
    	for(int i=1;i<=4;i++) {
    		_p.pr("Inserte un numero");
    		a=_input.nextInt();
    		
    		if(a%3==0) {
    			n1++;
    		}
    		if(a%5==0) {
    			n2++;
    		}
    		if(a%3==0 && a%5==0) {
    			n3++;
    		}
    		}
    	
    	_p.pr("Multiplos de 3: ");
    	_p.pr(n1);
    	_p.pr("Multiplos de 5: ");
    	_p.pr(n2);
    	_p.pr("Multiplos de 3 y 5: ");
    	_p.pr(n3);
    }
    
	public static void request (Scanner _input,Printer _p)
	{
		int b;
		_p.pr("Elige un ejercico a realizar.");
		b=_input.nextInt();
		
		switch(b) {
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
			cuatro(_input,_p);
		break;	
		
		case 5:
			cinco(_input, _p);
		break;	
		
		case 6:
			seis(_input, _p);
		break;	
		
		case 7:
			siete(_input, _p);
		break;	
		
		case 8:
			ocho(_input, _p);
		break;	
		
		case 9:
			nueve(_input, _p);
		break;	
		}	
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Printer p= new Printer();
		bateria1 x= new bateria1();
		Bateria3 z= new Bateria3();
		Bateria4 y=new Bateria4();
		Bateria5 j=new Bateria5();
		Bateria6 k=new Bateria6();
		Bateria7 l=new Bateria7();
		int a=0;
		
		
		p.pr("Elige la bateria de ejercicios que quieres hacer.");
		p.pr("1-->Bateria1");
		p.pr("2-->Bateria2");
		p.pr("3-->Bateria3");
		p.pr("4-->Bateria4");
		p.pr("5-->Bateria5");
		p.pr("6-->Bateria6");
		p.pr("7-->Bateria7");
		a=input.nextInt();
		
		
		switch(a) {
		case 1:
			p.pr("Bateria 1: ");
			x.setN(input,p);
			x.ejer(p,input);
			break;
		case 2:	
			p.pr("Bateria 2: ");
			request(input,p);
			break;
		case 3:
			p.pr("Bateria 3: ");
			z.ejercicios(input,p);
			break;
		case 4:
			p.pr("Bateria 4: ");
			y.ejercicios(input);
			break;
		case 5:
			p.pr("Bateria 5: ");
			j.ejercicios(input);
			break;
		case 6:
			p.pr("Bateria 6: ");
			k.ejercicios(input);
			break;	
		case 7:
			p.pr("Bateria 7: ");
			l.ejercicios(input);
			break;		
			
			
		}
		
		input.close();
	}
}
