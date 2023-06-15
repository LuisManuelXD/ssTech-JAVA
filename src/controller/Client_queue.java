
package controller;

import model.Client;

public class Client_queue {
    Client queue_c; //queue_client
    
    public Client_queue(){
        this.queue_c = null;
    }
    
    
    public void enqueue_C(String n, String l_n, int a, String m, String c){ //add function
        Client newClient = new Client(n, l_n, a, m, c);
        
        if(queue_c == null){
            queue_c = newClient;
        } else {
            Client aux = queue_c; 
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newClient);
        } //else
    } //enqueue
    
    public void search_C(){
        
    }
    
    public void edit_C(){
        
    }
    
    public void dequeue_C(){ //ddelete function
        Client aux = queue_c;
        if(queue_c == null){
            //print a message "la cola esta vacia"
            System.out.println("La cola esta vacia");
        } else {
            if(aux.getNext() == null){
                queue_c = null;
            } else {
                queue_c = aux.getNext();
            } //else2
        } //else
    } //dequeue
    
    //================
    public void recorrerCola(){
        Client aux = queue_c;
        if(queue_c == null) {
            System.out.println("La cola esta vacia");
        } else {
            while ( aux != null){
                System.out.println("\nNombre: " + aux.getName() + "\nApellido: " + aux.getLastName() + "\nEdad: " + aux.getAge()
                + "\nCorreo: " + aux.getMail() + "\nCelular: " + aux.getCellPhone());
                aux = aux.getNext();
            }
        }
    }
    
}
