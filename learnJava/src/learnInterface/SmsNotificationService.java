package learnInterface;

public class SmsNotificationService implements NotificationService {
                                                                          // when implementing, all the methods that are only
    @Override                                                             // signatures must be implemented
    public void sendMessage(String message) {
        print("sending sms " + message);
    }

    @Override
    public void sendHighPriorityMessage(String message) {
        print("sms high priority " + message);
    }

    @Override
    public void sendAllMessage(String[] messagesArray) {
        for(String message: messagesArray){
            print("sms all bulk messages "+ message);
        }
    }

    private void print(String mes){
        System.out.println(mes);
    }
}

