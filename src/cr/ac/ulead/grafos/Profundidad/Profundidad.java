package cr.ac.ulead.grafos.Profundidad;

import java.util.*;

public class Profundidad {

	private int[] recorrido;
	private int contador;
	private int[][] matrix;

	public Profundidad(int[][] matriz) {
		this.matrix = matriz;
		this.recorrido = new int[matriz.length];
		this.contador = 0;
	}

	void DFSUtil(int v, boolean[] visited) {
		if (!visited[v]) {
			visited[v] = true;
			this.recorrido[contador++] = v;
			for (int j = 0; j < this.matrix[v].length; j++) {
				if (this.matrix[v][j] == 1 && !visited[j]) {
					DFSUtil(j, visited);
				}
			}
		}
	}

	public void DFS(int v) {
		boolean[] visited = new boolean[this.matrix.length];
		for (int i = 0; i < this.matrix.length; i++) {
			if (!visited[v]) {
				DFSUtil(v, visited);
			}
		}
	}

	public ArrayList getRecorrido() {
		ArrayList lista = new ArrayList();
		for (int j = 0; j < this.matrix.length;  j++) {
			lista.add(this.recorrido[j] + "");
		}
		return lista;
	}
}
