package ipn.cic.jbs6arreglosdinamicos;

import java.util.ArrayList;

public class ObjetosGenericos {

    public static void main(String[] args) {
        
        // <lista>.add(<objeto>)
        // <lista>.add(<índice>, <objeto>)
        // <objeto> = <lista>.get(<índice>)
        // <lista>.set(<índice>, <nuevo objeto>)
        // <lista>.remove(<índice>)
        // <lista>.remove(<objeto>)
        
        ArrayList objetos = new ArrayList();
        
        Object o1 = new Object();
        Canica c1 = new Canica();
        Canica c2 = new Canica();
        
        System.out.println(o1);
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println("-------------------------");
        
        objetos.add(o1);
        objetos.add(c1);
        objetos.add(c2);
        
        // Canica cx = (Canica)objetos.get(2);
        
        objetos.set(0, new Object());
        
        for (int i = 0; i < objetos.size(); i++) {
            Object obj = objetos.get(i);
            System.out.println(obj);
        }
        
        System.out.println("-------------------------");
        
        objetos.remove(1);
        
        for (Object obj : objetos) {
            System.out.println(obj);
        }
        
    }
    
}
