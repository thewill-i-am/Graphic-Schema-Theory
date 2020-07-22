package cr.ac.ulead.grafos.Profundidad;

import java.util.*;

public class Profundidad {

	private ArrayList<Integer> path;
	private int[][] matrix;

	public Profundidad(int[][] matriz) {
		this.matrix = matriz;
		this.path = new ArrayList<>();
	}

	void DFSUtil(int v, boolean[] visited) {
		if (!visited[v]) {
			visited[v] = true;
			path.add(v);
			for (int j = 0; j < this.matrix.length; j++) {
				if (this.matrix[v][j] == 1) {
					if (!visited[j])
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

	public ArrayList imprimir() {
		return this.path;
	}
}
