package in.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Payment {
    public Payment(){
        System.out.println("Payment started");
    }
    public void payment(){
        System.out.println("Payment done");
    }
}
