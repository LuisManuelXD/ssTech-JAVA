package controller;

import javax.swing.JOptionPane;
import model.Refacts;

public class Refacts_queue {

    Refacts queue_r; //queue_client

    public Refacts_queue() {
        this.queue_r = null;
    }
<<<<<<< HEAD
    

    //add function
    
    
    public void enqueue_C(int u, String p_n, double p, String p_c, String p_s){ //add function
        Refacts newRefacts = new Refacts(u, p_n, p, p_c, p_s);
        
        if(queue_r == null){
            queue_r= newRefacts;
=======

    public void enqueue_C(int id, int units, String productName, double price, String category, String prouctStatus) {
        Refacts newRefacts = new Refacts(id, units, productName, price, category, prouctStatus);

        if (queue_r == null) {
            queue_r = newRefacts;
>>>>>>> origin/manuelBranch
        } else {
            Refacts aux = queue_r;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newRefacts);
        } //else
    } //enqueue

    public void search_C(double wanted) {
        Refacts aux = queue_r;
        boolean find = false;
        if (queue_r == null) {
            JOptionPane.showMessageDialog(null, "La cola está vacía");
        } else {
            while (aux != null && find != true) {
                if (aux.getPrice() == (wanted)) {
                    System.out.println("Los datos encontrados son: " + "\n" + aux.getUnits() + "\n" + aux.getProductName() + "\n" + aux.getPrice() + "\n" + aux.getCategory()+ "\n" + aux.getProuctStatus());
                    find = true;
                }
                aux = aux.getNext();
            }
            if (!find) {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias ");
            }
        }
    }

    public void updateRefact(int id, String newProductname, int newUnit, double newPrecio, String newCategory, String newProductState) {
        Refacts aux = queue_r;

        while (aux != null) {
            if (aux.getId() == id) {
                aux.setId(id);
                aux.setProductName(newProductname);
                aux.setUnits(newUnit);
                aux.setPrice(newPrecio);
                aux.setCategory(newCategory);
                aux.setProuctStatus(newProductState);

                return;
            }
            aux = aux.getNext();
        }
        System.out.println("No se encontró ninguna refacción con el producto proporcionado.");
    }

    public void dequeue_C() { //ddelete function
        Refacts aux = queue_r;
        if (queue_r == null) {
            //print a message "la cola esta vacia"

        } else {
            if (aux.getNext() == null) {
                queue_r = null;
            } else {
                queue_r = aux.getNext();
            } //else2
        } //else
    } //dequeue

    //================
    public void recorrerCola() {
        Refacts aux = queue_r;
        if (queue_r == null) {
            JOptionPane.showMessageDialog(null, "La cola está ");
        } else {
            while (aux != null) {
                System.out.println("\nUnidades: " + aux.getUnits() + "\nNombre Producto: " + aux.getProductName() + "\nPrecio: " + aux.getPrice()
                        + "\nClase del producto: " + aux.getCategory()+ "\nEstatus del producto: " + aux.getProuctStatus());
                aux = aux.getNext();
            }
        }
    }
    
    public Refacts getRefacts(int id) {
        Refacts aux = queue_r;
        
        while (aux != null) {
            if (aux.getId() == id) {
                return aux;
            }
            aux = aux.getNext();
        }
        
        return null; // No se encontró ningún cliente con el correo electrónico dado
    }

    public Refacts[] getAllRefacts() {
        Refacts[] refacts = new Refacts[getSize()];
        Refacts aux = queue_r;
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

}
