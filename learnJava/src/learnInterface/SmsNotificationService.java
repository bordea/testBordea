package learnInterface;

public class SmsNotificationService implements NotificationService {

    @Override
    public void sendMessage(String message) {
        print("sms " + message);
    }

    @Override
    public void sendHighPriorityMessage(String message) {
        print("sms high " + message);
    }

    @Override
    public void sendAllMessage(String[] messagesArray) {
        for(String message: messagesArray){
            print("sms all bulk "+ message);
        }
    }

    private void print(String mes){
        System.out.println(mes);
    }
}

