package ua.edu.ucu.apps.demo.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {

    @Test
    void testGetPaymentBeforePaying() {
        PayPalPaymentStrategy payment = new PayPalPaymentStrategy();
        assertEquals("Payed with pay pal", payment.getPayment());
    }

    @Test
    void testGetPaymentAfterPaying() {
        PayPalPaymentStrategy payment = new PayPalPaymentStrategy();
        payment.setPayed(true);
        assertEquals("The bill is already payed", payment.getPayment());
    }
}
