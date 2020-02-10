Algoritmo sin_titulo
	definir n como entero;
	definir n_mayor como entero;
	definir n_menor como entero;
	definir cont como entero;
	escribir "¿Cuántos numeros va a comparar?";
	leer cont;
	escribir"Inserte un numero";
	leer n;
	n_mayor=n;
	n_menor=n;
	Repetir
		escribir "Inserte otro mas"
		leer n;
		si n>=n_mayor entonces
			n_mayor=n;
		FinSi
		si n<=n_menor entonces
			n_menor=n;
		FinSi
		cont=cont-1;
	Hasta Que cont=1
	
	escribir "El numero mayor es-->",n_mayor;
	escribir "El numero menor es-->",n_menor;
	
FinAlgoritmo
