package cr.ac.ulead.grafos.Ejecutables;

import cr.ac.ulead.grafos.TopologicalSort.TopologicalSort;

public class TopologicalMain {
    public static void main(String[] args) {
        int [][] matrix = {
                {0,0,0,0,1,1},
                {0,0,0,1,1,0},
                {0,0,0,0,1,0},
                {0,0,1,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        TopologicalSort g = new TopologicalSort(matrix.length);
        g.addEdge(matrix);
        System.out.println("El topological sort es : ");
        for (int i = 0; i < g.topologicalSort().size(); i++) {
            System.out.print(g.topologicalSort().get(i));
        }
    }
}
