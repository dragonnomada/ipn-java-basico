package ipn.cic.chatapp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversation {

    private String phoneFrom;
    private String phoneTo;

    private String message;
    private Date date;
    private ConversationStatus status;

    public Conversation(String phoneFrom, String phoneTo, String message) {
        this.phoneFrom = phoneFrom;
        this.phoneTo = phoneTo;
        this.message = message;
        this.date = new Date();
        this.status = ConversationStatus.CREATED;
    }

    public String getPhoneFrom() {
        return phoneFrom;
    }

    public void setPhoneFrom(String phoneFrom) {
        this.phoneFrom = phoneFrom;
    }

    public String getPhoneTo() {
        return phoneTo;
    }

    public void setPhoneTo(String phoneTo) {
        this.phoneTo = phoneTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ConversationStatus getStatus() {
        return status;
    }

    public void setStatus(ConversationStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        
        return String.format("[%s]   ---   %s   ---   %s", 
                this.phoneTo, 
                dateFormat.format(this.date), 
                this.status);
    }
    
    public String describe() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        
        String result = String.format("%s | %10s\n", dateFormat.format(this.date), this.status);

        result += String.format("FROM [%s] TO [%s]\n", this.phoneFrom, this.phoneTo);

        result += String.format("--- MESSAGE:\n");

        result += String.format("%s\n", this.message);

        result += String.format("--- END\n");

        return result;
    }
    
    public boolean canSend() {
        return this.status.equals(ConversationStatus.CREATED);
    }

    public void send() {
        if (this.canSend()) {
            this.status = ConversationStatus.SENDING;

            System.out.printf("SENDING CONVERSATION FROM [%s] TO [%s]\n",
                    this.phoneFrom, this.phoneTo);
            
            this.status = ConversationStatus.SENT;
            
            System.out.printf("CONVERSATION HAS SENT FROM [%s] TO [%s]\n",
                    this.phoneFrom, this.phoneTo);
        } else {
            System.out.printf("ERROR WHILE SENDING CONVERSATION FROM [%s] TO [%s]\n",
                    this.phoneFrom, this.phoneTo);
            
            System.out.println(this.toString());
        }
    }
    
    public boolean canReceive() {
        return this.status.equals(ConversationStatus.SENT);
    }

    public void receive() {
        if (this.canReceive()) {
            this.status = ConversationStatus.RECEIVING;

            System.out.printf("RECEIVING CONVERSATION FROM [%s] TO [%s]\n",
                    this.phoneFrom, this.phoneTo);
            
            this.status = ConversationStatus.RECEIVED;
            
            System.out.printf("CONVERSATION HAS RECEIVED FROM [%s] TO [%s]\n",
                    this.phoneFrom, this.phoneTo);
        } else {
            System.out.printf("ERROR WHILE RECEIVING CONVERSATION FROM [%s] TO [%s]\n",
                    this.phoneFrom, this.phoneTo);
            
            System.out.println(this.toString());
        }
    }
    
    public boolean canView() {
        return this.status.equals(ConversationStatus.RECEIVED);
    }

    public void view() {
        if (this.canView()) {
            this.status = ConversationStatus.VIEWING;

            System.out.printf("VIEWING CONVERSATION FROM [%s] TO [%s]\n",
                    this.phoneFrom, this.phoneTo);
            
            this.status = ConversationStatus.VIEWED;
            
            System.out.printf("CONVERSATION HAS VIEWED FROM [%s] TO [%s]\n",
                    this.phoneFrom, this.phoneTo);
        } else {
            System.out.printf("ERROR WHILE VIEWING CONVERSATION FROM [%s] TO [%s]\n",
                    this.phoneFrom, this.phoneTo);
            
            System.out.println(this.toString());
        }
    }

}
