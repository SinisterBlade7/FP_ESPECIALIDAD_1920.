Algoritmo sin_titulo
	Repetir
		Escribir "Escriba la operación que desea realizar";
		Escribir "1-->Triangulo";
		Escribir "2-->Trapecio";
		Escribir "3-->Cuadrado";
		Escribir "4-->Círculo";
		escribir "0-->Salir";
		Leer n;
		x=n;
		Segun n Hacer
			
			0:
				escribir"Gracias por usar esta calculadora :D";
			1:
				tri;
			2:
				trap;
			3:
				cuad;
			4:
				circ;
			De Otro Modo:
				escribir "error"
		Fin Segun
	Hasta Que x=0
FinAlgoritmo

SubAlgoritmo tri
	definir b,h como real;
	escribir "Inserte base"; leer b;
	escribir "Inserte altura"; leer h;
	escribir "El area es ",(b*h)/2;
FinSubAlgoritmo

SubAlgoritmo trap
	definir b,b2,h como real;
	escribir "Inserte base mayor"; leer b;
	escribir "Inserte base menor"; leer b2;
	escribir "Inserte altura"; leer h;
	escribir "El area es ",(b+b2)*h/2;
FinSubAlgoritmo

SubAlgoritmo cuad
	definir b como real;
	escribir "Inserte lado"; leer b;
	escribir "El area es ",b*b;
FinSubAlgoritmo

SubAlgoritmo circ
	definir r como real;
	escribir "Inserte radio"; leer r;
	escribir "El area es ",pi*r*r;
FinSubAlgoritmo



















