// Calcular el IMC de una persona

// 1. Solicitar Peso y Estatura
// 2. Calcular el IMC
// 3. Determinar el tipo de rango de peso
// 		BAJO DE PESO  IMC < 18.5
//      NORMAL 18.5 <= IMC < 25
//      SOBREPESO 25 <= IMC < 30
//      OBSESIDAD IMC >= 30

Proceso CALCULAR_IMC
	Definir Peso Como Real;
	Definir Estatura Como Real;
	Definir IMC Como Real;
	
	Escribir "Dame el Peso: ";
	Leer Peso;
	Escribir "Dame la Estatura: ";
	Leer Estatura;
	
	IMC <- Peso / Estatura^2;
	
	Si IMC < 18.5 Entonces
		Escribir "Bajo de Peso";
	SiNo
		Si IMC >= 18.5 Y IMC < 25 Entonces
			Escribir "Peso Normal";
		SiNo
			Si IMC >= 25 Y IMC < 30 Entonces
				Escribir "Sobrepeso";
			SiNo
				Escribir "Obsidad";
			FinSi
		FinSi
	FinSi
FinProceso
