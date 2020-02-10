package primeraPaquete;

public class Main {

	public static void main(String[] args) 
	{
		Reptil o1 = new Reptil();
		o1.setEspecie("Cobra");
		o1.setVeneno(true);
		o1.setEstado("Viva");
		
		o1.setFecha_de_nacimiento("27/6/2001");
		o1.setColor("verde");
		
		
		Reptil o2 = new Reptil();
		o2.setEspecie("Cocodrilo");
		o2.setEstado("Muerto");
		
		o2.setFecha_de_nacimiento("4/2/1999");
		o2.setColor("verde");
		
		
		Reptil o3 = new Reptil();//Llamamos al constructor, CONSTRUYE el objeto
		o3.setEspecie("Mamba negra");//llamamos a los setters MODIFICAN al objeto
		o3.setVeneno(true);
		o3.setEstado("Enferma");
		
		o3.setFecha_de_nacimiento("4/2/1945");
		o3.setColor("negra");
		
		
		Reptil o4 = new Reptil("españa", false, true,"azul",2);
		
		Reptil o5=new Reptil(o4);
		
		o5.mostrarInfo();
				
		
		
		
		//peso, altura, raza, fech, nac
	}

}
