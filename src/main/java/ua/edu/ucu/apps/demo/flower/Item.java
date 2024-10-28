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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
}
