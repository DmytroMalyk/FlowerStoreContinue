package ua.edu.ucu.apps.demo.delivery;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    private final Delivery dhlDelivery = new DHLDeliveryStrategy();
    private final Delivery postDelivery = new PostDeliveryStrategy();

    @PostMapping("/dhl")
    public String setDhlAddress(String address) {
        dhlDelivery.setAddress(address);
        return "Address set for DHL: " + dhlDelivery.getAddress();
    }

    @GetMapping("/dhl")
    public String getDhlNotification() {
        return dhlDelivery.getdeliveryNotification();
    }

    @PostMapping("/post")
    public String setPostAddress(String address) {
        postDelivery.setAddress(address);
        return "Address set for Post: " + postDelivery.getAddress();
    }

    @GetMapping("/post")
    public String getPostNotification() {
        return postDelivery.getdeliveryNotification();
    }
}
