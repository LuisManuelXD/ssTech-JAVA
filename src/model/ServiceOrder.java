
package model;

public class ServiceOrder extends Service {
    String orderNumber;
    String client;
    String cellNumber;
    int state;
    String orderDate;
    String deliveryDate;
    
    ServiceOrder next;

    public ServiceOrder(String orderNumber, String client, String cellNumber, int state, String orderDate, String deliveryDate, String description, double price, int id, int type) {
        super(description, price, id, type);
        this.orderNumber = orderNumber;
        this.client = client;
        this.cellNumber = cellNumber;
        this.state = state;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        next = null;
    }

  
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public ServiceOrder getNext() {
        return next;
    }

    public void setNext(ServiceOrder next) {
        this.next = next;
    }

    
    
    
    
    
}
