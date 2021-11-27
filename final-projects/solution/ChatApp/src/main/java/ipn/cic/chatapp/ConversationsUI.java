package ipn.cic.chatapp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversationsUI {
    
    private JPanel panelMain = new JPanel();
    
    private JPanel panelPhoneFrom = new JPanel();
    private JLabel labelPhoneFrom = new JLabel("Phone From");
    private JTextField textFieldPhoneFrom = new JTextField();
    private JButton buttonPhoneFromConfirm = new JButton("Confirm");
    
    private JPanel panelConversationActions = new JPanel();
    protected JButton buttonNewConversation = new JButton("New Conversation");
    protected JButton buttonOpenConversation = new JButton("Open Conversation");
    
    private ConversationListUI conversationListUI;
    
    private Conversation selectedConversation = null;
    
    public ConversationsUI() {
        
        ConversationsUI self = this;
        
        this.conversationListUI = new ConversationListUI(this);
        
        this.panelPhoneFrom.setLayout(new BorderLayout());
        this.panelPhoneFrom.add(this.labelPhoneFrom, BorderLayout.NORTH);
        this.panelPhoneFrom.add(this.textFieldPhoneFrom, BorderLayout.CENTER);
        this.panelPhoneFrom.add(this.buttonPhoneFromConfirm, BorderLayout.EAST);
        
        this.panelConversationActions.setLayout(new BorderLayout());
        this.panelConversationActions.add(this.buttonNewConversation, BorderLayout.EAST);
        this.panelConversationActions.add(this.buttonOpenConversation, BorderLayout.WEST);
        
        this.panelMain.setLayout(new BorderLayout());
        
        JPanel group = new JPanel();
        
        group.setLayout(new BoxLayout(group, BoxLayout.Y_AXIS));
        group.add(this.panelPhoneFrom);
        group.add(this.panelConversationActions);
        
        this.panelMain.add(group, BorderLayout.NORTH);
        this.panelMain.add(this.conversationListUI.getPanel(), BorderLayout.CENTER);
        
        this.buttonOpenConversation.setEnabled(false);
        this.buttonNewConversation.setEnabled(false);
        
        this.buttonPhoneFromConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                self.buttonNewConversation.setEnabled(true);
                self.buttonPhoneFromConfirm.setEnabled(false);
                self.textFieldPhoneFrom.setEditable(false);
                String phoneFrom = self.textFieldPhoneFrom.getText();
                Conversations conversations = new Conversations(phoneFrom);
                conversations.newConversation("5511223344", "Test conversation");
                conversations.newConversation("5544332211", "Other test conversation");
                self.conversationListUI.setConversations(conversations);
            }
        });
        
    }
    
    public JPanel getPanel() {
        return this.panelMain;
    }
    
    public void selectConversation(Conversation conversation) {
        this.buttonOpenConversation.setEnabled(true);
        
        this.selectedConversation = conversation;
    }
    
    public void createConversation(String phoneTo, String message) {
        System.out.println("CREANTE CONVERSATION");
        this.conversationListUI.getModel().conversations.newConversation(phoneTo, message);
        this.conversationListUI.update();
    }
    
}
