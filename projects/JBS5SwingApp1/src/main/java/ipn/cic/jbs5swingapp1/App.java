package ipn.cic.jbs5swingapp1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {

    public static void main(String[] args) {

        // VENTANA PRINCIPAL
        JFrame frame = new JFrame();

        // CREAR COMPONENTES
        JPanel panel1 = new JPanel();

        JButton button1 = new JButton();
        JButton button2 = new JButton();

        // AJUSTAR COMPONENTES
        button1.setText("Pulsame");
        button2.setText("Hola");

        // CONTROLAR COMPONENTES
        ActionListener1 listener1 = new ActionListener1();
        
        listener1.button = button2;
        
        button1.addActionListener(listener1);
        
        button2.addActionListener(new ActionListener() {
            int contador = 0;
            
            @Override
            public void actionPerformed(ActionEvent e) {
                this.contador++;
                button1.setText(
                    String.format("Yo también he sido pulsado %d veces", this.contador)
                );
            }
        });

        // ENLAZANDO COMPONENTES A PANELES
        panel1.add(button1);
        panel1.add(button2);

        // ENLAZANDO PANELES A VENTANA
        frame.add(panel1);

        // CONFIGURAR EL `fame`
        frame.setSize(300, 300);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
