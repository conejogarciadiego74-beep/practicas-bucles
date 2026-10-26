import java.util.Scanner;
public class Ejercicio4_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 4.
        // ============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número para que calcule si factorial");
        int num_recibido = entrada.nextInt();
        int num_fact = 0;
        while (num_recibido > 0)
        {
            num_fact = num_recibido*num_recibido--;
        }
        System.out.println(num_fact);
    }
}
