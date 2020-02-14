package eva2;

public class Bombilla {

	public boolean I_particular = false;
	static boolean I_general = false;
	public boolean estado = false;
	
	public void switch_particular() {
		I_particular=!I_particular;
		refresh_estado();
	}
	public void switch_general() {
		I_general=!I_general;
		refresh_estado();
	}
	public boolean getI_particular() {
		return I_particular;
	}
	static boolean getI_general() {
		return I_general;
	}
	public boolean getEstado() {
		return estado;
	}
	public void refresh_estado() {
		if(I_particular==true && I_general==true) {
			estado=true;
		}
		else {
			estado=false;
		}
	}
	public void showInfo() {
		System.out.println("Interruptor particular: "+getI_particular());
		System.out.println("Interruptor general: "+getI_general());
		System.out.println("Estado: "+getEstado());
	}
	
	public Bombilla() {
		I_particular = false;
		 I_general = false;
		 estado = false;
	}
	
	
	
	
	
	
	
	
}
