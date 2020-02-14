package eva2;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int ej=0;
		Scanner in = new Scanner(System.in);
		Bateria1 a= new Bateria1();
		Bateria2 b= new Bateria2();
		Bateria3 c= new Bateria3();
		
		
		System.out.println("Inserte el numero de la bateria requerida");
		System.out.println("1--->Bateria1");
		System.out.println("2--->Bateria2");
		System.out.println("3--->Bateria3");
		System.out.println("4--->Rectangulo");
		System.out.println("5--->Bombilla");
		System.out.println("6--->AparatoElectrico");
		ej=in.nextInt();
		
		
		switch(ej) {
		
		case 1:
			a.ejercicios(in);
			break;
		case 2:
			b.ejercicios(in);
			break;	
		case 3:
			c.ejercicios(in);
			break;	
		case 4:
			Rectangulo r1= new Rectangulo("Cuadradin",1,2,3,4);
			Rectangulo r2= new Rectangulo("Cuadradon",0,0,3,2);
			r2.show_info();
			r2.desplazar(2,5);
			System.out.println("");
			System.out.println("Despues del desplazamiento");
			r2.show_info();
			System.out.println("numero de rectángulos: "+r2.getContador());
			break;		
		case 5:
			int bombilla_id=0;
			int confirmacion=1;
			Bombilla b1 []= new Bombilla[20];
			for (int i = 0; i < 20; i++)
			{
				b1[i] = new Bombilla();
			}
			b1[0].switch_general();
			b1[0].switch_general();
			System.out.println("Se encenderá una bombilla, elige cual del 1 al 20");
			bombilla_id=in.nextInt();
			b1[bombilla_id-1].switch_particular();
			b1[bombilla_id-1].switch_general();
			b1[bombilla_id-1].showInfo();
			System.out.println("Desea apagarla?--1=No--2=Si");
			confirmacion=in.nextInt();
			if(confirmacion==2) {
				b1[bombilla_id-1].switch_particular();
				b1[0].switch_general();
				b1[bombilla_id-1].showInfo();
			}
			else {
				b1[bombilla_id-1].showInfo();
			}
			break;		
		case 6:
			AparatoElectrico central[]=new AparatoElectrico[5];
			int option=0;
			
				central[0]= new AparatoElectrico(false,100,70,false);
				central[1]= new AparatoElectrico(false,100,5,false);
				central[2]= new AparatoElectrico(false,100,25,false);
				central[3]= new AparatoElectrico(false,100,11,false);
				central[4]= new AparatoElectrico(false,100,100,false);
	
			System.out.println("");
			boolean bucle=true;
			
			while (bucle == true) {

				System.out.println("Menu:");
				System.out.println("1-Mostrar informacion");
				System.out.println("2-Encender");
				System.out.println("3-Apagar");
				System.out.println("0-Salir");
				option=in.nextInt();
				
				if (option == 0)
				{
					bucle = false;
				}
				// ---------------------------------
				if (option == 1)
				{
					boolean bucle1 = true;
					while (bucle1 == true) 
					{
						for (int i = 0; i < 5; i++) {
							System.out.println("Aparato " + (i+1) + ":");
							central[i].showInfo();
						}
						System.out.println("");
						System.out.println("Consumo Total: "+getPotenciaTotal(central));
						System.out.println("Limite: "+central[0].getLimite());
						System.out.println("");
						if(getPotenciaTotal(central)>=(central[0].getLimite()*0.75)) {
							System.out.println("Aviso por alto consumo");
							System.out.println("");
						}
						if((getPotenciaTotal(central)>=(central[0].getLimite() ) && ( getPotenciaTotal(central)< (central[0].getLimite()+ (central[0].getLimite()*0.1) ) ) )) {
							System.out.println("Exceso del consumo máximo");
							System.out.println("");
						}
						bucle1=false;
				}
			}
					// ---------------------------------------------
					if (option == 2) {
						
						int i = 0;
						boolean bucle2 = true;
						while (bucle2 == true) {
							
							if((getPotenciaTotal(central)>=(central[0].getLimite() ) && ( getPotenciaTotal(central)< (central[0].getLimite()+ (central[0].getLimite()*0.1) ) ) )) {
								System.out.println("Exceso del consumo máximo");
								System.out.println("");
								bucle2=false;
							}
							else{
							System.out.println("Seleccione un aparato a encender");
							System.out.println("Salir-->0");
							i = in.nextInt();
							i--;
							if (i == (-1)) {
								bucle2 = false;
							} 
							else {
								central[i].setEstado(true);
								System.out.println("Aparato "+(i+1)+" encendido");
								}
							}
						}
					}	
					if (option == 3) {
						
						int u = 0;
						boolean bucle3 = true;
						while (bucle3 == true) {
							System.out.println("Seleccione un aparato a apagar");
							System.out.println("Salir-->0");
							u = in.nextInt();
							u--;
							if (u == (-1)) {
								bucle3 = false;
							} 
							else {
								central[u].setEstado(false);
								System.out.println("Aparato "+(u+1)+" apagado");
							}
						}
					}	
				}
			break;	
		case 7:
			int alumnos=5;
			Alumnos clase[]=new Alumnos[alumnos];
			for(int i=0;i<5;i++) {
				clase[i]=new Alumnos();
			}
			for(int i=0;i<alumnos;i++) {
				clase[i].showInfo();
				System.out.println("");
			}
			System.out.println("Media de la clase: "+mediaClase(alumnos,clase));
			break;				
	}	
			
		in.close();
}
//main close-----------------------------------------------------

	public static int getPotenciaTotal(AparatoElectrico _central[]) {
		
		int pt=0;
		
		for(int i=0;i<5;i++) {
			pt=pt+_central[i].getConsumo();
		}
		return pt;
	}
	
	public static float mediaClase(int alumnos,Alumnos _clase[]) {
		
		float media_clase=0;
		int u=0;
		for(int i=0;i<alumnos;i++) {
			media_clase=media_clase+_clase[i].getMedia();
			u=i+1;
		}
		media_clase=media_clase/u;
		return media_clase;
	}
	}	

