package in.SpringBoot;

import in.SpringBoot.Notification.SendNotification;
import in.SpringBoot.Notification.emailNotification;
import in.SpringBoot.Notification.smsNotification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

//@Configuration
//@ComponentScan("in.SpringBoot")
public class Appconfig {
    @Bean
    @Qualifier
    public SendNotification email(){
        return new emailNotification();
    }
    @Bean
    @Qualifier
    public SendNotification sms(){
        return new smsNotification();
    }
    @Bean
    public OrderService orderService(@Qualifier("sms") SendNotification notification){
        return new OrderService(notification);
    }
}
