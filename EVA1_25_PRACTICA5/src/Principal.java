
import java.util.Scanner;

/*
 * @author 16550542
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int imes[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int idato[] = {1,2,3,4,5,6,7,8,9,10};
        double Clima[][] = new double[13][10];
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea buscar?");
        System.out.println("Ingrese el numero que contenga la opcion que desea");
        System.out.println("primero el mes, seguido el dato sobre temperatura");
        System.out.println("1:Enero  \n  2:Febrero  \n  3:Marzo   \n 4:Abril \n "
                         + "5:Mayo  \n  6:Junio  \n  7:Julio  \n  8:Agosto \n "
                         + "9:Septiembre  \n  10:Octubre  \n  11:Noviembre   \n 12:Diciembre "
                         + "\n 13:Por Año");
        System.out.println("1:Mas Alta   \n 2:Priomedio Alto    \n"
                         + "3:Promedio Diario  \n  4:Promedio Bajo \n "
                         + "5:Mas Baja  \n  6:Promedio de Precipitaciones (mm)    \n"
                         + "7:Promedio de Precipitaciones (dias) \n   8:Promedio de Nieve (dias) \n "
                         + "9:Promedio de Humedad  \n  10:Promedio de horas de sol");
        System.out.println("mes: ");
        x=sc.nextInt();
        System.out.println("dato: ");
        y=sc.nextInt();
        Clima [0][0]=30.0;
        Clima [0][1]=18.1;
        Clima [0][2]=10.1;
        Clima [0][3]=2.0;
        Clima [0][4]=-12.8;
        Clima [0][5]=9.9;
        Clima [0][6]=2.5;
        Clima [0][7]=0.30;
        Clima [0][8]=55;
        Clima [0][9]=185;
        Clima [1][0]=32.0;
        Clima [1][1]=21.2;
        Clima [1][2]=12.9;
        Clima [1][3]=4.5;
        Clima [1][4]=-18.0;
        Clima [1][5]=3.7;
        Clima [1][6]=1.6;
        Clima [1][7]=0.18;
        Clima [1][8]=49;
        Clima [1][9]=204;
        Clima [2][0]=34.0;
        Clima [2][1]=24.2;
        Clima [2][2]=15.7;
        Clima [2][3]=7.1;
        Clima [2][4]=-5.8;
        Clima [2][5]=7.7;
        Clima [2][6]=1.5;
        Clima [2][7]=0.09;
        Clima [2][8]=39;
        Clima [2][9]=254;
        Clima [3][0]=38.8;
        Clima [3][1]=27.9;
        Clima [3][2]=19.2;
        Clima [3][3]=10.4;
        Clima [3][4]=-3.4;
        Clima [3][5]=12.9;
        Clima [3][6]=2.5;
        Clima [3][7]=0.09;
        Clima [3][8]=37;
        Clima [3][9]=278;
        Clima [4][0]=39.6;
        Clima [4][1]=32.2;
        Clima [4][2]=23.6;
        Clima [4][3]=14.9;
        Clima [4][4]=3.8;
        Clima [4][5]=26.1;
        Clima [4][6]=4.0;
        Clima [4][7]=0.00;
        Clima [4][8]=37;
        Clima [4][9]=299;
        Clima [5][0]=41.4;
        Clima [5][1]=34.0;
        Clima [5][2]=26.3;
        Clima [5][3]=18.6;
        Clima [5][4]=6.1;
        Clima [5][5]=34.7;
        Clima [5][6]=6.7;
        Clima [5][7]=0.00;
        Clima [5][8]=42;
        Clima [5][9]=273;
        Clima [6][0]=41.6;
        Clima [6][1]=32.1;
        Clima [6][2]=25.6;
        Clima [6][3]=19.1;
        Clima [6][4]=10.6;
        Clima [6][5]=49.7;
        Clima [6][6]=11.4;
        Clima [6][7]=0.00;
        Clima [6][8]=53;
        Clima [6][9]=240;
        Clima [7][0]=39.2;
        Clima [7][1]=30.3;
        Clima [7][2]=24.3;
        Clima [7][3]=18.2;
        Clima [7][4]=10.0;
        Clima [7][5]=89.3;
        Clima [7][6]=12.0;
        Clima [7][7]=0.00;
        Clima [7][8]=61;
        Clima [7][9]=242;
        Clima [8][0]=39.0;
        Clima [8][1]=29.2;
        Clima [8][2]=22.6;
        Clima [8][3]=16.0;
        Clima [8][4]=3.7;
        Clima [8][5]=66.4;
        Clima [8][6]=8.0;
        Clima [8][7]=0.00;
        Clima [8][8]=61;
        Clima [8][9]=229;
        Clima [9][0]=35.0;
        Clima [9][1]=26.8;
        Clima [9][2]=18.7;
        Clima [9][3]=10.7;
        Clima [9][4]=-2.4;
        Clima [9][5]=21.6;
        Clima [9][6]=4.0;
        Clima [9][7]=0.00;
        Clima [9][8]=56;
        Clima [9][9]=238;
        Clima [10][0]=34.6;
        Clima [10][1]=21.9;
        Clima [10][2]=13.7;
        Clima [10][3]=5.5;
        Clima [10][4]=-6.1;
        Clima [10][5]=8.7;
        Clima [10][6]=2.0;
        Clima [10][7]=0.50;
        Clima [10][8]=55;
        Clima [10][9]=191;
        Clima [11][0]=29.0;
        Clima [11][1]=18.2;
        Clima [11][2]=10.3;
        Clima [11][3]=2.4;
        Clima [11][4]=-11.5;
        Clima [11][5]=9.9;
        Clima [11][6]=2.3;
        Clima [11][7]=0.88;
        Clima [11][8]=57;
        Clima [11][9]=174;
        Clima [12][0]=41.6;
        Clima [12][1]=26.3;
        Clima [12][2]=18.6;
        Clima [12][3]=10.8;
        Clima [12][4]=-18.0;
        Clima [12][5]=385.7;
        Clima [12][6]=58.4;
        Clima [12][7]=2.04;
        Clima [12][8]=50;
        Clima [12][9]=2807;
        System.out.println("Resultado: " + Clima[(x-1)][(y-1)]);
    }
    
}
