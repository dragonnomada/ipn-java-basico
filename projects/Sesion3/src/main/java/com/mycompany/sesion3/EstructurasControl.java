package com.mycompany.sesion3;

import java.util.ArrayList;

public class EstructurasControl {
    
    // Punto de Entrada | Método de Ejecución
    public static void main(String[] args) {
        
        System.out.println("Estructuras de Control");
        
        System.out.println("Estructura Condicional Simple");
        
        int x = 35;
        
        // if (<condición | valor lógico>) { <bloque> }
        // Sólo ejecutar el bloque de código asociado si la condición
        // se cumple.
        if (x > 23) {
            System.out.println("x es mayor a 23");
        }
        
        System.out.println("Estructura Condicional Doble");
        
        // if (<cóndición | valor lógico>) { <bloque verdadero> }
        // else { <bloque falso> }
        if (x > 100) {
            System.out.println("x es mayor a 100");
        } else {
            System.out.println("x no es mayor a 100 (x <= 100)");
        }
        
        System.out.println("Estructura Condicional Anidada");
        
        // if (<condición | valor lógico prioridad 1) { <bloque verdadero 1> }
        // else if (<condición prioridad 2) { <bloque verdadero 2> }
        // else if (<condición prioridad 3) { <bloque verdadero 3> }
        // else if ...
        // else if (<condición prioridad N) { <bloque verdadero N> }
        // else { <bloque falso> }
        if (x > 100) {
            System.out.println("x es mayor a 100");
        } else if (x > 75) {
            System.out.println("x es mayor a 75");
        } else if (x > 50) {
            System.out.println("x es mayor a 50");
        } else if (x > 25) {
            System.out.println("x es mayor a 25");
        } else if (x > 0) {
            System.out.println("x es mayor a 0");
        } else {
            System.out.println("x es 0 o negativo");
        }
        
        System.out.println("Estructura Condicional Selectiva");
        
        // switch(<valor selección>) {
        //      case <valor comparación>:
        //          <expresiones para los casos acumulados>
        //          break; | continua
        //      default:
        //          <expresiones para los casos no considerados>
        //          break; | continua
        switch (x) {
            case 45:
                System.out.println("x es 45: Código DESPACHAR");
                break; // Rompe el caso y termina la selección
            case 22:
                System.out.println("x es 22: Código CONTAR MONEDAS");
                break; // Rompe el caso y termina la selección
            case 11:
            case 23:
            case 17:
                System.out.println("x es 11|23|17: Código ALARMAR");
                break; // Rompe el caso y termina la selección
            case 35:
                System.out.println("x es 35: Código INICIO");
                // Continua en los próximos casos
            case 28:
            case 36:
                System.out.println("x es 35|28|36: Código TERMINAR");
                break; // Rompe el caso y termina la selección
            default:
                System.out.println("x es ???: Código DESCONOCIDO");
                break;
        }
        
        System.out.println("Estructura Ciclo Condicional Simple");
        
        int n = 27;
        
        // while (<condición | valor lógico>) { <bloque a repetir> }
        while (n > 1) {
            System.out.printf("N = %d\n", n);
            if (n % 2 == 0) { // n es par
                n /= 2; // n = n / 2
            } else { // n es impar
                n *= 3; // n = n * 3
                n += 1; // n = n + 1 | n++
                // n = n * 3 + 1 | 3 * n + 1
            }
        }
        
        System.out.println("Estructura Ciclo Iterador Simple");
        
        // for (<inicializador>; <condición>; <incrementador>)
        for (int i = 1; i <= 10; i++) { // i++ | i = i + 1 | i += 1
            System.out.printf("I = %d\n", i);
        }
        
        for (int j = 10; j >= 1; j -= 2) { // i++ | i = i + 1 | i += 1
            System.out.printf("J = %d\n", j);
        }
        
        System.out.println("Estructura Ciclo Condicional Inicial");
        
        double s;
        
        // do { <bloque inicial> } while (<condición | valor lógico>);
        do {
            s = Math.random() * 10;
            System.out.printf("S = %.4f\n", s);
        } while(s < 7);
        
        System.out.printf("S es %.2f\n", s);
        
        System.out.println("Estructura Ciclo Iterador Secuencial");
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(5);
        numeros.add(8);
        numeros.add(23);
        numeros.add(17);
        numeros.add(22);
        
        // for (<valor> : <secuencia>) { <bloque> }
        for (Integer numero : numeros) {
            System.out.printf("Número es %d\n", numero);
        }
        
    }
    
}
