package ua.edu.ucu.apps.demo;

import java.util.List;

import ua.edu.ucu.apps.demo.flower.Item;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.delivery.Delivery;;

public class Order {

    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> newItems) {
        this.items = newItems;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public Payment getPayment() {
        return payment;
    }

    public double getPrice() {
        double sum = 0;
        for (Item el: items) {
            sum += el.getPrice();
        }
        return sum;
    }

    public Order(List<Item> items, Delivery delivery, Payment payment) {
        this.items = items;
        this.delivery = delivery;
        this.payment = payment;
    }
}
