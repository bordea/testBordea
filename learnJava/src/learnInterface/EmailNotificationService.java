package learnInterface;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendMessage(String message) {
        print("email " + message);
    }

    @Override
    public void sendHighPriorityMessage(String message) {
        print("email high " + message);
    }

    @Override
    public void sendAllMessage(String[] messagesArray) {
        for(String message: messagesArray){
            print("email all bulk "+ message);
        }
    }

    private void print(String mes){
        System.out.println(mes);
    }
}
