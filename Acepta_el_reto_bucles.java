import java.util.Scanner;
public class Acepta_el_reto_bucles {

    public static void main(String[] args) {

        // ===============
        // Ejercicio reto.
        // ===============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Pulsa cualquier numero para iniciar y -1 para terminar");



        double dias[] = {0, 1, 2, 3, 4, 5};

        for (int i = 0; i < 6; i++)
        {
            dias[i] = entrada.nextDouble();
        }
        double max = dias[0];
        double min = dias[0];
        double suma = 0;
        for (int i = 0; i < 6; i++) {
            if (dias[i] > max) max = dias[i];
            if (dias[i] < min) min = dias[i];
            suma += dias[i];
        }

        int cuentaMax = 0, cuentaMin = 0;
        int posMax = 0, posMin = 0;
        for (int i = 0; i < 6; i++)
        {
            if (dias[i] == max)
            {
                cuentaMax++; posMax = i;
            }
            if (dias[i] == min)
            {
                cuentaMin++; posMin = i;
            }
        }


    }
}


















