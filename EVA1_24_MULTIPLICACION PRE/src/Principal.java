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
        //DECLARAMOS LAS 3 MATRICES COMO DOBLES 
        Double[][] aiArray = new Double[5][5];
        Double[][] aiArray2 = new Double[5][5];
        Double[][] aiArray3 = new Double[5][5];
        //LLENAMOS LAS MATRICES CON VALORES ALEATORIOS DEL 0 AL 10
        for (int i = 0; i < aiArray.length; i++) {
            for (int j = 0; j < aiArray.length; j++) {

                aiArray[i][j] = (Math.random() * 10) + 1;
                System.out.print("[ " + aiArray[i][j] + " ] ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i = 0; i < aiArray2.length; i++) {
            for (int j = 0; j < aiArray2.length; j++) {

                aiArray2[i][j] = (Math.random() * 10) + 1;
                System.out.print("[ " + aiArray2[i][j] + " ] ");
            }
            System.out.println("");
        }
        //HACEMOS LA MULTIPLICACION DE LAS DOS MATRICES Y LO GUARDAMOS EN LA SIGUIENTE 
        System.out.println("\n");
        for (int i = 0; i < aiArray3.length; i++) {
            for (int j = 0; j < aiArray3.length; j++) {
                aiArray3[i][j] = aiArray[i][j] * aiArray2[i][j];
                System.out.print("[ " + aiArray3[i][j] + " ] ");
            }
            System.out.println("");
        }
    }
}
