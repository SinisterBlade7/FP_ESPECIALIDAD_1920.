package eva2;
import java.util.Scanner;
public class Alumnos {
	Scanner in = new Scanner(System.in);
	public String dni="";
	public String nombre="";
	public String apellidos="";
	public int n_asignaturas=0;
	public int notas[]=new int[5];
	public int horas[]=new int[5];
	//SETTERS
	
	public void setHoras() {
		for(int i=0;i<n_asignaturas;i++) {
			horas[i]=(int)(Math.random()*10+1);
		}
	}
	public void setN_asignaturas(int n_asignaturas) {
		this.n_asignaturas=n_asignaturas;
	}
	public void setApellido(String apellidos) {
		this.apellidos=apellidos;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setNotas() {
		
		for(int i=0;i<n_asignaturas;i++) {
			notas[i]=(int)(Math.random()*10+1);
		}	
	}
	//GETTERS
	public int getMedia() {
		int media=0;
		int u=0;
		for(int i=0;i<getN_asignaturas();i++) {
			media=media + getNotas()[i];
			u=i+1;
		}
		media=media/u;
		return media;
	}
	public int[] getNotas() {
		return notas;
	}
	public int[] getHoras() {
		return horas;
	}
	public int getN_asignaturas() {
		return n_asignaturas;
	}
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void evaluacion() {
		int horas_total=0;
		int horas_asign_pend=0;
		for(int i=0;i<getN_asignaturas();i++) {
			horas_total=horas_total+getHoras()[i];
		}
		
		for(int i=0;i<getN_asignaturas();i++) {
			
			if(getNotas()[i]<5) {
				horas_asign_pend=horas_asign_pend+getHoras()[i];
			}
		}
		if(horas_asign_pend>(horas_total*0.3)) {
			System.out.println("No promociona");
		}
		else {
			System.out.println("Promociona");
		}
	}
	
	
	
	public void showInfo() {
		System.out.println("NIA: "+getDni());
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellidos: "+getApellidos());
		System.out.println("Numero de asignaturas:" +  getN_asignaturas());
		System.out.println("Notas:");
		for(int i=0;i<getN_asignaturas();i++ ) {
			System.out.println("Asignatura_"+(i+1)+": "+getNotas()[i]+"   Numero de horas: "+getHoras()[i]);
		}
		System.out.println("Media: "+getMedia());
		evaluacion();
		System.out.println("");
		
	}
	public Alumnos() {
		for(int i=0;i<5;i++) {
			dni=dni+String.valueOf((int)(Math.random()*30+1));
		}
		this.nombre=dni+"_nombre";
		this.apellidos=dni+"_apellidos";
		this.n_asignaturas=(int)(Math.random()*5+1);
		setNotas();
		setHoras();
	}
	
	
	
}
