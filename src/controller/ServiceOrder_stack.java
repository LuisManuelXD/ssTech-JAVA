
package controller;

import model.Service;
import model.ServiceOrder;

public class ServiceOrder_stack {
    ServiceOrder stack_so; //stack_serviceOrder
    
    public ServiceOrder_stack(){
        this.stack_so = null;
    }
    
    //(order_number, client
    public void add_SO(String o_n, String c, String c_n, int s, String o_d, String d_d, String d, double p, int id, int t){
        ServiceOrder newServiceOrder = new ServiceOrder(o_n, c, c_n, s, o_d, d_d, d, p, id, t);
        
        if(stack_so == null){
            stack_so = newServiceOrder;
        } else {
            ServiceOrder aux = stack_so;
            stack_so = newServiceOrder;
            newServiceOrder.setNext(aux);
        } //else
    } //add_C
    
    public void search_SO(){
        
    }
    
    public void edit_SO(){
        
    }
    
    public void delete_SO(){
        ServiceOrder aux = stack_so;
        if(stack_so == null){
            //show message "La pila esta vacia"
        } else {
            if(aux.getNext() == null){
                stack_so = null;
            } else {
                stack_so = aux.getNext();
            } //else2
        }//else
    }
    
    //========================
    public void recorrerCola(){
        ServiceOrder aux = stack_so;
        if(stack_so == null) {
            System.out.println("La pila esta vacia");
        } else {
            while ( aux != null){
                System.out.println("\nNumero de orden: " + aux.getOrderNumber()+ "\nCliente: " + aux.getClient()+ "\nNumero Celular: " + aux.getCellNumber()
                + "\nEstado: " + aux.getState() + "\nFecha de la orden: " + aux.getOrderDate() + "\nFecha de entrega: " + aux.getDeliveryDate());
                aux = aux.getNext();
            }
        }
    }
}
