Algoritmo Burbuja
	Definir lista Como Entero;
	Dimension lista[6];
	
	Definir N Como Entero;
	N <- 6;
	
	lista[0] <- 4;
	lista[1] <- 3;
	lista[2] <- 5;
	lista[3] <- 2;
	lista[4] <- 1;
	lista[5] <- 6;
	
	Definir i Como Entero;
	Definir j Como Entero;
	Definir a Como Entero;
	Definir inicial Como Entero;
	Definir capturado Como Entero;
	Para i <- 0 Hasta N - 1 Hacer
		a <- 0;
		inicial <- lista[a];
		Para j <- i + 1 Hasta N - 1 Hacer
			capturado <- lista[a + 1];
			Si inicial > capturado Entonces
				lista[a] <- capturado;
				lista[a + 1] <- inicial;
				a <- a + 1;
			SiNo
				a <- a + 1;
				inicial <- lista[a];
			FinSi
		FinPara
	FinPara
	
	Para i <- 0 Hasta N - 1 Hacer
		Escribir Sin Saltar lista[i], " ";
	FinPara
	
	Escribir "";
	
FinAlgoritmo
