package bean;

public class HelloWorld {

    private String message;

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public String getMessage() {
        return this.message;
    }

    public String getIncorrectMessage() {
        return "Bad Response: " + this.message;
    }
}
