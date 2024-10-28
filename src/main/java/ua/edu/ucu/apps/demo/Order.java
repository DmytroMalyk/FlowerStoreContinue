package ua.edu.ucu.apps.demo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.flower.Item;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.delivery.Delivery;;

@Getter
@Setter
public class Order {

    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public double calculateTotalPrice() {
        double sum = 0;
        for (Item el: items) {
            sum += el.getPrice();
        }
        return sum;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Order(List<Item> items, Delivery delivery, Payment payment) {
        this.items = items;
        this.delivery = delivery;
        this.payment = payment;
    }
}
