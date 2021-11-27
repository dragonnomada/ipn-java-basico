package ipn.cic.chatapp;

import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class ConversationListModel implements ListModel {

    Conversations conversations;
    
    ArrayList<ListDataListener> listeners = new ArrayList<>();
    
    public ConversationListModel(Conversations conversations) {
        this.conversations = conversations;
    }
    
    @Override
    public int getSize() {
        return this.conversations.count();
    }

    @Override
    public Object getElementAt(int index) {
        return this.conversations.getConversation(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        this.listeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        this.listeners.remove(l);
    }
    
}
