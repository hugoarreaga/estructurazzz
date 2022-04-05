/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineales;

/**
 *
 * @author Arreaga
 */
class NodoDoblementeEnlazada{
    String nombre;
    NodoDoblementeEnlazada siguiente;
    NodoDoblementeEnlazada anterior;
    
    NodoDoblementeEnlazada(String nombre){
        this.nombre = nombre;
        this.anterior = null;
        this.siguiente = null;
    }
}

public class ListaDoblementeEnlazada {
    NodoDoblementeEnlazada primero;
    NodoDoblementeEnlazada ultimo;
    int contador;
    
    public ListaDoblementeEnlazada(){
        this.primero = null;
        this.ultimo = null;
        this.contador = 0;
    }
    
    public void insertar(String nombre){
        NodoDoblementeEnlazada nuevo = new NodoDoblementeEnlazada(nombre);
        if(this.primero == null){ // lista vacia
            this.primero = nuevo;
            this.ultimo = nuevo;
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
        NodoDoblementeEnlazada temp = this.primero;
        while(temp.siguiente!= null){ /// recorrer todos hasta llegar al ultimo
            temp = temp.siguiente;
        }
        temp.siguiente = nuevo;
        nuevo.anterior = temp;
        this.ultimo = nuevo;
        this.contador++;
    }
    
    public NodoDoblementeEnlazada get_node(String nombre){
        if(this.ultimo == null){   // lista vacia
            System.out.println("LISTA VACIA");
            return null;
        }
        NodoDoblementeEnlazada temp = this.ultimo;
        while(temp != null){ /// recorrer todos hasta llegar al ultimo
            if(temp.nombre.equals(nombre)){ // nombre del nodo actual es igual al nodo que buscamos
                return temp;
            }
            temp = temp.anterior;
        }
        System.out.println("NO SE ENCONTRO EL ELEMENTO: "+nombre);
        return null;    /// no se encontro el nodo
    }
    
    public void print_node(String nombre){
        if(this.ultimo == null){   // lista vacia
            System.out.println("LISTA VACIA");
            return;
        }
        NodoDoblementeEnlazada temp = this.ultimo;
        while(temp != null){ /// recorrer todos hasta llegar al ultimo
            if(temp.nombre.equals(nombre)){ // nombre del nodo actual es igual al nodo que buscamos
                System.out.println("SE ENCONTRO EL NODO: "+nombre);
                return;
            }
            temp = temp.anterior;
        }
        System.out.println("NO SE ENCONTRO EL ELEMENTO: "+nombre);
        return;    /// no se encontro el nodo
    }
}
