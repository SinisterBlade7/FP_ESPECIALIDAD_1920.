Algoritmo sin_titulo
	definir contador como entero; contador =0;
	definir clave como caracter;
	
	escribir "Dime la clave";
	
	Mientras  contador<3 Hacer
		leer clave;
		si clave="eureka" entonces
			contador=3;
			escribir "correcto";
		sino 
			escribir "error"
			contador=contador+1;
			si contador=3 Entonces
				escribir "Ha sobrepasado el numero de fallos maximo";
			FinSi
		FinSi
		
		
	Fin Mientras
	
	
	
	
FinAlgoritmo
