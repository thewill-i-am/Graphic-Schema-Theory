package cr.ac.ulead.grafos.Amplitud;

import java.util.*;

public class Amplitud {

	private ArrayList<Integer> recorrido;
	private int[][] matrix;

	public Amplitud (int [][]matriz){
		this.recorrido =  new ArrayList<Integer>();
		this.matrix = matriz;
	}

	public void BSF(int s) {
		boolean[] visited = new boolean[this.matrix.length];
		visited[s] = true;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		while (queue.size() != 0) {
			recorrido.add(queue.peek());
			int j = queue.poll();
			for (int i = 0; i < this.matrix.length; i++) {
				if (this.matrix[j][i] == 1 ) {
					if ( visited[i] == false){
						queue.add(i);
						visited[i] = true;
					}
				}
			}
		}
	}

	public ArrayList imprimir() {
		return recorrido;
	}
}