/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550542
 */
public class Principal {

    /**
     * @param args Ventajas de usar el stack, explicacion de como funciona la memoria stack, se eliminan de arriba hacia abajo
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("Llamando a A");
          A();
            System.out.println("Termino llamada a A");
    }
    public static void A(){
          System.out.println("Llamando a B");
        B();
          System.out.println("Termino llamada a B");
    }
    public static void B(){
        System.out.println("Llamando a C");
        C();
          System.out.println("Termino llamada a C");
    }
    public static void C(){
        System.out.println("Fin del camino");
    }
}