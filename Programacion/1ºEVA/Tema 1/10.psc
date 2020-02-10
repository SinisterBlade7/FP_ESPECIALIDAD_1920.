Algoritmo sin_titulo
	definir lim como entero;
	definir n,m,r como entero;
	m=1;
	leer lim;
	Repetir
		r=m+n;
		escribir r;
		n=m;
		m=r;
		lim=lim-1;
	Hasta Que lim=0
FinAlgoritmo
