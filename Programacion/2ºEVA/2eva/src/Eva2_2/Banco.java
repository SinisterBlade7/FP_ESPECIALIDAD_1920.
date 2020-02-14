package Eva2_2;
public class Banco {
	int dinero=0;
	String nombre="";
	String apellido="";
	
	public void ingresar(int influx) 
	{
	dinero=dinero+influx;	
	}
	public void retirar(int outflux) 
	{
	dinero=dinero-outflux;	
	}
	
	//GETTERS
	public int getDinero() {
		return dinero;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	//SETTERS
	public void setNombre(String _nombre) {
		nombre=_nombre;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	public void showInfo() {
		System.out.println("Nombre: "+nombre+"  Apellido: "+apellido);
		System.out.println("Saldo: "+dinero);
	}
	
	public Banco() {
		
		nombre="_nombre";
		apellido="_apellido";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
