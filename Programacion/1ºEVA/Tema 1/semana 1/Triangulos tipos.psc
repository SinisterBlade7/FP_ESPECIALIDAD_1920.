Algoritmo sin_titulo
	Definir a,b,c Como Entero;
	Escribir "dime los lados del triangulo";
	Leer a,b,c;
Si a=b y b=c Entonces
	Escribir  "equilatero";
FinSi
Si (a=b y a<>c y b<>c)o (a<>b y a=c y c<>b)o (a<>b y b=c y c<>a) Entonces
	Escribir  "isósceles";
FinSi	
Si a<>b y a<>c y b<>c Entonces
	Escribir  "escaleno";
FinSi




FinAlgoritmo