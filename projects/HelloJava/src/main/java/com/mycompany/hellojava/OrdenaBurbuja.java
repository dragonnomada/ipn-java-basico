package com.mycompany.hellojava;

import java.util.ArrayList;

class OrdenaBurbuja {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(4);
        lista.add(3);
        lista.add(5);
        lista.add(2);
        lista.add(1);
        lista.add(6);
        lista.add(8);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(9);
        lista.add(6);

        int N = lista.size();

        for (int i = 0; i < N; i++) {
            int a = 0;
            int inicial = lista.get(a);

            for (int j = i + 1; j < N; j++) {
                int capturado = lista.get(a + 1);

                if (inicial > capturado) {
                    lista.set(a, capturado);
                    lista.set(a + 1, inicial);
                    a = a + 1;
                } else {
                    a = a + 1;
                    inicial = lista.get(a);
                }
            }
        }

        for (int x : lista) {
            System.out.print(x);
            System.out.print(" ");
        }
        
        System.out.println("");
        
    }

}