Algoritmo calculadora
	definir n,x como entero;
	
	
	Repetir
		Escribir "Escriba la operación que desea realizar";
		Escribir "1-->Suma";
		Escribir "2-->Resta";
		Escribir "3-->Multiplicacion";
		Escribir "4-->Division";
		escribir "0-->Salir";
		Leer n;
		x=n;
		Segun n Hacer
			
			0:
				escribir"Gracias por usar esta calculadora :D";
			1:
				suma;
			2:
				resta;
			3:
				multi;
			4:
				division;
			De Otro Modo:
				escribir "error"
		Fin Segun
	Hasta Que x=0
	
	
	
FinAlgoritmo

SubAlgoritmo suma 
	definir a,b como reales;
	Escribir"Primer valor";
	leer a;
	escribir "Segundo valor";
	leer b;
	escribir "el resultado es ",a+b;
FinSubAlgoritmo

SubAlgoritmo resta 
	definir a,b como reales;
	Escribir"Primer valor";
	leer a;
	escribir "Segundo valor";
	leer b;
	escribir "el resultado es ",a-b;
FinSubAlgoritmo

SubAlgoritmo division
	definir a,b como reales;
	Escribir"Primer valor";
	leer a;
	escribir "Segundo valor";
	leer b;
	escribir "el resultado es ",a/b;
FinSubAlgoritmo

SubAlgoritmo multi
	definir a,b como reales;
	Escribir"Primer valor";
	leer a;
	escribir "Segundo valor";
	leer b;
	escribir "el resultado es ",a*b;
FinSubAlgoritmo