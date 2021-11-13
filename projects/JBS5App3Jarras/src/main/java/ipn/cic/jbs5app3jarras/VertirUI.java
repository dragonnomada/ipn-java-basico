package ipn.cic.jbs5app3jarras;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VertirUI {
    
    JarraUI jarra1UI;
    JarraUI jarra2UI;
    
    JPanel panel = new JPanel();
    JTextField textField = new JTextField();
    JLabel label = new JLabel("ml");
    JButton buttonVertirJ1AJ2 = new JButton("J1 > J2");
    JButton buttonVertirJ2AJ1 = new JButton("J2 > J1");
    
    public VertirUI(JarraUI jarra1, JarraUI jarra2) {
        
        this.jarra1UI = jarra1;
        this.jarra2UI = jarra2;
        
        JPanel subpanel = new JPanel();
        
        subpanel.setLayout(new BorderLayout());
        
        subpanel.add(this.textField, BorderLayout.CENTER);
        subpanel.add(this.label, BorderLayout.EAST);
        
        this.panel.setLayout(new BoxLayout(this.panel, BoxLayout.Y_AXIS));
        
        this.panel.add(subpanel);
        this.panel.add(this.buttonVertirJ1AJ2);
        this.panel.add(this.buttonVertirJ2AJ1);
        
        this.buttonVertirJ1AJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ml = Integer.parseInt(textField.getText());
                jarra1UI.jarra.vertir(jarra2UI.jarra, ml);
                jarra1UI.actualizarUI();
                jarra2UI.actualizarUI();
            }
        });
        
    }
    
    public JPanel getPanel() {
        return this.panel;
    }
}
