Algoritmo sin_titulo

Definir a Como Real;	
Definir b Como Real;	
Definir c Como Real;	


Definir e Como Real;
Definir r_pos Como Real;
Definir r_neg Como Real;
Escribir"dime el parametro a";
Leer a;
Escribir"dime el parametro b";
Leer b;
Escribir"dime el parametro c";
Leer c;



Si a=0 entonces
	Escribir "a=0 -->fin";
FinSi

Si a<>0 entonces
	e= rc(b*b-4*a*c);
	r_pos= (-b+e)/(2*a);
	r_neg= (-b-e)/(2*a);
	
	Escribir "El resultado es-->",r_pos,"y",r_neg;
FinSi



FinAlgoritmo
