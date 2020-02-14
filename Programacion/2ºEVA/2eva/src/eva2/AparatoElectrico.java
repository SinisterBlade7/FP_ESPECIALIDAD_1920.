package eva2;

public class AparatoElectrico {

	boolean estado=false;
	int consumo=0;
	static int limite=0;
	static int potencia_total=0;
	
	public void setEstado(boolean _estado) {
		estado=_estado;
		setPotencia_total();
	}
	public void setPotencia_total() {
		potencia_total=potencia_total+consumo;
	}
	
	
	public boolean getEstado() {
		return estado;
	}
	public int getConsumo() {
		
		if(getEstado()==true) {
			return consumo;
		}
		else {
			return 0;
		}	
	}
	static int getLimite() {
		return limite;
	}
	
	
	
	public void showInfo() {
		System.out.print("Estado="+getEstado() + "--");
		System.out.println("Consumo="+getConsumo());
	}
	
	
	
	public AparatoElectrico(boolean random,int _limite,int _consumo,boolean _estado) {
		
		estado=false;
		
		if(random) {
			consumo=(int)(Math.random()*100+1);
			limite=(int)(Math.random()*100+1)+100;
		}
		else {
			consumo=_consumo;
			limite=_limite;
			estado=_estado;
		}
	}
	
	
	
	
	
	
}
