package ipn.cic.jbs5app2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContadorGUI {

    Contador contador;
    
    JFrame frame;
    JPanel panel;
    JButton buttonIncrementar;
    JButton buttonDecrementar;
    JLabel labelDisplay;
    
    public ContadorGUI() {
        this.contador = new Contador();
        
        this.frame = new JFrame();
        
        this.panel = new JPanel();
        
        this.buttonIncrementar = new JButton("Incrementar");
        this.buttonDecrementar = new JButton("Decrementar");
        this.labelDisplay = new JLabel(this.contador.getDisplay());
        
        this.buttonIncrementar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador.incrementar();
                labelDisplay.setText(contador.getDisplay());
            }
        });
        
        this.buttonDecrementar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador.decrementar();
                labelDisplay.setText(contador.getDisplay());
            }
        });
        
        this.panel.add(this.labelDisplay);
        this.panel.add(this.buttonIncrementar);
        this.panel.add(this.buttonDecrementar);
        
        this.frame.add(this.panel);
        
        this.frame.setSize(300, 300);
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
