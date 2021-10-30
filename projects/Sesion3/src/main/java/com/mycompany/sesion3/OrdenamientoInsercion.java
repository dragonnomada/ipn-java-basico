package com.mycompany.sesion3;

import java.util.ArrayList;

public class OrdenamientoInsercion {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        lista.add(5);
        lista.add(1);
        lista.add(8);
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(9);
        lista.add(4);
        lista.add(6);
        lista.add(1);
        lista.add(2);
        
        int N = lista.size();
        
        for (int k = 1; k <= N - 2; k++) {
            
            int pind = k;
            Integer pval = lista.get(pind);
            
            for (int i = 0; i < pind; i++) {
                Integer val = lista.get(i);
                if (val > pval) {
                    lista.set(i, pval);
                    lista.set(pind, val);
                    pval = val;
                }
            }
            
            for (int j = pind + 1; j < N; j++) {
                Integer val = lista.get(j);
                if (pval > val) {
                    lista.set(j, pval);
                    lista.set(pind, val);
                    pval = val;
                }
            }
            
        }
        
        for (Integer val : lista) {
            System.out.printf("%d ", val);
        }
        
        System.out.println();
        
    }
    
}
