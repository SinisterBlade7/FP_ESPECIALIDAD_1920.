Algoritmo subrutinas
	definir num como entero;
	definir bool como caracter;
	bool="si";
	Mientras bool="si" o bool="Si" Hacer
	escribir "inserte el numero del ejercicio que quieres realizar:";
	escribir "1-->area circulo	2-->exponente de un numero	3-->factorial de un numero	4-->conversion de moneda	5-->jornal";
		leer num;
	si num=1 entonces
		escribir"area circulo";
		area_circ;
		Escribir "hemos salido del area", num;
	FinSi
	si num=2 entonces
		escribir"exponente de un numero";
		expo;
	FinSi
	si num=3 entonces
		escribir "factorial de un numero"
		factorial;
	FinSi
	si num=4 entonces
		escribir"conversion de moneda";
		moneda;
	FinSi
	si num=5 entonces
		escribir "jornal"
		jornal;
	FinSi
	escribir "llamar a bool";
	leer bool;
	Fin Mientras
FinAlgoritmo

SubAlgoritmo area_circ
	definir a como real;
	definir r como entero;
	leer r;
	escribir PI*(r^2);
FinSubAlgoritmo

SubAlgoritmo expo
	definir contador como entero;
	definir e como entero;
	definir x como entero;
	definir r como real;
	r=1;
	contador=1;
	leer x;
	Leer e;
	si e>=0 entonces
		Mientras contador<=e Hacer
		r=x*r;
		contador=contador+1;
		Fin Mientras
		escribir r;
	FinSi
	si e<0 entonces
		e=e*(-1);
		Mientras contador<=e Hacer
			r=x*r;
			contador=contador+1;
		Fin Mientras
		escribir 1/r;
	FinSi
FinSubAlgoritmo

SubAlgoritmo factorial
	definir n,a como real;
	a=1;
	leer n;
	Mientras n>0 Hacer
		a=n*a;
		n=n-1;
	Fin Mientras
	escribir a;
FinSubAlgoritmo

SubAlgoritmo moneda
	definir tipo como entero;
	definir x como real;
	definir r como real;
	escribir "1-->dollar  2-->libra  3-->yen";
	leer tipo;
	escribir"inserte una cantidad";
	leer x
	si tipo =1 entonces
		r=x*0.75;
	FinSi
	
	si tipo =2 entonces
		r=x*1.22;
	FinSi
	
	si tipo =3 entonces
		r=x*0.009;
	FinSi
	escribir r," euros";
	
FinSubAlgoritmo


SubAlgoritmo jornal
	definir h como entero;
	definir turno como entero;
	definir dia como caracter;
	definir profit como real;
	
	escribir "horas trabajadas-->";leer h;
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
		    profit=10*h*1.1;
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
		    profit=13.5*h*1.15;
			escribir "cobrara-->",profit;
		FinSi
	FinSi
FinSubAlgoritmo
