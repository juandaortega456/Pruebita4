package vista;

import datos.Productos;
import java.util.LinkedList;
import modelo.OperacionesPila;
import modelo.Pila;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan_dav.ortega
 */
public class Main_Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila<Productos> pilaProductos = new Pila<>();
        Pila<Productos> piladuplicada = new Pila<>();
        Pila<Productos> pilaInvertida = new Pila<>();
        pilaProductos.apilar(new Productos("Arroz", 2, 5000));
        pilaProductos.apilar(new Productos("Lentejas", 3, 4500));
        pilaProductos.apilar(new Productos("Frijoles", 5, 3500));
        pilaProductos.apilar(new Productos("Papa", 4, 6500));
        pilaProductos.apilar(new Productos("Carne", 2, 9500));
        pilaProductos.apilar(new Productos("Spaguttis", 6, 7500));
        System.out.println("pila Origina \n" + pilaProductos.toString());
        
        piladuplicada = OperacionesPila.pilaDuplicada(pilaProductos);

    
        System.out.println("pila duplicada: \n"+ piladuplicada.toString());
    
        pilaInvertida = OperacionesPila.pilaInvertida(pilaProductos);
        System.out.println("pila invertida: \n"+ pilaInvertida.toString());
    }
    
}
