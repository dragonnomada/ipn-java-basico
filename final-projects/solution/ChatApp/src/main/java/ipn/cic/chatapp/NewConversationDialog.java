package ipn.cic.chatapp;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

public class NewConversationDialog extends NewConversationUI {

    protected JDialog dialog;
    
    public NewConversationDialog(Frame owner, ConversationsUI conversationsUI) {
        super(conversationsUI);
        
        this.dialog = new JDialog(owner, "New Conversation");
        
        this.dialog.setModal(true);
        
        this.dialog.add(this.getPanel());
        this.dialog.setSize(400, 200);
        
        this.dialog.setResizable(false);
    }
    
    public void start() {
        this.setOnCreateConversation(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
            
        });
        
        this.dialog.setVisible(true);
    }
    
    public JDialog getDialog() {
        return this.dialog;
    }
    
}
