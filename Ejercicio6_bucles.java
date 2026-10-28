import java.util.Scanner;
public class Ejercicio6_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 6.
        // ============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce números");
        int num = entrada.nextInt();

        int negativos = 0;
        int positivos = 0;

        while (num != 0)
        {
            num = entrada.nextInt();

            if (num < 0)
            {
                negativos++;
            }
            else
            {
                positivos++;
            }

        }

        if (positivos >= 1 || negativos >= 1)
        {
            System.out.println("Positivos: " + positivos + " y negativos: " + negativos);
        }
        else
        {
            System.out.println("No hay ni positivos ni negativos, lo has hecho a la primera");// por si nos meten un 0 de primeras
        }
    }
}
