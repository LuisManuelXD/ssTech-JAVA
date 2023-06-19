
package controller;

import model.Client;
import model.Refacts;

public class Refacts_queue {
    Refacts queue_r; //queue_client
    
    public Refacts_queue(){
        this.queue_r = null;
    }
    
    //add function
    public void enqueue_C(int u, String p_n, double p, String p_c, boolean p_s){ 
        Refacts newRefacts = new Refacts(u, p_n, p, p_c, p_s);
        
        if(queue_r == null){
            queue_r= newRefacts;
        } else {
            Refacts aux = queue_r; 
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newRefacts);
        } //else
    } //enqueue
    
    public void search_C(){
        
    }
    
    public void edit_C(){
        
    }
    
    public void dequeue_C(){ //ddelete function
        Refacts aux = queue_r;
        if(queue_r == null){
            //print a message "la cola esta vacia"
            
        } else {
            if(aux.getNext() == null){
                queue_r = null;
            } else {
                queue_r = aux.getNext();
            } //else2
        } //else
    } //dequeue
    
    //================
    public void recorrerCola(){
        Refacts aux = queue_r;
        if(queue_r == null) {
            System.out.println("La cola esta vacia");
        } else {
            while ( aux != null){
                System.out.println("\nUnidades: " + aux.getUnits()+ "\nNombre Producto: " + aux.getProductName()+ "\nPrecio: " + aux.getPrice()
                + "\nClase del producto: " + aux.getProductClass() + "\nEstatus del producto: " + aux.isProuctStatus());
                aux = aux.getNext();
            }
        }
    }
    
}
