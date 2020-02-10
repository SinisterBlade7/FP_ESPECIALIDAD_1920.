package primeraPaquete;

public class Reptil {

	int patas;
	boolean veneno;
	String estado;
	String fecha_de_nacimiento;
	String color;
	String especie;
	String localizacion;
	boolean escamas;
	
	//los métodos setter and getters los utilizamos cuando y donde queramos modificar un atributo
	public boolean getEscamas() {
		return escamas;
	}
	public void setEscamas(boolean _escamas) {
		escamas=_escamas;
	}

	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String _especie) {
		especie=_especie;
	}
	
	
	
	
	public boolean getVeneno() {
		return veneno;
	}
	public void setVeneno(boolean _veneno) {
		veneno = _veneno;
	}
	
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String _estado){
		estado=_estado;
	}
	
	
	public String getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}
	public void setFecha_de_nacimiento(String _fecha_de_nacimiento) {
		fecha_de_nacimiento=_fecha_de_nacimiento;
	}
	
	
	public String getColor () {
		return color;
	}
	public void setColor(String _color) {
		color=_color;
	}
	
	
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String _localizacion) {
		localizacion= _localizacion;
	}
	
	
	void mostrarInfo() {


		


		System.out.println("Veneno: "+getVeneno());
	
		
		System.out.println("Color: "+getColor());
		System.out.println("Localizacion: "+getLocalizacion());
		System.out.println("Escamas?: "+getEscamas());
		}
	
	public int getPatas() {
		// TODO Auto-generated method stub
		return patas;
	}
	//Los constructores SOLO se pueden llamar cuando creamos un objeto
	//1er tipo de constructor, constructor por defecto
	public Reptil()

	{
		localizacion="España";
		escamas=false;
		veneno= true;
	}
	
	//2º tipo de constructor, constructor por valor o referencia (es como una plantilla
	public Reptil(String _localizacion, boolean _escamas, boolean _veneno,String _color,int _patas)
	
	{
		localizacion=_localizacion;
		escamas=_escamas;
		veneno= _veneno;
		color=_color;
		
	}
	
	
	public Reptil (Reptil _x) {
		localizacion=_x.getLocalizacion();
		escamas=_x.getEscamas();
		veneno=_x.getVeneno();
		color=_x.getColor();
		
	}
	
	
	
}
