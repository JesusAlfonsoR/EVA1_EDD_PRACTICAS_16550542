
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
        //CREACION DEL ARREGLO CON LOS MESES
        String aiMeses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        //DIAS
        int aiDias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        //SOLICITAR EL MES AL USUARIO
        int iMes;
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Numero del mes (1 - 12):");
        iMes = sCaptu.nextInt();
        System.out.println("El mes es " + aiMeses[iMes - 1] + " y tiene " + aiDias[iMes - 1] + " días");
    }
    
}
