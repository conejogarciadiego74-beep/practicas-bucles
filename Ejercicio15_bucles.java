import java.util.Scanner;
public class Ejercicio15_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 15.
        // ============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número positivo y lo descompondré en factores primos");

        int num = entrada.nextInt();
        int div = 2;
        if (0 > num)
        {
            System.out.println("Introduce un valor positivo");
        }else
        {
             while (num > 1)
             {
                 if (num % div == 0)
                 {
                     System.out.println(div);
                     num = num / div ;
                 }else
                 {
                     div++;
                 }
             }

        }

    }
}
