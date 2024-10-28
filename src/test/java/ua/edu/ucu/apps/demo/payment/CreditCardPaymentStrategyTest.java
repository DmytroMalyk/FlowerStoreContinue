package ua.edu.ucu.apps.demo.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    @Test
    void testGetPaymentBeforePaying() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        assertEquals("Payed with credit card", payment.getPayment());
    }

    @Test
    void testGetPaymentAfterPaying() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        payment.setPayed(true);
        assertEquals("The bill is already payed", payment.getPayment());
    }
}
