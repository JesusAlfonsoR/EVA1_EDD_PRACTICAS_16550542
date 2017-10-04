
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
        Scanner sc = new Scanner(System.in);
        int x,Z,a=0;
        System.out.println("Tamaño del arreglo: ");
        x=sc.nextInt();
        int y[] = new int [x];
        System.out.println("Ingrese valores de su lista: ");
        for (int i = 0; i < x; i++) {
            y[i]=sc.nextInt();
        }
        int min, max;
        max=y[0];
        min=y[0];
       
       for (int i=0; i<y.length; i++){
    if (y[i]> max){
    max=y[i];
    }
    if (y[i]< min){
    min=y[i];
    }
           
    }
    System.out.println("El numero maximo es " + max + "\n "
                      +"El numero minimo es " + min );
}
}