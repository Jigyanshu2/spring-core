package in.SpringBoot;

import in.SpringBoot.Notification.SendNotification;
import in.SpringBoot.Notification.emailNotification;
import in.SpringBoot.Notification.smsNotification;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        OrderService order = context.getBean(OrderService.class);

        order.placeOrder();

    }
}