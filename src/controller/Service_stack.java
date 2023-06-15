
package controller;

import model.Service;
import model.Tools;

public class Service_stack {
    Service stack_s; //stack_service
    
    public Service_stack(){
        this.stack_s = null;
    }
    
    public void push_S(String d, double p, int id, int t){
        Service newService = new Service(d, p, id, t);
        
        if(stack_s == null){
            stack_s = newService;
        } else {
            Service aux = stack_s;
            stack_s = newService;
            newService.setNext(aux);
        }//else
    }
    
    public void search_S(){
        
    }
    
    public void edit_S(){
        
    }
    
    public void pop_S(){
        Service aux = stack_s;
        if(stack_s == null){
            //show message "La pila esta vacia"
        } else {
            if(aux.getNext() == null){
                stack_s = null;
            } else {
                stack_s = aux.getNext();
            } //else2
        }//else
    }
    
    //================================
    public void recorrerCola(){
        Service aux = stack_s;
        if(stack_s == null) {
            System.out.println("La pila esta vacia");
        } else {
            while ( aux != null){
                System.out.println("\nDescripcion: " + aux.getDescription()+ "\nPrecio: " + aux.getPrice()+ "\nID:: " + aux.getId()
                + "\nTipo: " + aux.getType());
                aux = aux.getNext();
            }
        }
    }
}
