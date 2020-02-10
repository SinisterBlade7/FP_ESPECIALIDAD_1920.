Algoritmo Trabajador
	Definir horas Como Entero;
	Definir salario Como Real;
	Definir Importe Como Real;
	Escribir "cuantas horas ha trabajado?";
	Leer horas;
	Escribir "cuanto es la tarifa?";
	Leer salario;
	
	Si horas<=40 Entonces
		Importe = horas*salario;
		Escribir "cobrará",Importe,"euros"
	FinSi
	Si horas>40 Entonces
		Importe= (40*salario)+((horas-40)*((salario*150)/100))
		Escribir "cobrará ",Importe," euros"
	FinSi
	
	
	
	
	
	
FinAlgoritmo
