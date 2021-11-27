package ipn.cic.chatapp;

import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ConversationListUI {

    private ConversationListModel model;
    
    private JPanel panelMain = new JPanel();
    private JList listConversations;
    
    ConversationsUI conversationsUI;
    
    public ConversationListUI(ConversationsUI conversationsUI) {
        this.conversationsUI = conversationsUI;
        
        this.listConversations = new JList();
        
        JScrollPane scrollPane = new JScrollPane(this.listConversations);    
        
        this.panelMain.setLayout(new BorderLayout());
        this.panelMain.add(scrollPane, BorderLayout.CENTER);
        
        this.listConversations.setEnabled(false);
        
        this.listConversations.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listConversations.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = e.getFirstIndex();
                
                if (index >= 0 && index < listConversations.getModel().getSize()) {
                    Conversation conversation = (Conversation)model.getElementAt(index);
                    
                    conversationsUI.selectConversation(conversation);
                }
            }
        });
    }
    
    public JPanel getPanel() {
        return this.panelMain;
    }
    
    public ConversationListModel getModel() {
        return this.model;
    }
    
    public void setConversations(Conversations conversations) {
        this.listConversations.setEnabled(true);
        
        this.model = new ConversationListModel(conversations);
        
        this.listConversations.setModel(this.model);
        
        /*this.listConversations = new JList(this.model);
        
        JScrollPane scrollPane = new JScrollPane(this.listConversations);
        
        this.panelMain.removeAll();
        
        this.panelMain.add(scrollPane, BorderLayout.CENTER);
        
        this.panelMain.updateUI();*/
    }
    
    public void update() {
        this.listConversations.updateUI();
    }
    
}
