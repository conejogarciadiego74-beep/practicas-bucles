import java.util.Scanner;
public class Ejercicio10_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 10.
        // ============

        long num1 = 0;
        long num2 = 1;
        int cont;

        for (cont = 1; cont <= 50; cont ++ )//esto lo que me va a hacer es que solamente me de los primeros 50 números
        {
             num1 += num2;
             System.out.println(num1);
             num2 += num1;
             System.out.println(num2);
             cont++;
        }




    }
}
