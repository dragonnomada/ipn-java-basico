package ipn.cic.jbs5app3jarras;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

// VISTA (M*V*C)
public class JarraUI {

    Jarra jarra;
    
    JPanel panel = new JPanel();
    JLabel labelTitulo = new JLabel();
    JLabel labelDisplay = new JLabel();
    JProgressBar progressCapacidad = new JProgressBar();
    
    public JarraUI(String titulo, Jarra jarra) {
        this.jarra = jarra;
        
        this.labelTitulo.setText(titulo);
        this.labelDisplay.setText(this.jarra.getDisplay());
        this.progressCapacidad.setMinimum(0);
        this.progressCapacidad.setMaximum(this.jarra.getCapacidadMaxima());
        this.progressCapacidad.setValue(this.jarra.getCapacidadActual());
        this.progressCapacidad.setStringPainted(true);
        
        this.panel.setLayout(new BorderLayout());
        
        this.panel.add(this.labelTitulo, BorderLayout.NORTH);
        this.panel.add(this.progressCapacidad, BorderLayout.CENTER);
        this.panel.add(this.labelDisplay, BorderLayout.EAST);
    }
    
    public JPanel getPanel() {
        return this.panel;
    }
    
    public void actualizarUI() {
        this.labelDisplay.setText(this.jarra.getDisplay());
        this.progressCapacidad.setValue(this.jarra.getCapacidadActual());
    }
    
}
