package ipn.cic.jbs5app2;

public class Contador {

    private int conteo;
    
    public void incrementar() {
        this.conteo++;
    }
    
    public void decrementar() {
        this.conteo--;
    }
    
    public String getDisplay() {
        return String.format("Counter: %d", this.conteo);
    }
    
}
