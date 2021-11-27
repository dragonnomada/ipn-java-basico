package ipn.cic.chatapp;

import java.util.ArrayList;

public class Conversations {

    private String phoneFrom;
    
    private ArrayList<Conversation> conversations;
    
    public Conversations(String phoneFrom) {
        this.phoneFrom = phoneFrom;
        
        this.conversations = new ArrayList<Conversation>();
    }

    public String getPhoneFrom() {
        return phoneFrom;
    }

    public void setPhoneFrom(String phoneFrom) {
        this.phoneFrom = phoneFrom;
    }
    
    public int count() {
        return this.conversations.size();
    }
    
    public boolean isConversationOwned(Conversation conversation) {
        return this.phoneFrom.equals(conversation.getPhoneFrom());
    }

    public boolean addConversation(Conversation conversation) {
        if (this.isConversationOwned(conversation)) {
            this.conversations.add(conversation);
            return true;
        } else {
            System.out.println("ERROR ADDING CONVERSATION | NOT ALLOWED");
            return false;
        }
    }

    public boolean newConversation(String phoneTo, String message) {
        Conversation conversation = new Conversation(this.phoneFrom, phoneTo, message);
        return this.addConversation(conversation);
    }
    
    public Conversation findConversationTo(String phoneTo) {
        for (Conversation conversation : this.conversations) {
            if (phoneTo.equals(conversation.getPhoneTo())) {
                return conversation;
            }
        }
        
        return null;
    }
    
    public boolean removeConversation(Conversation conversation) {
        if (this.isConversationOwned(conversation)) {
            this.conversations.remove(conversation);
            return true;
        } else {
            System.out.println("ERROR REMOVING CONVERSATION | NOT ALLOWED");
            return false;
        }
    }
    
    public boolean removeConversation(int index) {
        if (index >= 0 && index < this.conversations.size()) {
            this.conversations.remove(index);
            return true;
        } else {
            System.out.println("ERROR REMOVING CONVERSATION | INVALID INDEX");
            return false;
        }
    }
    
    public Conversation getConversation(int index) {
        if (index >= 0 && index < this.conversations.size()) {
            return this.conversations.get(index);
        } else {
            System.out.println("ERROR REMOVING CONVERSATION | INVALID INDEX");
            return null;
        }
    }
    
}
