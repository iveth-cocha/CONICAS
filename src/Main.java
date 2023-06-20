//llamara a las conicas dentro del package
import conicas_eq2.*;
//libreria para entrada de datos, en este caso para la opcion del menu
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //creacion de instancias para cada conica existente
        Elipse ob1=new Elipse(5.5,3);
        Circunferencia ob2=new Circunferencia(8,45);
        Hiperbole ob3=new Hiperbole(8,3);
        Parabola ob4=new Parabola(5,3,2,4,1);
        //lamar la libreria de entrada
        Scanner entrada = new Scanner(System.in);

        //creacion del menu para mostrar cada una de las conicas
        int opc;
        do{
            System.out.println("\t------ MENU DE CONICAS------");
            System.out.println("1) Elipse");
            System.out.println("2) Parabola");
            System.out.println("3) Hiperbole");
            System.out.println("4) Circunferencia");
            System.out.println("5) Salir");

            System.out.println("Ingrese una opción: ");
            opc=entrada.nextInt();

            switch (opc){
                case 1:
                    System.out.println("\n\t * * Elipse * *");
                    System.out.println("> Area elipse: "+ob1.area_elipse());
                    System.out.println("> Perimetro elipse: "+ob1.perimetro_elipse());
                    break;
                case 2:
                    System.out.println("\n\t * * Parabola * *");
                    System.out.println("> Coordenadas del vertice en el eje x: " +ob4.Parabola_VerticeX(2,4));
                    System.out.println("> Coordenadas del vertice en el eje y: " +ob4.Parabola_VerticeY(2,4,1));
                    System.out.println(ob4.Parabola_ImpVer());
                    break;
                case 3:
                    System.out.println("\n\t * * Hiperbole * *");
                    System.out.println(ob3.variables());

                    break;
                case 4:
                    System.out.println("\n\t * * Circunferencia * *");
                    System.out.println("> Area circunferencia: "+ob2.area_cir());
                    System.out.println("> Périmetro circunferencia: "+ob2.perimetro_cir());
                    System.out.println("> Ángulo inscrito:"+ob2.angulo_inscrito_cir());
                    break;
            }
        }while(opc !=5);

    }
}