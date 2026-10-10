package in.SpringBoot;

import in.SpringBoot.Notification.SendNotification;
import in.SpringBoot.Notification.smsNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    //3. Field Injection (Not Recommended)
    //@Autowired
    private SendNotification notification;

    //1. Using constructor based Dependency Injection
    //    @Autowired
    public OrderService(SendNotification notification){
        this.notification = notification;
    }

    //2. Using setter injection
//    @Autowired
//    public void setNotification(smsNotification notification) {
//        this.notification = notification;
//    }

    public void placeOrder(){
        System.out.println("Order Placed");
        notification.sendNotification();
    }
}
