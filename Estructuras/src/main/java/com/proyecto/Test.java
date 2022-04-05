/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto;

import lineales.*;

/**
 *
 * @author Arreaga
 */
public class Test {
    public static void main(String[] args){
        /**
         * LISTA SIMPLE DE ELEMENTOS
         */
        ListaSimple lista = new ListaSimple();
        
        lista.insertar("elemento1");
        lista.insertar("elemento18");
        lista.insertar("elemento12");
        lista.insertar("elemento12");
        lista.insertar("elemento11");
        lista.insertar("elemento18");
        
        lista.imprimir();
        System.out.println("Nodos: "+lista.contador);
        lista.eliminar("elemento18");
        lista.eliminar("elemento18");
        lista.eliminar("dfs");
        lista.imprimir();
        System.out.println("Nodos: "+lista.contador);
        
        /**
         * LISTA DOBLEMENTE ENLAZADA
         */
        
        ListaDoblementeEnlazada lista_doble = new ListaDoblementeEnlazada();
        lista_doble.insertar("nombre1");
        lista_doble.insertar("nombre12");
        lista_doble.insertar("nombre1");
        lista_doble.insertar("nombre18");
        lista_doble.insertar("nombre15");
        lista_doble.insertar("nombre16");
        
        
        lista_doble.print_node("nombre1");
    }
}
