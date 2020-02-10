Algoritmo sin_titulo
	definir materia1 como entero;
	definir materia2 como entero;
	definir materia3 como entero;
	definir materia4 como entero;
	definir materia5 como entero;
	definir materia6 como entero;
	definir media como real;
	definir iva como entero;
	iva=10;
	definir matricula_bruto como entero;
	matricula_bruto=1000;
	definir matricula_neto como real;
	escribir "inserte la nota de la materia 1-->"; leer materia1;
	escribir "inserte la nota de la materia 2-->"; leer materia2;
	escribir "inserte la nota de la materia 3-->"; leer materia3;
	escribir "inserte la nota de la materia 4-->"; leer materia4;
	escribir "inserte la nota de la materia 5-->"; leer materia5;
	escribir "inserte la nota de la materia 6-->"; leer materia6;
	media=(materia1+materia2+materia3+materia4+materia5+materia6)/6;
	escribir "tu nota media es de-->",media;
	si media<4 entonces
		matricula_neto= matricula_bruto+matricula_bruto*10/100;
		escribir "te sale a pagar--> ",matricula_neto;
	FinSi
	si media>=4 entonces
		matricula_neto= matricula_bruto*70/100;
		escribir "te sale a pagar--> ",matricula_neto;
	FinSi
	
	
	
FinAlgoritmo
