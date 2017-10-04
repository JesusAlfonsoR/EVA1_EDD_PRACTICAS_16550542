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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiMillon[]= new int [100000000];//DECLARAMOS ARREGLO DE UN MILLON DE DATOS
        for (int i = 0; i < aiMillon.length; i++) {
            aiMillon[i]= (int)(Math.random()*100)+1;//LLENARLO CON VALORES ALEATORIOS DE 0 A 100
        }
    }
    
}
