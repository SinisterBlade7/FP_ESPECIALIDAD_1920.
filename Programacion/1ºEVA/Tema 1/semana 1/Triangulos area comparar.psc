Algoritmo sin_titulo
	Definir area_primero Como Real;
	Definir area_segundo Como Real;
	Definir base_primero Como Real;
	Definir altura_primero Como Real;
	Definir base_segundo Como Real;
	Definir altura_segundo Como Real;
	Escribir"base y altura del primero";
	Leer base_primero;
	Leer altura_primero;
	Escribir"base y altura del segundo";
	Leer base_segundo;
	Leer altura_segundo;
	
	area_primero=(base_primero*altura_primero)/2;
	area_segundo=(base_segundo*altura_segundo)/2;
	
	Si area_primero>area_segundo Entonces
		Escribir "El primer triangulo tiene mas area";
	FinSi
	Si area_primero<area_segundo Entonces
		Escribir "El segundo triangulo tiene mas area";
	FinSi
	Si area_primero=area_segundo Entonces
		Escribir "Tienen el mismo area";
	FinSi
	Escribir area_primero;
	Escribir area_segundo;
	
	
FinAlgoritmo
