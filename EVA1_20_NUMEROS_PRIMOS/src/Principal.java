
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
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int iSeraPrimo= sCaptu.nextInt();
        int iResi;
        for (int i = 2; i < iSeraPrimo; i++) { //POCO EFICIENTE 
            iResi=iSeraPrimo%i;
            if (iResi== 0){
                System.out.println("El numero no es primo ");  
                break;
            }
         
        }
        int iRaiz= (int)Math.sqrt(iSeraPrimo);
        for (int i = 2; i < iRaiz; i++) {//MUCHO MAS EFICIENTE
            iResi = iSeraPrimo % i;
            if (iResi == 0){
                System.out.println("El numero no es primo ");  
                break;
            }
    }
    
    }
}
