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
        {
            // aqui leemos filas
            for (columna=0; columna < lado; columna ++)
            {//aquí leemos columnas
                if (fila == 0 || fila == lado - 1 || columna == 0 || columna == lado -1 )
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
        }


    }
}
