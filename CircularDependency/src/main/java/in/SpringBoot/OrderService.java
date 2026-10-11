package in.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class OrderService {
    @Autowired
    private PaymentService payment;
    public void placeOrder(){
        payment.pay();
        System.out.println("Order placed");
    }
    public void orderDetails(){
        System.out.println("Order Details");
    }


}
