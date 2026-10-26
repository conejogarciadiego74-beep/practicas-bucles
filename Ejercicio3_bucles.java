import java.util.Scanner;
public class Ejercicio3_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 3.
        // ============

        Scanner entrada = new Scanner(System.in);

        int contador = 0;

        while (contador <= 200)
        {

            contador++;
            if (contador % 2 != 0)//lo que me define si un numero es par esq su resto en una división entre 2 sea 0
            {//no hacer nada
            } else
            {
                System.out.println(contador);
            }
        }

    }
}
