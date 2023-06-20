package model;

public class Refacts {
    int units;
    String productName;
    double price;
    String productClass;
    String prouctStatus;
    
    Refacts next;

    public Refacts(int units, String productName, double price, String productClass, String prouctStatus) {
        this.units = units;
        this.productName = productName;
        this.price = price;
        this.productClass = productClass;
        this.prouctStatus = prouctStatus;
        next = null;
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

    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
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
