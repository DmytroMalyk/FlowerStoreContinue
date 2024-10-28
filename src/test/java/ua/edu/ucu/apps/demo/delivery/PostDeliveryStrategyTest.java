package ua.edu.ucu.apps.demo.delivery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {

    @Test
    void testGetAddress() {
        PostDeliveryStrategy delivery = new PostDeliveryStrategy();
        delivery.setAddress("456 Sample Rd");
        assertEquals("456 Sample Rd", delivery.getAddress());
    }

    @Test
    void testDeliveryNotification() {
        PostDeliveryStrategy delivery = new PostDeliveryStrategy();
        assertEquals("Delivered with simple Post", delivery.getdeliveryNotification());
    }
}
