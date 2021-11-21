package ipn.cic.jbs6arreglos;

import java.util.Scanner;

public class Pesos {

    public static void main(String[] args) {
        
        int N;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el número de pesos:");
        N = scanner.nextInt(); scanner.nextLine();
        
        double[] pesos = new double[N];
        
        for (int i = 0; i < pesos.length; i++) {
            System.out.printf("Peso %d:\n", i + 1);
            pesos[i] = scanner.nextDouble(); scanner.nextLine();
        }
        
        double suma = 0;
        
        for (double peso : pesos) {
            System.out.println(peso);
            suma += peso;
        }
        
        System.out.printf("Total: %d | Suma: %.2f | Promedio: %.2f\n",
                pesos.length, suma, suma / pesos.length);
        
        scanner.close();
        
    }
    
}
