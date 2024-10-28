package ua.edu.ucu.apps.demo.delivery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    @Test
    void testGetAddress() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        delivery.setAddress("123 Test St");
        assertEquals("123 Test St", delivery.getAddress());
    }

    @Test
    void testDeliveryNotification() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        assertEquals("Delivered with DHL", delivery.getdeliveryNotification());
    }
}
