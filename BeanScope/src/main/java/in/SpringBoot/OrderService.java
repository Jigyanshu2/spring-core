package in.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderService {
    @Autowired
    private Payment payment;
    public OrderService(){
        System.out.println("Order Created");
    }
    public void placeOrder(){
        payment.payment();
        orderDetails();
        System.out.println("Order placed;");
    }
    public void orderDetails(){
        System.out.println("Order Details");
    }
}
