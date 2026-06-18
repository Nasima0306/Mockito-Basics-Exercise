package Exercise3;

public class Messenger {
    NotificationService service;
    public Messenger(NotificationService service){
        this.service=service;
    }
    public void send(){
        service.sendMessage("Hello");
    }
}
