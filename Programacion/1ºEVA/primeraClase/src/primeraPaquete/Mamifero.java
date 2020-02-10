package primeraPaquete;

//Queremos crear una clase Mamifero
public class Mamifero 
{//Con las llaves decimos que aquí empieza mi clase
	
	//Estos son nuestro atributos
	//Se ponen SIEMPRE al principio de la clase ¿verdad?
	boolean sexo_masculino;//Lógico
	int  peso;//Entero
	double altura;//Real
	String fecha_nacimiento;//Cadena
	String especie;//Cadena
	int tiempo_gestacion_dias;

	public int getTiempo_gestacion_dias() {
		return tiempo_gestacion_dias;
	}

	public void setTiempo_gestacion_dias(int _tiempo_gestacion_dias) {
		tiempo_gestacion_dias = _tiempo_gestacion_dias;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String _especie) {
		especie = _especie;
	}
	
	public boolean isSexo_masculino() {
		return sexo_masculino;
	}

	public void setSexo_masculino(boolean sexo_masculino) 
	{
		this.sexo_masculino = sexo_masculino;
	}

	public int getPeso() {
		return peso;//Aquí devolvemos el valor, es peso <- getPeso() del PSeInt
	}

	public void setPeso(int peso) 
	{
		this.peso = peso;
	}

	public double getAltura() 
	{
		return altura;
	}


	public void setAltura(double altura) 
	{
		this.altura = altura;
	}


	public String getFecha_nacimiento() 
	{
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	void mostrarInfo()
	{
		System.out.println("Mostramos la información del animal");
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso: "+getPeso());
		System.out.println("Fecha nacimiento:"+getFecha_nacimiento());
		System.out.println("Su especie es: "+getEspecie());
		System.out.println("Su tiempo de gestación es de:"+getTiempo_gestacion_dias()+" dias.");
		if (isSexo_masculino())//Si (condición) entonces
			System.out.println("su género masculino");//entonces hacemos esto
		else//sino
			System.out.println("su género femenino");//Pues hacemos esto :)
	}
}//Aquí termina nuestra clase
