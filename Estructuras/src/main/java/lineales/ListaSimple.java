/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineales;

/**
 *
 * @author Arreaga
 */


class NodoListaSimple{
    String nombre;
    NodoListaSimple siguiente;
    
    NodoListaSimple(String nombre){
        this.nombre = nombre;
        this.siguiente = null;
    }
}

public class ListaSimple {
    NodoListaSimple primero;
    public int contador;
    
    public ListaSimple(){
        this.contador = 0;
        this.primero = null;
    }
    
    /**
     * INSERTAR NUEVO ELEMENTO EN LA LISTA SIMPLE
     * @param nombre 
     */
    public void insertar(String nombre){
        NodoListaSimple nuevo = new NodoListaSimple(nombre);
        if(this.primero == null){ // lista vacia
            this.primero = nuevo;
            this.contador++;
            return;
        }
        /* PARA NO PERMITIR DATOS REPETIDOS 
        NodoListaSimple aux = this.get_nodo(nombre);
        if (aux != null){
            System.out.println("YA EXISTE EL NODO: "+nombre);
            return;
        }
        */
        NodoListaSimple temp = this.primero;
        while(temp.siguiente!= null){ /// recorrer todos hasta llegar al ultimo
            temp = temp.siguiente;
        }
        temp.siguiente = nuevo;
        this.contador++;
    }
    
    /**
     * OBTENER EL NODO SEGUN EL NOMBRE COMO PARAMETRO
     * @param nombre
     * @return 
     */
    public NodoListaSimple get_nodo(String nombre){
        if(this.primero == null){   // lista vacia
            return null;
        }
        NodoListaSimple temp = this.primero;
        while(temp != null){ /// recorrer todos hasta llegar al ultimo
            if(temp.nombre.equals(nombre)){ // nombre del nodo actual es igual al nodo que buscamos
                return temp;
            }
            temp = temp.siguiente;
        }
        return null;    /// no se encontro el nodo
    }
    
    public void eliminar(String nombre){
        if(this.primero == null){
            System.out.println("LISTA VACIA");
            return;
        }
        NodoListaSimple temp = this.primero;
        /** VERIFICAMOS SI ES EL PRIMERO NODO EL QUE SE VA A ELIMINAR */
        if(temp.nombre.equals(nombre)){
            System.out.println("Se elimino el nodo con el nombre: "+nombre);
            this.primero = this.primero.siguiente;
            this.contador--;
            return;
        }
        while(temp.siguiente != null){ // recorrer todos los nodos
            /** VERIFICARMOS SI EL NODO SIGUIENTE ES IGUAL AL QUE SE VA A ELIMINAR*/
            if(temp.siguiente.nombre.equals(nombre)){ 
                temp.siguiente = temp.siguiente.siguiente;
                System.out.println("Se elimino el nodo con el nombre: "+nombre);
                this.contador--;
                return;
            }
            temp = temp.siguiente;
        }
        System.out.println("NO SE ENCONTRO EL ELEMENTO: "+nombre);
    }
    
    public void imprimir(){
        if(this.primero == null){
            System.out.println("LISTA VACIA");
            return;
        }
        System.out.println("LISTADO DE DATOS DE LA LISTA SIMPLE");
        NodoListaSimple temp = this.primero;
        while(temp != null){ // recorrer todos los nodos
            System.out.println("NODO: "+temp.nombre);
            temp = temp.siguiente;
        }
    }
}

