package learnInterface;

public interface NotificationService {

    int injterfacevariable = 0;

    public void sendMessage(String message);         // in interface we can declare only the method signature

    public void sendHighPriorityMessage(String message);

    public void sendAllMessage(String[] messagesArray);
}
