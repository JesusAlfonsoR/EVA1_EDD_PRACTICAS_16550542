
import java.util.Scanner;

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
        int aiArray2D[][];
        
        //DEFINIT PRIMERO EL NUMERO DE FILAS(GRUPO)
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("Numero de grupos");
        int iNoGrup=sCaptu.nextInt();
        
        aiArray2D = new int[iNoGrup][];//CANTIDAD DE GRUPOS  
        int iNoAlu;
        for (int i = 0; i < iNoGrup; i++) {
            //PREGUNTAR EL NUMERO DE ALUMNOS
            System.out.println("Numero de alumnos para el grupo " + i + " 1");
            iNoAlu=sCaptu.nextInt();
            aiArray2D[i]= new int [iNoAlu];
            
        }
        //PEDIR LOS DATOS
        for (int i = 0; i < iNoGrup; i++) {//FILAS GRUPOS
            for (int j = 0; j < aiArray2D[i].length; j++) {
                System.out.println("Edad grupo " + i + " i");
                   aiArray2D[i][j]=sCaptu.nextInt();
            }
            
        }//PEDIR LOS DATOS
        int iAcum;
        double dProm;
        for (int i = 0; i < iNoGrup; i++) {//FILAS GRUPOS iAcum=0;
           iAcum=0;
           dProm=0;
            for (int j = 0; j < aiArray2D[i].length; j++) {
                iAcum = aiArray2D[i][j];//SUMATORIA DE TODAS LAS EDADES
                
             
               
            }
        dProm = iAcum/aiArray2D[i].length;
            System.out.println("Para el grupo " + i + ", el promedio de " + " edad es " + dProm );
               
        }
    }
    
}
