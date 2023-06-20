
package controller;

import javax.swing.JOptionPane;
import model.Client;
import model.Refacts;

public class Refacts_queue {
    Refacts queue_r; //queue_client
    
    public Refacts_queue(){
        this.queue_r = null;
    }
    

    //add function
    
    
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
    
    public void search_C(double wanted){
        Refacts aux = queue_r;
        boolean find = false;
        if(queue_r == null) {
             JOptionPane.showMessageDialog(null, "La cola está vacía");
        } else {
            while ( aux != null && find != true){
                if (aux.getPrice() == (wanted)) {
                    System.out.println("Los datos encontrados son: " +  "\n" + aux.getUnits() + "\n" + aux.getProductName() + "\n" + aux.getPrice() + "\n" + aux.getProductClass() +  "\n" + aux.getProuctStatus());
                    find = true;
                }
                aux = aux.getNext();
            }
            if(!find){
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias ");
            }
        }
    }
    
    public void updateRefact(String name, String productname , int newunit, double newPrecio, String category, String productState) {
        Refacts aux = queue_r;
        
        while (aux != null) {
            if (aux.getProductName().equals(name)) {
                aux.setProductName(productname);
                aux.setUnits(newunit);
                aux.setPrice(newPrecio);
                aux.setProductClass(category);
                aux.setProuctStatus(productState);
                
                return;
            }
            aux = aux.getNext();
        }
        System.out.println("No se encontró ninguna refacción con el producto proporcionado.");
    }
    
    
     public Refacts[] getAllRefacts() {
        Refacts[] refacts = new Refacts[getSize()];
        Refacts aux = queue_r ;
        int index = 0;
        
        while (aux != null) {
            refacts[index] = aux;
            aux = aux.getNext();
            index++;
        }
        
        return refacts;
    }
     
     private int getSize() {
        int count = 0;
        Refacts aux = queue_r;
        
        while (aux != null) {
            count++;
            aux = aux.getNext();
        }
        
        return count;
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
            JOptionPane.showMessageDialog(null, "La cola está ");
        } else {
            while ( aux != null){
                System.out.println("\nUnidades: " + aux.getUnits()+ "\nNombre Producto: " + aux.getProductName()+ "\nPrecio: " + aux.getPrice()
                + "\nClase del producto: " + aux.getProductClass() + "\nEstatus del producto: " + aux.getProuctStatus());
                aux = aux.getNext();
            }
        }
    } 


public Refacts getRefactByPrice(String price) {
        Refacts aux = queue_r;
        
        while (aux != null) {
            if (aux.getPrice() == Double.parseDouble(price)) {
                return aux;
            }
            aux = aux.getNext();
        }
        
        return null; // No se encontró ningún cliente con el correo electrónico dado
    }

 public void delete_RE(){
        Refacts aux = queue_r;
        if(queue_r == null){
            //show message "La pila esta vacia"
        } else {
            if(aux.getNext() == null){
                queue_r = null;
            } else {
                queue_r = aux.getNext();
            } //else2
        }//else
    }

 
 
}



