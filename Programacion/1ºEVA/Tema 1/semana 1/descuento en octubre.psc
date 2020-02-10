Algoritmo sin_titulo
	definir mes como entero;
	definir precio como real;
	escribir"inserte el numero correspondiente al mes de la compra "; leer mes;
	escribir"inserte precio bruto de su compra"; leer precio;
	si mes<>10 y mes>0 y mes<12 entonces
		escribir"Cuesta-->", precio;
		
	FinSi
	si mes=10 entonces
		escribir "Cuesta-->",precio/100*85;
		
	FinSi
	
	
FinAlgoritmo
