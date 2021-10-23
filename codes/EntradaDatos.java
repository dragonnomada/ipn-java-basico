import java.util.Scanner;

class EntradaDatos {

    public static void main(String[] args) {

        // 1. Creamos un escáner de datos sobre la Entrada Estándar
        // Scanner - Clase Scanner
        // scanner - Instancia/Objeto de la clase Scanner
        // <Clase> <instancia> = new <Clase>([<argumentos ...>])
        Scanner scanner = new Scanner(System.in);

        // TODO: Escanear datos desde la entrada estándar

        System.out.print("Dame la edad: ");
        // 2. Leemos valores desde el escáner
        // nextInt() - Próximo Entero
        // nextFloat() - Próximo Flotante
        // nextDouble() - Próximo Doble
        // nextLine() - Próxima Línea (hasta el próximo Enter o \n)
        // nextBoolean() - Próximo Boolean
        // nextByte() - Próximo Byte
        // nextChar() - Próximo Caracter
        int edad = scanner.nextInt();

        System.out.printf("Hola, tienes %d años, te faltan %d años para cumplir los 100 :D", edad, 100 - edad);
        System.out.println();

        // 3. Cerramos el escáner para que no quede abierto
        scanner.close();

    }   

}