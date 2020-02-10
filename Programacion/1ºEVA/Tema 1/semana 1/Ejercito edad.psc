Algoritmo sin_titulo
	Definir edad Como Entero;
	Definir rango_m Como Entero;
	Definir sexo Como Cadena;
	Definir sexo_reply Como Cadena;
	sexo = "H"
	rango_m =18;
	Definir rango_Ma Como Entero;
	rango_Ma = 25;
	Escribir "H=Hombre M=Mujer"
	Leer sexo_reply
	
	Si sexo_reply <> sexo  Entonces
		Escribir "No puede entrar en el ejercito a razon de su sexo";
	FinSi
	
	Escribir "Edad"; Leer edad;
	Si edad>=rango_Ma Entonces
		Escribir "Supera la edad limite para ingresar";
	FinSi
	Si edad<rango_m Entonces
		Escribir "No llega a la edad mínima para ingresar";
	FinSi
	Si edad<rango_Ma Y edad>=rango_m Entonces
		Escribir "Usted puede ingresar en el ejercito";
	FinSi
FinAlgoritmo
