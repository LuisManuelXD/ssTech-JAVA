
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
    
    public void search_C(String wanted){
        Client aux = queue_c;
        boolean find = false;
        if(queue_c == null) {
            System.out.println("La cola esta vacia");
        } else {
            while ( aux != null && find != true){
                if (aux.getMail() == wanted) {
                    System.out.println("Los datos del cliente son: " + aux.getName() + aux.getLastName() + aux.getAge() + aux.getMail() + aux.getCellPhone());
                    find = true;
                }
                aux = aux.getNext();
            }
            if (!find) {
                System.out.println("No se encontraron coincidencias.");
            }
        }
    }
    
    public void edit_C(String search, String name, String lName, String age,  String mail, String phone ){
        Client aux = queue_c;
        boolean find = false;
        if(queue_c == null) {
            System.out.println("La cola esta vacia");
        } else {
            while ( aux != null && find != true){
                if (aux.getMail() == search) {
                    System.out.println("Los datos del cliente son: " + aux.getName() + aux.getLastName() + aux.getAge() + aux.getMail() + aux.getCellPhone());
                    System.out.println("Ingrese los nuevos datos: ");
                    System.out.println("Nombre:");
                    aux.setName(name);
                    System.out.println("Apellidos:");
                    aux.setLastName(lName);
                    System.out.println("Edad:");
                    aux.setAge(Integer.parseInt(age));
                    System.out.println("Correo:");
                    aux.setMail(mail);
                    System.out.println("Celular:");
                    aux.setCellPhone(phone);
                    find = true;
                }
                aux = aux.getNext();
            }
            if (!find) {
                System.out.println("No se encontraron coincidencias.");
            }
        }
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
    
    public Client getClientByMail(String mail) {
        Client aux = queue_c;
        
        while (aux != null) {
            if (aux.getMail().equals(mail)) {
                return aux;
            }
            aux = aux.getNext();
        }
        
        return null; // No se encontró ningún cliente con el correo electrónico dado
    }
    
    public Client[] getAllClients() {
        Client[] clients = new Client[getSize()];
        Client aux = queue_c;
        int index = 0;
        
        while (aux != null) {
            clients[index] = aux;
            aux = aux.getNext();
            index++;
        }
        
        return clients;
    }
    
    private int getSize() {
        int count = 0;
        Client aux = queue_c;
        
        while (aux != null) {
            count++;
            aux = aux.getNext();
        }
        
        return count;
    }
}