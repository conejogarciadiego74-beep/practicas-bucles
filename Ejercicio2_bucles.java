import java.util.Scanner;
public class Ejercicio2_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 2.
        // ============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número hasta el que quieres que te muestre");
        int numero_fin = entrada.nextInt();
        int contador = 0;

        while (contador <= numero_fin)
        {
            System.out.println(contador);
            contador++;
        }

    }
}
