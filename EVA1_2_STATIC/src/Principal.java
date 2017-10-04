
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Si se usa un metodo estatico, no es necesario crear una instancia para usar sus metodos
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
        MiClasePrueba mcObjeto = new MiClasePrueba();
        
        mcObjeto.imprimirMensaje();
        System.out.println(mcObjeto.sNomb);
        MiClasePrueba2.imprimirMensaje();
        MiClasePrueba2.sNomb= "Jesus Alfonso";
        System.out.println(mcObjeto.sNomb);
    }

}

class MiClasePrueba {

    public String sNomb = "Jesus";

    public void imprimirMensaje() {
        System.out.println("Hola mundo ");
    }

}
/*
Ventajas y como usar los metodos "static"
*/
class MiClasePrueba2 {

    public static String sNomb = "Jesus";

    public static void imprimirMensaje() {
        System.out.println("Hola mundo ");
    }

}
