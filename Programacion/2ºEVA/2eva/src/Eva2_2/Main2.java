package Eva2_2;
import javax.swing.*;
import java.util.Scanner;

public class Main2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		int num=0;
		System.out.println("Elige un ejercicio");
		num=in.nextInt();
		
		if(num==1) 
		{
		
			int range=1;
			int demanda=0;
			Banco banc[]=new Banco[range];	
			Banco banc_aux[]=new Banco[range];	
			
			boolean bucle1=true;
			int menu1=0;
			int n_cuenta=-1;
			String _nombre="";
			String _apellido="";
			
			while(bucle1==true) 
			{
				System.out.println("1-Crear cuenta");
				System.out.println("2-Acceder");
				System.out.println("0-Salir");
				menu1=in.nextInt();
				
				if(menu1==0) //SALIR
				{
					bucle1=false;
				}
				
				if(menu1==1)/*CREAR CUENTA */  
				{
					demanda++;
					if(demanda==1) {
						banc[0]=new Banco();
					}
					else 
					{
						if(demanda>range) 
						{
						++range;
						
						for(int i=0;i<banc.length;++i) 
						{
							banc_aux[i]=banc[i];
						}
						banc=new Banco[range];
						for(int i=0;i<banc_aux.length;i++) 
						{
							banc[i]=banc_aux[i];
							
						}
						banc[range-1]=new Banco();
						banc_aux=new Banco[range];
						System.out.println("Refresh completed");
						}
					}
					for(int i=0;i<banc.length;i++) 
					{
						if(banc[i].getNombre().contentEquals("_nombre") && 
								banc[i].getApellido().contentEquals("_apellido") ) 
						{
							System.out.println("Nombre");
							in.nextLine();
							_nombre=in.nextLine();
							System.out.println("Apellido");
							_apellido=in.nextLine();
							banc[i].setNombre(_nombre);
							banc[i].setApellido(_apellido);
						}	
					}	
				}
				if(menu1==2) //LOG IN
				{
					System.out.println("Log in");
					System.out.println("Nombre:");
					in.nextLine();
					_nombre=in.nextLine();
					System.out.println("Apellido:");
					_apellido=in.nextLine();
					n_cuenta=accountSelector(banc,_nombre,_apellido);
					
					if(n_cuenta !=(-1)) 
					{
						int logged_menu=0;
						int dinero=0;
						
						System.out.println("LOGGED");
						for(int i=1;i!=0;) 
						{
							System.out.println("Bienvenido "+banc[n_cuenta].getNombre());
							System.out.println("");
							System.out.println("1-Ingresar dinero");
							System.out.println("2-Retirar dinero");
							System.out.println("3-Consultar información");
							System.out.println("0-Cerrar sesión");
							logged_menu=in.nextInt();
							switch(logged_menu) 
							{
							case 0:
								i=0;
							break;
							
							case 1:
								System.out.println("Inserte la cantidad que desea ingresar");
								dinero=in.nextInt();
								if(dinero>0) {
									banc[n_cuenta].ingresar(dinero);
									System.out.println("Su dinero ha sido ingresado");
								}
								else {
									System.out.println("No ha sido posible efectuar la transacción :(");
								}
								
								System.out.println("");
							break;	
							case 2:
								System.out.println("Inserte la cantidad que desea retirar");
								dinero=in.nextInt();
								if(dinero<banc[n_cuenta].getDinero()) 
								{ 
								banc[n_cuenta].retirar(dinero);
								System.out.println("Su dinero ha sido retirado");
								}
								else {
									System.out.println("No ha sido posible efectuar la transacción :(");
								}
								System.out.println("");
							break;	
							case 3:
								banc[n_cuenta].showInfo();
							break;
							}
						}	
					}
				}//Log in
			}		
		}
		
		
		if(num==2) 
		{
			Operaciones op = new Operaciones();
			Suma suma=new Suma();
			Resta resta=new Resta();
			Dividir dividir=new Dividir();
			Multiplicar multi=new Multiplicar();
			
			String input="";
			
			int operador_pos=-1;																																											//rth
			System.out.println("Calculadora by Dan");
			System.out.println("B-->Borrar");
			System.out.println("S-->Salir");
			in.nextLine();
			
			//INICIO
			for(int o=0;o==0;) 
			{
			input=in.nextLine();
			input=input.trim();
			if(input.charAt(0)=='S') {
				o=1;
			}
			else 
			{
			for(int i=0;i<input.length();i++) //buscador de operador
			{	
				if(input.charAt(i)=='+' || input.charAt(i)=='-' ||
						 input.charAt(i)=='*' ||  input.charAt(i)=='/'	)
				{
				operador_pos=i;	
				}
			}
			if(operador_pos==(-1)) {
				System.out.println("error: operator not found");
			}
			else {
			op.setOperando1(Float.parseFloat(input.substring(0, (operador_pos))));
			op.setOperando2(Float.parseFloat(input.substring(operador_pos+1, input.length())));
			op.setOperador(input.charAt(operador_pos));
			calcu(op, suma, resta, multi, dividir);
			System.out.print(op.getResultado());
			for(int u=0;u==0;) 
			{//Empezar bucleada
			input=in.nextLine();
			if(input.charAt(0)=='B') {
				u=1;
			}
			else 
			{
			if(input.charAt(0)=='S') 
			{
				o=1;
				u=1;
			}	
			else {	
			for(int i=0;i<input.length();i++) //buscador de operador
			{	
				if(input.charAt(i)=='+' || input.charAt(i)=='-' ||
						 input.charAt(i)=='*' ||  input.charAt(i)=='/'	)
				{
				operador_pos=i;	
				}
			}
			op.setOperando1(op.getResultado());
			op.setOperando2(Float.parseFloat(input.substring(operador_pos+1, input.length())));
			op.setOperador(input.charAt(operador_pos));
			calcu(op, suma, resta, multi, dividir);
			System.out.print(op.getResultado());
			}
			}
			}//bucle2
			}
			}
			}//main bucle
		}//case:2	
		
}//END MAIN--------------------------

	
	public static void calcu(Operaciones op,Suma suma,Resta resta,Multiplicar multi, Dividir dividir) {
		
		if(op.getOperador()=='+') {
			suma.sumar();
		}
		if(op.getOperador()=='-') {
			resta.resta();
		}
		if(op.getOperador()=='*') {
			multi.multiplicar();
		}
		if(op.getOperador()=='/') {
			dividir.dividir();
		}
	}
	
		public static int accountSelector(Banco banc[],String _nombre,String _apellido) 
	{
		int r=-1;
		
		for(int i=0;i<banc.length;i++) 
		{
			if((_nombre.contentEquals(banc[i].getNombre()) ) && 
					(_apellido.contentEquals(banc[i].getApellido())) ) 
			{
				r=i;
			}
		}
		if(r!=(-1)) {
			return r;
		}
		else {
			System.out.println("No coinciden nombre y "
			+ "contraseña con nuestra base de datos");
			return r;
		}
	}
}
