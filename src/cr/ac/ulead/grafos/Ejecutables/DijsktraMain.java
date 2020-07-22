package cr.ac.ulead.grafos.Ejecutables;

import cr.ac.ulead.grafos.dijkstra.DijkstrasAlgorithm;
import java.util.ArrayList;

public class DijsktraMain {
    public static void main(String[] args)
    {
        /* Hola, profe. De este me referencie mucho en Intenet, para serle sincero intente
        * con el que nos mando pero no pude, entonces mejor me base en uno de internet, espero
        * que no exista problema. Los demas si son segun su codigo */

        DijkstrasAlgorithm dijkstrasAlgorithm = new DijkstrasAlgorithm();
        int matriz[][] = {
                {0, 10, 15, 0, 0, 0},
                {0, 0, 0, 12, 0, 15},
                {0, 0, 0, 0, 10, 0},
                {0, 0, 0, 0, 2, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 5, 0}
        };

        ArrayList<String> list = dijkstrasAlgorithm.dijkstra(matriz, 0);
        for (String s : list) {
            System.out.print(s);
        }
    }
}
