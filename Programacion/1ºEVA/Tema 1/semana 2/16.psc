Algoritmo sin_titulo
	definir dia,mes,año como entero;
	Escribir "dia";leer dia;
	escribir "mes";leer mes;
	escribir "año";leer año;
	
	si dia<=31 y dia>0 y mes>0 y mes<=12 y año>0 entonces
		si mes=1 Entonces
			Escribir dia," de enero de ",año;
		FinSi
		si mes=2 Entonces
			Escribir dia," de febrero de ",año;
		FinSi
		si mes=3 Entonces
			Escribir dia," de marzo de ",año;
		FinSi
		si mes=4 Entonces
			Escribir dia," de abril de ",año;
		FinSi
		si mes=5 Entonces
			Escribir dia," de mayo de ",año;
		FinSi
		si mes=6 Entonces
			Escribir dia," de junio de ",año;
		FinSi
		si mes=7 Entonces
			Escribir dia," de julio de ",año;
		FinSi
		si mes=8 Entonces
			Escribir dia," de agosto de ",año;
		FinSi
		si mes=9 Entonces
			Escribir dia," de septiembre de ",año;
		FinSi
		si mes=10 Entonces
			Escribir dia," de octubre de ",año;
		FinSi
		si mes=11 Entonces
			Escribir dia," de noviembre de ",año;
		FinSi
		si mes=12 Entonces
			Escribir dia," de diciembre de ",año;
		FinSi
		
	SiNo
		escribir "error";
	FinSi
	
	
	
FinAlgoritmo
