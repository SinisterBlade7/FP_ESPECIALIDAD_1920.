Algoritmo sin_titulo
	definir x,n_menor,n_mayor,cont como entero;
	definir r como real;
	cont=0;
	leer x;
	n_mayor=x;
	n_menor=x;
	Mientras x<>0 Hacer
		
		si n_mayor<=x entonces
			n_mayor=x;
		FinSi
		si n_menor>=x entonces
			n_menor=x;
		FinSi
		si x<>0 entonces
		
		r=r+x;
		cont=cont+1;
		leer x;
		FinSi
	Fin Mientras
	
	escribir"n_mayor=",n_mayor;
	escribir"n_menor=",n_menor;
	escribir"media-->",r/cont;
	
FinAlgoritmo
