package ipn.cic.chatapp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ConversationsFrame extends ConversationsUI {
    
    private JFrame frame = new JFrame();
    
    public ConversationsFrame() {
        super();
        
        this.frame.setLayout(new BorderLayout());
        this.frame.add(this.getPanel(), BorderLayout.CENTER);
        
        this.frame.setSize(400, 400);
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ConversationsFrame self = this;
        
        this.buttonNewConversation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewConversationDialog newConversationDialog = new NewConversationDialog(self.frame, self);
                newConversationDialog.start();
            }
        });
    }
    
}
