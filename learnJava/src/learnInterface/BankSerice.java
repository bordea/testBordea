package learnInterface;

public class BankSerice {

    public static void main(String[] args){
        // create for myself a notification service
        NotificationService notificationService = new EmailNotificationService();

        notificationService.sendMessage("message1");
        notificationService.sendHighPriorityMessage("message2");
        String[] messages = new String[3];
        messages[0]="mes1";
        messages[1]="mes2";
        messages[2]="mes3";
        notificationService.sendAllMessage(messages);

        NotificationService notificationService2 = new SmsNotificationService();

//        notificationService2.sendMessage("message1");
//        notificationService2.sendHighPriorityMessage("message2");
        notificationService2.sendAllMessage(messages);

        SmsNotificationService smsNotificationService = new SmsNotificationService();
        smsNotificationService.sendAllMessage(messages);
    }
}
