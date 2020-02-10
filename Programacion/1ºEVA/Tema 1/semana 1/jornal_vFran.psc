Algoritmo jornal
	definir horas como entero;
	definir turno como entero;
	definir dia como caracter;
	Definir porLaborable como Real;
	Definir porFestivo como Real;
	
	
	escribir "horas trabajadas-->";leer horas;
	escribir "1-->turno dierno";escribir "2-->turno diurno";leer turno;
	escribir "tipo de dia-->"; leer dia;
	
	
	porLaborable <- 1
	porFestivo <- 1
	
	si turno=1 entonces
		porLaborable <- 10;
		si dia="Festivo" Entonces
			escribir"usted trabaja un dia festivo de dia";
			porFestivo = 1.1;
		FinSi
	FinSi
	si turno=2 entonces		
		porLaborable <- 13.5;
		si dia="Festivo" Entonces
			escribir"usted trabaja un dia festivo de noche"
			porFestivo = 1.15;
		FinSi
	FinSi
	
	Escribir "cobrara-->",horas*porLaborable*porFestivo;
FinAlgoritmo
