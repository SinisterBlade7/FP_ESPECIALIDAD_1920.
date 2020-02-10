Algoritmo sin_titulo
	definir n,resto,multi,resultado como entero;
	multi=1;
	leer n;
	
	Repetir
		
		
		resto=n%2;
		n=trunc(n/2);
		
		resultado=(resto*multi)+resultado;
		
		
		multi=multi*10;
	Hasta Que n<2
	
	
	resultado=(multi*n)+resultado;
	escribir resultado;
FinAlgoritmo
