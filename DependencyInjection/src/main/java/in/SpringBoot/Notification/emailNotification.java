package in.SpringBoot.Notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component
//@Qualifier
public class emailNotification implements SendNotification{
    @Override
    public void sendNotification() {
        System.out.println("Email notification sent");
    }
}
