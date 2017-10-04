
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Proyecto inicial para conocer e identificar los tipos de datos primitivos  en java*/
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
        String sNom;
        int iEdad;
        double dSal;
        Scanner sScanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        sNom = sScanner.nextLine();
        System.out.println("Introduce tu edad");
        iEdad = sScanner.nextInt();
        System.out.println("Introduce tu salario");
        dSal = sScanner.nextDouble();
        
        
        hacerAlgo(sNom,iEdad,dSal);
         
    }

    /**
     *Ejemplo para comentarios usando javadoc
     * @param sNombre %Ejemplo usando string
     * @param iEdad %Ejemplo usando enteros 
     * @param dSalario %Ejemplo usando dobles
     */
    public static void hacerAlgo(String sNombre, int iEdad, double dSalario){
        System.out.println(sNombre +" " + iEdad + " " + dSalario +" ");
    }
}
