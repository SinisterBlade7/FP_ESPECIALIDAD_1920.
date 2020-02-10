Algoritmo sin_titulo
	definir x,m,lim,t como entero; 
	leer x;
	lim=x;
	si x%2=0 Entonces
		x=x+1;
	FinSi
	
	Mientras t<lim Hacer
		si x%2=0
			escribir x;
			m=m+x;
			t=t+1
		FinSi
		x=x+1;
	Fin Mientras
	escribir "resultado-->",m;
FinAlgoritmo
