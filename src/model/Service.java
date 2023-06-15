/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Service {
    String description; 
    double price;
    int id;
    int type;
    
    Service next;

    public Service(String description, double price, int id, int type) {
        this.description = description;
        this.price = price;
        this.id = id;
        this.type = type;
        next = null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Service getNext() {
        return next;
    }

    public void setNext(Service next) {
        this.next = next;
    }
    
    

    
    

    
    
    
}
