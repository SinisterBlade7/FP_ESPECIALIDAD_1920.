Algoritmo sin_titulo
	definir dia,mes,a�o como entero;
	Escribir "dia";leer dia;
	escribir "mes";leer mes;
	escribir "a�o";leer a�o;
	
	si dia<=31 y dia>0 y mes>0 y mes<=12 y a�o>0 entonces
		si mes=1 Entonces
			Escribir dia," de enero de ",a�o;
		FinSi
		si mes=2 Entonces
			Escribir dia," de febrero de ",a�o;
		FinSi
		si mes=3 Entonces
			Escribir dia," de marzo de ",a�o;
		FinSi
		si mes=4 Entonces
			Escribir dia," de abril de ",a�o;
		FinSi
		si mes=5 Entonces
			Escribir dia," de mayo de ",a�o;
		FinSi
		si mes=6 Entonces
			Escribir dia," de junio de ",a�o;
		FinSi
		si mes=7 Entonces
			Escribir dia," de julio de ",a�o;
		FinSi
		si mes=8 Entonces
			Escribir dia," de agosto de ",a�o;
		FinSi
		si mes=9 Entonces
			Escribir dia," de septiembre de ",a�o;
		FinSi
		si mes=10 Entonces
			Escribir dia," de octubre de ",a�o;
		FinSi
		si mes=11 Entonces
			Escribir dia," de noviembre de ",a�o;
		FinSi
		si mes=12 Entonces
			Escribir dia," de diciembre de ",a�o;
		FinSi
		
	SiNo
		escribir "error";
	FinSi
	
	
	
FinAlgoritmo
