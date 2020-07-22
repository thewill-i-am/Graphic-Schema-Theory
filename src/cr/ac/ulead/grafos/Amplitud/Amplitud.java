package cr.ac.ulead.grafos.Amplitud;

import java.util.*;

public class Amplitud {

	private int [] recorrido;
	private int contador;
	private int[][] matrix;

	public Amplitud (int [][]matriz){
		this.matrix = matriz;
		this.recorrido = new int[matriz.length];
		this.contador = 0;
	}

	public void BSF(int s) {
		boolean[] visited = new boolean[this.matrix.length];
		visited[s] = true;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		while (queue.size() != 0) {
			this.recorrido[this.contador++] = queue.peek();
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
		ArrayList lista = new ArrayList();
		for (int j = 0; j < this.matrix.length;  j++) {
			lista.add(this.recorrido[j] + "");
		}
		return lista;
	}
}