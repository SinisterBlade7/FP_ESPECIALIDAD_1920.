Algoritmo sin_titulo
	Definir user Como Cadena;
	Definir pass Como Entero;
	Definir user2 Como Cadena;
	Definir pass2 Como Entero;
	Escribir "Registro de usuario";
	Escribir "Ingrese su nombre de usuario"; Leer user;
	Escribir "Registro de password"; Leer pass;
	
	Escribir "Perfecto su cuenta a sido creada, a continuacion se iniciara un proceso de verificacion";
	Leer user2;
	Si user = user2 Entonces
		Leer pass2;
		Si pass2 = pass Entonces
			
			Escribir "Proceso de verificacion exitoso";
			
		FinSi
		
	FinSi
	
	
FinAlgoritmo
