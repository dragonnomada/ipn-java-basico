class CalcularIMC {

    public static void main(String[] args) {

        float peso = 76.5f;
        float estatura = 1.64f;

        float imc = peso / (estatura * estatura);

        System.out.printf("Para alguien que pesa %.2f kg y mide %.2f m, su IMC es de %.4f", peso, estatura, imc);

    }

}