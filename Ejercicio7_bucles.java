import java.util.Scanner;
public class Ejercicio7_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 7.
        // ============

        Scanner entrada = new Scanner(System.in);

        int cuenta = 0;

        while (cuenta <= 100) {
            cuenta++;
            if (0 == cuenta % 5 && 0 == cuenta % 3)
            {
                System.out.println(cuenta +" fizzbuzz");
            } else
            {
                if (cuenta % 3 == 0)
                {
                    System.out.println(cuenta +" fizz");
                } else
                {
                    if (cuenta % 5 == 0)
                    {
                        System.out.println(cuenta +" buzz");
                    }


                }
            }
        }
    }
}
