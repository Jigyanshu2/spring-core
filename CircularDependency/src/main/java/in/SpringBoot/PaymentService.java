package in.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    @Autowired
    private OrderService order;
    public void pay(){
        System.out.println("Payment done");
        order.orderDetails();
    }
}
