package ipn.cic.jbs5app2;

import java.util.Scanner;

public class ContadorCLI {

    Contador contador;

    public ContadorCLI() {
        this.contador = new Contador();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        MENU: // Etiqueta de ruptura
        while (true) {
            System.out.println(this.contador.getDisplay());
            System.out.println("1. Incrementar");
            System.out.println("2. Decrementar");
            System.out.println("3. Salir");
            
            int opcion = scanner.nextInt(); scanner.nextLine();
            
            switch(opcion) {
                case 1:
                    this.contador.incrementar();
                    break;
                case 2:
                    this.contador.decrementar();
                    break;
                case 3:
                    break MENU;
            }
            
        }
    
        scanner.close();

    }

}
