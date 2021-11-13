package ipn.cic.jbs5app3jarras;

public class App {

    public static void main(String[] args) {
        
        Jarra jarra1 = new Jarra(5, 3000);
        Jarra jarra2 = new Jarra(2, 500);
        
        JarraUI jarra1UI = new JarraUI("Jarra 1", jarra1);
        JarraUI jarra2UI = new JarraUI("Jarra 2", jarra2);
        
        DosJarrasGUI app = new DosJarrasGUI(jarra1UI, jarra2UI);
        
    }
    
}
