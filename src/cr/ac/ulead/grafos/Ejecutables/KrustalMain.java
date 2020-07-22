package cr.ac.ulead.grafos.Ejecutables;

import cr.ac.ulead.grafos.Kruskal.Kruskal;

public class KrustalMain {
    private static  int[][] matrix = {
            {0, 10, 6, 5, 0},
            {0, 0, 0, 15, 0},
            {0, 0, 0, 4, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };
    public static void main(String[] args) {
        Kruskal graph = new Kruskal(calculoVertices(), matrix.length);
        graph.addEdge(matrix);
        for (int i = 0; i < graph.KruskalMST().size(); i++) {
            System.out.println(graph.KruskalMST().get(i));
        }
    }

    public static int calculoVertices() {
        int contador = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0)
                    contador++;
            }
        }
        return contador-1;
    }
}
