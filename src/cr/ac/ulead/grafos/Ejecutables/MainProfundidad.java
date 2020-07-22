package cr.ac.ulead.grafos.Ejecutables;
import cr.ac.ulead.grafos.Profundidad.Profundidad;

public class MainProfundidad {

    public static void main(String args[]) {

        int[][] matrixAdyacencia = {
                {0, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 1},
                {0, 0, 0, 1, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 0}
        };
        Profundidad profundidad = new Profundidad(matrixAdyacencia);
        profundidad.DFS(6);
        System.out.println("Profundidad es ");
        for (int i = 0; i < profundidad.getRecorrido().size(); i++) {
            System.out.print(profundidad.getRecorrido().get(i)+ " ");
        }
    }
}