package model;

public class Refacts {
    int id;
    int units;
    String productName;
    double price;
    String category;
    String prouctStatus;
    
    Refacts next;

    public Refacts(int id, int units, String productName, double price, String category, String prouctStatus) {
        this.id = id;
        this.units = units;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.prouctStatus = prouctStatus;
        next = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProuctStatus() {
        return prouctStatus;
    }

    public void setProuctStatus(String prouctStatus) {
        this.prouctStatus = prouctStatus;
    }

    public Refacts getNext() {
        return next;
    }

    public void setNext(Refacts next) {
        this.next = next;
    }

    
    
}
