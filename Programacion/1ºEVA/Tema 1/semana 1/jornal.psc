Algoritmo jornal
	definir h como entero;
	definir turno como entero;
	definir dia como caracter;
	definir profit como real;
	
	escribir "horas trabajadas-->";leer horas;
	escribir "1-->turno dierno";escribir "2-->turno diurno";leer turno;
	escribir "tipo de dia-->"; leer dia;
	
	si turno=1 entonces
		
		si dia="Laborable" Entonces
			profit=10*h;
			escribir"usted trabaja un dia laborable de dia";
			escribir "cobrara-->",profit;
		FinSi
		
		si dia="Festivo" Entonces
			escribir"usted trabaja un dia festivo de dia";
		    profit=10*h*110/100;
			escribir "cobrara-->",profit;
		FinSi
	FinSi
	si turno=2 entonces
		
		si dia="Laborable" Entonces
			escribir"usted trabaja un dia laborable de noche";
			profit=13.5*h;
			escribir "cobrara-->",profit;
		FinSi
		
		si dia="Festivo" Entonces
			escribir"usted trabaja un dia festivo de noche"
		    profit=13.5*h*115/100;
			escribir "cobrara-->",profit;
		FinSi
	FinSi
	
FinAlgoritmo
