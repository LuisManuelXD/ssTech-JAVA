
package controller;

import model.Client;
import model.Refacts;

public class Refacts_queue {
    Refacts queue_r; //queue_client
    
    public Refacts_queue(){
        this.queue_r = null;
    }
    
    
    public void enqueue_C(int u, String p_n, double p, String p_c, String p_s){ //add function
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
    
    public void search_C(String wanted){
        Refacts aux = queue_r;
        boolean find = false;
        if(queue_r == null) {
            System.out.println("La cola esta vacia");
        } else {
            while ( aux != null && find != true){
                if (aux.getProductName() == wanted) {
                    System.out.println("Los datos encontrados son: " + aux.getUnits() + aux.getProductName()+ aux.getPrice() + aux.getProductClass() + aux.isProuctStatus());
                    find = true;
                }
                aux = aux.getNext();
            }
            if(!find){
                System.out.println("No se encontraron coincidencias.");
            }
        }
    }
    
    public void edit_C(String search, String units, String pName, String price, String pClass, String pStatus){
        Refacts aux = queue_r;
        boolean find = false;
        if(queue_r == null) {
            System.out.println("La cola esta vacia");
        } else {
            while ( aux != null && find != true){
                if (aux.getProductName() == search) {
                    System.out.println("Ingrese los nuevos datos:");
                    aux.setProductName(pName);
                    aux.setPrice(Double.parseDouble(price));
                    aux.setUnits(Integer.parseInt(units));
                    aux.setProductClass(pClass);
                    aux.setProuctStatus(pStatus);
                    find = true;
                }
                aux = aux.getNext();
            }
            if(!find){
                System.out.println("No se encontraron coincidencias.");
            }
        }
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
