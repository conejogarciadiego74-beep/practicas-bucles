import java.util.Scanner;
public class Ejercicio12_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 12.
        // ============

        Scanner entrada = new Scanner(System.in);
        int maximo = 100;
        int minimo = 1;
        boolean acertado = false;


        System.out.println("Piensa en un número entre el 1 y el 100");

        while (acertado == false && minimo <= maximo)
        {
            int adivinar = (minimo + maximo)/2;

            System.out.println(adivinar + " Es mayor (+), menor (-) o igual (=)?");
            String respuesta = entrada.nextLine();

            if (respuesta.equals("="))
            {
                acertado = true;
            } else if (respuesta.equals("+"))
            {
                minimo = adivinar + 1;
            }else if (respuesta.equals("-"))
            {
                maximo = adivinar - 1;
            }else
            {
                System.out.println("Te has equivocado");
            }

        }
        System.out.println("Fin");







    }
}
