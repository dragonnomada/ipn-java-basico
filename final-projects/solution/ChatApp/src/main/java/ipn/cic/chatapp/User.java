package ipn.cic.chatapp;

public class User {

    private String phone;
    private String name;
    
    public User() {
        this.phone = "+525512345678";
        this.name = "UNKNOWN";
    }
    
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return String.format("[%s] %s", this.phone, this.name);
    }
    
}
