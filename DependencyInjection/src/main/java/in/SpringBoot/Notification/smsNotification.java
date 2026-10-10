package in.SpringBoot.Notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Component
//@Qualifier
public class smsNotification implements SendNotification {
    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent");
    }
}
