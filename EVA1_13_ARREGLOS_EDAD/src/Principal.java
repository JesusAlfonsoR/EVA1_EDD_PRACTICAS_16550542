
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
        //PREGUNTAR CUANTAS EDADES VAS A CAPTURAR
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("Cuantas edades se van a capturar");
        int iCant = sCaptu.nextInt(); //CATNTIADA A CAPTURAR
        //INICIAR EL ARREGLO
        int aiEdades[]= new int [iCant];
        //CAPTURAR
        for (int i = 0; i < iCant; i++) {
            System.out.println("Ingresa la edad: ");
            aiEdades[i]=sCaptu.nextInt();
            
        }
        //CAPTURAR EL PROMEDIO DE EDADES
        int iAcum=0;
        for (int iVal : aiEdades) {
            iAcum= iAcum+iVal;//iAcum+=iVal; EQUIVALENTE
            
        }
        //RESULTADO EN VALOR DOBLE
        double dProm= iAcum/iCant;
        System.out.println("El promedio es: " + dProm);
        
    }
    
}
