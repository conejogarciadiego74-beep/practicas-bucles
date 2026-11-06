import java.util.Scanner;
import java.util.Random;
public class Ejercicio13_bucles {

    public static void main(String[] args) {

        // ============
        // Ejercicio 13.
        // ============

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int piedra = 0;
        int papel = 1;
        int tijera = 2;
        int rondas = 0;
        int victorias_humano = 0;
        int victorias_maquina = 0;

        while (rondas < 3) {
            System.out.println("3 rondas elige (R,P,S)");

            int maquina = aleatorio.nextInt(3);

            int persona = 0;

            char rps = entrada.next().charAt(0);

            char rps_mio = Character.toUpperCase(rps);// esto de aqui sirve para transformar la entrada a mayúsculas

            if (rps_mio == 'R')
            {
                persona = 0;
            } else if (rps_mio == 'P')// estos condicionales son para transformar las letras a número (probablemente existe una forma más eficiente pero pfff)
            {
                persona = 1;
            } else if (rps_mio == 'S')
            {
                persona = 2;
            }

            if (maquina == persona)//empate
            {
                rondas++;
                System.out.println("Empate");
            }else if ((maquina == 0 && persona == 2) || (maquina == 1 && persona == 0) || (maquina == 2 && persona == 1)) //máquina
            {
              victorias_maquina++;
              rondas++;
              System.out.println("Gana la máquina");

            }else if ((maquina == 1 && persona == 2) || (maquina == 2 && persona == 0) || (maquina == 0 && persona == 1 )) //humano sé que podría poner else es para luego estudiar
            {
                victorias_humano++;
                rondas++;
                System.out.println("Ganas tú");

            }
        }
        int empates = rondas - (victorias_humano + victorias_maquina);// saco los empates restando a las rondas totales las victorias de ambos, si hay uno en lo que nadie ha ganado no se restará
        System.out.println("La máquina ha ganado: " + victorias_maquina + " Tú has ganado: " + victorias_humano);
        System.out.println("Habeís empatado: " + empates);



    }
}
