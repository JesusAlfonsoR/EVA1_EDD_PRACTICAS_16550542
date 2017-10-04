
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
        Scanner Sc = new Scanner(System.in);
        int x, moda = 0, maxima = 0, r = 0; //Y ES = A LA SUMATORIA DE LAS POSICIONES r= CANTIDAD DE VECES QUE SE REPITE EL NUMERO EN EL ARREGLO
        double y = 0;
        //Generación del arreglo
        System.out.println("Cuantas edades vas a capturar?");
        x = (int) Sc.nextDouble();

        int aiArray[] = new int[x];
        //Llenar el arreglo
        System.out.println("Dame las edades");
        for (int i = 0; i < aiArray.length; i++) {

            aiArray[i] = (int) Sc.nextDouble();
            y = aiArray[i] + y;//Calcular media

        }
        //Calcular moda
        for (int i = 0; i < aiArray.length; i++) {//Leer el arreglo

            for (int j = 0; j < aiArray.length; j++) {//Para cada valor igualarlo y si es el mismo aumentar el contador en 1
                if (aiArray[i] == aiArray[j]) {
                    r++;
                }
            }
            if (r > maxima) {
                moda = aiArray[i];

            }
        }  
        double media = y / x;
        System.out.println("La media es :    " + media);
        System.out.println("La moda es :" + moda);
        //Calcular varianza
        double suma,varianza=0, desvi,redondeo;
        for (int i = 0; i < aiArray.length; i++) {
            suma= Math.pow(aiArray[i]-media, 2);
            varianza = varianza +suma;
        }
          varianza = varianza/(x-1);    
        //Calcular desviación estandar
        desvi = Math.sqrt(varianza);
        redondeo= Math.rint(desvi*100)/100;
        System.out.println("La desviacion estandar es : " + redondeo );
     
    }

}
