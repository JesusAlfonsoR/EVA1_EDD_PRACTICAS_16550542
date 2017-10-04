/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *    Muchos datos iguales es conveniente usar los arreglos
 * @author 16550542
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiMisNume[] = new int[10];
        for (int i = 0; i < 10; i++) {
            aiMisNume[i] = (int)(Math.random() * 10 ) +1;
            
            //FOR EACH 
            for(int x: aiMisNume){ //int for (int i = 0; i < 10; i++) { Declaracion de un arreglo for Each ( variable "x" : Arreglo)
                System.out.println("x = " + x);
        }
            
            //Multiples arreglos
            int[] aiArreglo1,aiArreglo2,aiArreglo3; //Todos son arreglos
            aiArreglo1 = new int[3];
             aiArreglo2 = new int[2];
              aiArreglo3 = new int[1];
        }
        //Arreglos y variables
        int aiArre[] , iVar, iVar2; // Solo aiArre[] es arreglo
        aiArre= new int[10];
        iVar=10;
        iVar2=30;
    }
    
}
