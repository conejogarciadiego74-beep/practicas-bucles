import java.util.Scanner;
public class Ejercicio8_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 8.
        // ============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la longitud del lado de tu cuadrado");
        int lado = entrada.nextInt();
        int fila;
        int columna;

        for (fila=0; fila < lado; fila ++)
        {// aqui leemos filas
            for (columna=0; columna < lado; columna ++)//mi idea ha sido hacer un bucle dentro de otro donde se lean las filas para que cuando el bucle acabe haya un salto de línea
            {//aquí leemos columnas
                if (columna == 0 || columna == (lado -1) || fila == 0 || fila == (lado - 1))
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();// aquí ocurre el salto de línea tras completarse, entonces el salto de línea ocurrirá tantas veces como larga sea la columna
        }


    }
}
