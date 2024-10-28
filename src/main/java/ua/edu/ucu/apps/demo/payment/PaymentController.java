package ua.edu.ucu.apps.demo.payment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final CreditCardPaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();
    private final PayPalPaymentStrategy payPalPayment = new PayPalPaymentStrategy();

    @PostMapping("/credit-card/pay")
    public String payWithCreditCard() {
        creditCardPayment.setPayed(true);
        return creditCardPayment.getPayment();
    }

    @GetMapping("/credit-card/status")
    public String getCreditCardStatus() {
        return creditCardPayment.getPayment();
    }

    @PostMapping("/paypal/pay")
    public String payWithPayPal() {
        payPalPayment.setPayed(true);
        return payPalPayment.getPayment();
    }

    @GetMapping("/paypal/status")
    public String getPayPalStatus() {
        return payPalPayment.getPayment();
    }
}
