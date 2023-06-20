
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
    
    public void search_S(String wanted){
        Service aux = stack_s;
        boolean find = false;
        if(stack_s == null) {
            System.out.println("La pila esta vacia");
        } else {
            while ( aux != null && find != true){
                if (aux.getId() == Integer.parseInt(wanted)) {
                    System.out.println("Datos encontrados:\nDescripcion: " + aux.getDescription()+ "\nPrecio: " + aux.getPrice()+ "\nID:: " + aux.getId()
                + "\nTipo: " + aux.getType());
                }
                aux = aux.getNext();
            }
            if (!find) {
                System.out.println("No se encontraron coincidencias.");
            }
        }
    }
    
    public void edit_S(String search, String id, double price, int type, String description){
        Service aux = stack_s;
        boolean find = false;
        if(stack_s == null) {
            System.out.println("La pila esta vacia");
        } else {
            while ( aux != null && find != true){
                if (aux.getId() == Integer.parseInt(search)) {
                    System.out.println("Datos encontrados:\nDescripcion: " + aux.getDescription()+ "\nPrecio: " + aux.getPrice()+ "\nID:: " + aux.getId()
                + "\nTipo: " + aux.getType());
                    System.out.println("Ingrese los nuevos cambios:");
                    aux.setId(Integer.parseInt(id));
                    aux.setPrice(price);
                    aux.setType(type);
                    aux.setDescription(description);
                }
                aux = aux.getNext();
            }
            if (!find) {
                System.out.println("No se encontraron coincidencias.");
            }
        }
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
