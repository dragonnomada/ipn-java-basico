package ipn.cic.jbs5app3jarras;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DosJarrasGUI {
    
    JarraUI jarra1UI;
    JarraUI jarra2UI;
    
    VertirUI vertirUI;
    
    JFrame frame = new JFrame();
    
    public DosJarrasGUI(JarraUI jarra1, JarraUI jarra2) {
        this.jarra1UI = jarra1;
        this.jarra2UI = jarra2;
    
        this.vertirUI = new VertirUI(this.jarra1UI, this.jarra2UI);
        
        JPanel panel = new JPanel();
        
        this.frame.setLayout(new BorderLayout());
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        panel.add(this.jarra1UI.getPanel());
        panel.add(this.jarra2UI.getPanel());
        panel.add(this.vertirUI.getPanel());
        
        this.frame.add(panel);
        
        this.frame.setVisible(true);
        
        this.frame.setSize(300, 300);
        
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
