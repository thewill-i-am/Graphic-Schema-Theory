package cr.ac.ulead.grafos.Ejecutables;

import cr.ac.ulead.grafos.Amplitud.Amplitud;

public class AmplitudMain {
    public static void main(String args[]) {

        int[][] matrixAmplitud = {
                {0, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 1},
                {0, 0, 0, 1, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 0}
        };

        Amplitud amplitud = new Amplitud(matrixAmplitud);
        amplitud.BSF( 2);
        System.out.println("El recorrido del BSF queda según el punto seleccionado:");
        for (int i = 0; i < matrixAmplitud.length; i++)
            System.out.print(amplitud.imprimir().get(i)+ " ");
    }
}
