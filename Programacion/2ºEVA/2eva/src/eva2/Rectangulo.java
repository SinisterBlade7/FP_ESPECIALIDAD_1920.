package eva2;

public class Rectangulo {
 
	String nombre="";
	String nombre_figura="";
	int  x1 [] =new int[2];
	int  x2 [] =new int[2];
	static int contador=0;
	
	public String getnombre_figura() {
		return nombre_figura;
	}
	public void nombre_figura(String _nombre_figura) {
		nombre_figura=_nombre_figura;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int [] get_x1() {
		return x1;
	}
	public int [] get_x2() {
		return x2;
	}
	
	public Rectangulo(String _nombre,int _x1_i,int _x1_j,int _x2_i,int _x2_j) {
			nombre_figura="Rectangulo";
			nombre=_nombre;
			x1[0]=_x1_i;
			x1[1]=_x1_j;		
			x2[0]=_x2_i;
			x2[1]=_x2_j;
			contador++;
	}
	
	public int getContador() {
		return contador;
	}
	
	public int calcular_superficie() {
		int i=0,j=0;
		i=Math.abs(x2[0]-x1[0]);
		j=Math.abs(x2[1]-x1[1]);
		return i*j;
	}
	
	public int calcular_perimetro() {
		int i=0,j=0;
		i=Math.abs(Math.abs(x2[0])-Math.abs(x1[0]));
		j=Math.abs(Math.abs(x2[1])-Math.abs(x1[1]));
		return (i*2)+(j*2);
	}
	
	public void desplazar(int i, int j) {
		x1[0]=x1[0]+i;
		x1[1]=x1[1]+j;		
		x2[0]=x2[0]+i;
		x2[1]=x2[1]+j;
	}
	
	
	public void show_info() {
		System.out.println(getNombre());
		System.out.println("x1= "+get_x1()[0]+","+get_x1()[1]);
		System.out.println("x2= "+get_x2()[0]+","+get_x2()[1]);
		System.out.println("Superficie: "+calcular_superficie());
		System.out.println("Perimetro: "+calcular_perimetro());
		
	}
	
	
	
}
