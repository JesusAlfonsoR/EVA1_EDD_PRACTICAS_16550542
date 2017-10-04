/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_arrayobjetos;

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
        // Los arreglos de objetos almacenan direcciones, por lo tanto un arreglo de objetos ya tiene un espacio definido 
        Alumno aaDatosAlumno[]; // Idenficador es nulo
        Alumno aaCopiaAlumno[];
        aaDatosAlumno = new Alumno[10];//Creamos arreglo de 10
      aaCopiaAlumno = new Alumno[10]; // Creacion del array para las copias 

        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("Jesus ", " 16550542 ", 1); // Llenar con lo que dice el constructor de la clase Alumno " public Alumno(String sNombre, String sMatricula, int iCarrera)"
            aaCopiaAlumno[i] = new Alumno(aaDatosAlumno[i].getsNomb(),aaDatosAlumno[i].getsMatri(),aaDatosAlumno[i].getiCar());
        }
        for (Alumno aaDatosAlumno1 : aaDatosAlumno) {
            System.out.println("Nombre " + aaDatosAlumno1.getsNomb());
            System.out.println("Matricula  " + aaDatosAlumno1.getsMatri());
            System.out.println("# Control" + aaDatosAlumno1.getiCar());
        }    
         for (Alumno aaDatosAlumno1 : aaCopiaAlumno) { // Guardar los datos como la copia 
             System.out.println("Nombre copia " + aaDatosAlumno1.getsNomb());
            System.out.println("Matricula copia " + aaDatosAlumno1.getsMatri());
            System.out.println("# Control copia " + aaDatosAlumno1.getiCar());
        }
         //Imprimir direcciones 
         System.out.println(aaDatosAlumno);
         System.out.println(aaCopiaAlumno);
{
        
    }
       
    }


}
// Sistemas

class Alumno {

    private String sNomb;
    private String sMatri;
    private int iCar;

    public Alumno(String sNombre, String sMatricula, int iCarrera) {
        sNomb = sNombre;
        sMatri = sMatricula;
        iCar = iCarrera;

    }
// Se declaran los get y los set ya que al tener las variables privadas no puedes acceder a ellas sin un get y un set 
    public String getsNomb() {
        return sNomb;
    }

    public void setsNomb(String sNomb) {
        this.sNomb = sNomb;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }

}
