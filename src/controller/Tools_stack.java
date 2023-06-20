/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Tools;

public class Tools_stack {
    Tools stack_t; //stack_tools
    
    public Tools_stack(){
        this.stack_t = null;
    }
    
    public void push_T(String n, int id, double p, int t, int a){
        Tools newTools = new Tools(n, id, p, t, a);
        
        if(stack_t == null){
            stack_t = newTools;
        } else {
            Tools aux = stack_t;
            stack_t = newTools;
            newTools.setNext(aux);
        } //else
    }//add_T
    
    public void search_T(String wanted){
        Tools aux = stack_t;
        boolean find = false;
        if(stack_t == null) {
            System.out.println("La pila esta vacia");
        } else {
            while ( aux != null && find != true){
                if (aux.getId() == Integer.parseInt(wanted)) {
                    System.out.println("\nNombre: " + aux.getName() + "\nId: " + aux.getId()+ "\nprecio: " + aux.getPrice()
                + "\nTipo: " + aux.getType()+ "\nCantidad: " + aux.getAmount());
                }
                aux = aux.getNext();
            }
            if (!find) {
                System.out.println("No se encontraron coincidencias.");
            }
        }
    }
    
    public void edit_T(String search, String name, String id, String price, int type, int amount){
        Tools aux = stack_t;
        boolean find = false;
        if(stack_t == null) {
            System.out.println("La pila esta vacia");
        } else {
            while ( aux != null && find != true){
                if (aux.getId() == Integer.parseInt(search)) {
                    System.out.println("Ingrese los nuevos datos:");
                    aux.setName(name);
                    aux.setId(Integer.parseInt(id));
                    aux.setPrice(Double.parseDouble(price));
                    aux.setType(type);
                    aux.setAmount(amount);
                }
                aux = aux.getNext();
            }
            if (!find) {
                System.out.println("No se encontraron coincidencias.");
            }
        }
    }
    
    public void pop_T(){
        Tools aux = stack_t;
        if(stack_t == null){
            //show message "La pila esta vacia"
        } else {
            if(aux.getNext() == null){
                stack_t = null;
            } else {
                stack_t = aux.getNext();
            } //else2
        }//else
    }
    
    //=========================
    public void recorrerCola(){
        Tools aux = stack_t;
        if(stack_t == null) {
            System.out.println("La pila esta vacia");
        } else {
            while ( aux != null){
                System.out.println("\nNombre: " + aux.getName() + "\nId: " + aux.getId()+ "\nprecio: " + aux.getPrice()
                + "\nTipo: " + aux.getType()+ "\nCantidad: " + aux.getAmount());
                aux = aux.getNext();
            }
        }
    }
}
