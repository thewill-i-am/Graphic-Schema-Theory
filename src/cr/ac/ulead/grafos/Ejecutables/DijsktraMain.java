package cr.ac.ulead.grafos.Ejecutables;

import cr.ac.ulead.grafos.dijkstra.DijkstrasAlgorithm;

import java.util.ArrayList;

public class DijsktraMain {
    public static void main(String[] args)
    {
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
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i));
        }
    }
}
