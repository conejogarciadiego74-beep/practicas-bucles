import java.util.Scanner;
public class Ejercicio4_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 4.
        // ============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número para que calcule su factorial");
        int num_recibido = entrada.nextInt();
        int resul = 1;// creo esta variable que será independiente a la variable num_recibido, y va a tomar su valor tras cada cálculo

        if (num_recibido < 0 )
        {
            System.out.println("No pongas números negativos");

        }else
        {
            while (num_recibido >= 1)//esto es para que pare cuando el contador llegue a 1 o por si nos meten 1
            {
                resul *= num_recibido; //resul va a ser en un principio = num_recibido pero con cada vuelta será el resultado de num_recibido con num recibido -1
                num_recibido--;
            }
        }
        System.out.println(resul);





    }
}
