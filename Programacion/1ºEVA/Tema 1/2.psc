Algoritmo sin_titulo
	definir edad como entero;
	leer edad;
	
	si edad <= 14 entonces
		option = 1;
	FinSi
	si edad <= 26 y edad>14  entonces
		option = 2;
	FinSi
	si edad <=59 y edad>26 entonces
		option = 3;
	FinSi
	si edad>59 entonces
		option = 4;
	FinSi
	
	
	Segun option Hacer
		1:
			escribir "infancia";
		2:
			escribir "Juventud"
		3:
			escribir "Adultez";
		4:
			escribir "persona mayor";	
		De Otro Modo:
			escribir"error";
	Fin Segun
	
	
	
	
FinAlgoritmo
