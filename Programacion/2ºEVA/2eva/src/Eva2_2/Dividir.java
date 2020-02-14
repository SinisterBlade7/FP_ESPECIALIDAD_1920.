package Eva2_2;

public class Dividir extends Operaciones {

	public void dividir() 
	{
		resultado=0;
		float aux=0;
		for(int i=1;i<=operando1;i++) 
		{
			aux=multi(operando2,i);
			if(aux<=operando1) {
				resultado=i;
			}
			aux=0;
		}
	}
	
	public float multi(float num1,int num2) {
		float res=0;
		for(int i=1;i<=num2;i++) {
			res=res+num1;
		}
		return res;
	}
	
}
