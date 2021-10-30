Proceso OrdenamientoInsercion
	
	Definir lista Como Entero;
	Dimension lista[11];
	
	Definir N Como Entero;
	N <- 11;
	
	lista[0] <- 5;
	lista[1] <- 1;
	lista[2] <- 8;
	lista[3] <- 3;
	lista[4] <- 2;
	lista[5] <- 7;
	lista[6] <- 9;
	lista[7] <- 4;
	lista[8] <- 6;
	lista[9] <- 1;
	lista[10] <- 2;
	
	Definir  pind Como Entero;
	Definir  pval Como Entero;
	
	Definir val Como Entero;
	
	Definir i Como Entero;
	Definir j Como Entero;
	Definir k Como Entero;
	
	Para k <- 1 Hasta N - 2 Hacer
		pind <- k;
		pval <- lista[pind];
		
		Para i <- 0 Hasta pind - 1 Hacer
			val <- lista[i];
			Si val > pval Entonces
				lista[pind] = val;
				lista[i] = pval;
				pval = val;
			FinSi
		FinPara
		
		Para j <- pind + 1 Hasta N - 1 Hacer
			val <- lista[j];
			Si pval > val Entonces
				lista[pind] = val;
				lista[j] = pval;
				pval = val;
			FinSi
		FinPara
	FinPara
	
	Para k <- 0 Hasta N - 1 Hacer
		Escribir lista[k];
	FinPara
	
FinProceso
