package ua.edu.ucu.apps.demo.flower;

public class Item {
    private Integer price;
    private String name;

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price != null ? price : 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
}
