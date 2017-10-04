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
        //Cada dimension por si solo es un arreglo
        int aiArreglo3D[][] [] = new int [10] [2] [7];
        System.out.println(aiArreglo3D.length);
         System.out.println(aiArreglo3D[0].length);
          System.out.println(aiArreglo3D[0][0].length);
        
        for (int i = 0; i < aiArreglo3D.length; i++) {//Recorre los niveles 
            for (int j = 0; j<aiArreglo3D[i].length ; j++) {
                for (int k = 0; k < aiArreglo3D[i][j].length; k++) {
                    aiArreglo3D[i] [j] [k]= (int)(Math.random() * 100 ) + 1 ;
                }
                
            }
            
            
        } //Imprimir
        for (int i = 0; i < aiArreglo3D.length; i++) {//Recorre los niveles 
            for (int j = 0;  j < aiArreglo3D[i].length ; j++) {
                for (int k = 0; k < aiArreglo3D[i][j].length; k++) {
                    System.out.println(aiArreglo3D [i] [j] [k]);
                }
                
            }
            
        }
    }
    
}
