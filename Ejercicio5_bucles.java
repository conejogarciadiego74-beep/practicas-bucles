import java.util.Scanner;
public class Ejercicio5_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 5.
        // ============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la base: ");
        int base = entrada.nextInt();
        System.out.println("Introduce el exponente ");
        int exp = entrada.nextInt();
        int cont = 1;
        int resul = 1;// el mismo principio que he aplicado en el ejercicio anteriot

        while (cont <= exp) // se va a repetir el número de veces del exponente la multiplicación
        {
            resul *= base ;
            cont++;
        }
        System.out.println(resul);
    }
}
