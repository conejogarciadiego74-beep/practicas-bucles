import java.util.Scanner;
public class Ejercicio9_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 9.
        // ============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce como de alta quieres tu pirámide");
        int alt_piramide = entrada.nextInt();
        int fila;
        int colu;

        if (alt_piramide < 1)//este condicional sirve pa que solo se introduzcan valores mayores q 1
        {
            System.out.println("Introduce un  número válido");

        }else
        {
            for (colu = 1; colu <= alt_piramide; colu++ ) // este bucle es el que se encarga de la altura de la pirámide, empieza siempre en 1 y sólo se completa cuando el siguiente bucle imprime todos sus asteriscos
            {
                for (fila = 1; fila <= 2 * colu - 1; fila++ )// la condicion del bucle es que sólo imprima mientras el número sea menor o igual a 2xcolumna-1 porq así es el incremento  de la pirámide del enunciado
                {
                    System.out.print("*");
                }
                System.out.println();
            }

        }

    }
}

