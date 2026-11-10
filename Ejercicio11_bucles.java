import java.util.Scanner;
public class Ejercicio11_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 11.
        // ============

        Scanner entrada = new Scanner(System.in);
        //la definición de un número primo es un número que sólo sea divisible entre si mismo y la unidad

        System.out.println("Introduce un número y determinaré si es primo");
        int num = entrada.nextInt();
        String primo = "blabla";

        if (num < 2)
        {
            System.out.println("Número no válido");

        }else
        {
            int contador = 2;
            while (contador < num && 0 == num % contador)
            {
                contador++;

            }

            if (contador < num)
            {
                primo = "No es primo";

            }else
            {
                primo = " Es primo";
            }
           System.out.println(primo);


        }


    }
}