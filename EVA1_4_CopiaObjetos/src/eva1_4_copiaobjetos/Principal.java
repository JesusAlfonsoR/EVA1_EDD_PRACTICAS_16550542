/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_copiaobjetos;



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
        int x= 5;
        System.out.println("x=" + x);
        // Crear una copia de:
        int xCopia=x;// Asignamos el valor x a xCopia
        System.out.println("Copia de x= " + xCopia);
        x++;
        System.out.println("x++ = " + x);
          System.out.println("xCopia = " + xCopia);
          
        // Declarar un objeto de tipo numero
          Numero Nva1= new Numero();
          System.out.println("Valor de Nva1 = " + Nva1.x );
          Numero NCopiava1=Nva1;// Creando una copia de la direccion, NO ES UNA COPIA
          System.out.println("Valor de NCopiava1 =" + NCopiava1.x);
          Nva1.x++;
          // Imprimir Nva1 y NCopiava1
          System.out.println("Valor de Nva1 = " + Nva1);
          System.out.println("Valor de NCopiava1 =" + NCopiava1.x);
          // Impirmir los objetos
          System.out.println(Nva1);
          System.out.println(NCopiava1);
          // Copia real de un objeto
          Numero nCopiaReal= new Numero();
          // Hacer copia atributo por atributo
          nCopiaReal.x = Nva1.x;
          System.out.println("Valor de Nva1" + Nva1.x);
            System.out.println("Valor de nCopiaReal" + nCopiaReal.x);
            Nva1.x++;
            //Imprimir los objetos 
             System.out.println(Nva1);
          System.out.println(NCopiava1);
    }
    
}
class Numero{
    public int x=16;
}