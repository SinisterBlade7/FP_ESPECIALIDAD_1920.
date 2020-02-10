Algoritmo sin_titulo
	definir n,i como entero;
	leer n;
	Repetir
		escribir n%10;
		n=n-(n%10);
		n=n/10;
		i=i+1;
	Hasta Que i=4
FinAlgoritmo
