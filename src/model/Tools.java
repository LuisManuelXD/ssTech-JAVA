package model;

public class Tools{
    String name;
    int id;
    double price;
    int type;
    int amount;
    
    Tools next;

    public Tools(String name, int id, double price, int type, int amount) {
    
        this.name = name;
        this.id = id;
        this.price = price;
        this.type = type;
        this.amount = amount;
        next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Tools getNext() {
        return next;
    }

    public void setNext(Tools next) {
        this.next = next;
    }

}
