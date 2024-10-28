package ua.edu.ucu.apps.demo.flower;

public abstract class Item {
    private double price;
    private String name;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
