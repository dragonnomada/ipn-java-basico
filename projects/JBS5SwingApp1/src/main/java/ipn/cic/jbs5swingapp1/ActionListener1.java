package ipn.cic.jbs5swingapp1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ActionListener1 implements ActionListener {

    public JButton button;
    int contador = 0;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: Se llama cada que la acción ha sido ejecutada
        // Es decir, cada que se le da click al botón
        
        this.contador++;
        
        this.button.setText(
                String.format("He sido pulsado %d veces", this.contador)
        );
    }
    
}
