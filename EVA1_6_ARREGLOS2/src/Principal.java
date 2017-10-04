
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
    public static final int Tama_Arre = 5;

    public static void main(String[] args) {
        // TODO code application logic here
        int aiEdad[];
        aiEdad = new int[Tama_Arre];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < aiEdad.length; i++) { //Puede usarse aiEdad.lenght o Tama_Arre
            System.out.println("Introduce tu edad");
            aiEdad[i] = sCaptu.nextInt();

        }
        
        //Imprimir con Each
        for(int x: aiEdad){
            System.out.println("Edades " + x );
        }
            // Crear un duplicado (Debe copiarse atributo por atributo) //No crea un duplicado 
       int aiCopiaEdad[];
       //aiCopiaEdad = aiEdad;
       aiCopiaEdad= new int [Tama_Arre];
       
        for (int i = 0; i < Tama_Arre; i++) {
            aiCopiaEdad[i] = aiEdad[i];
        }
        for (int x : aiCopiaEdad) {
            System.out.println("Copia Edad = " + x);
        }
        
        System.out.println(aiCopiaEdad);
        System.out.println(aiEdad);
    }

}
