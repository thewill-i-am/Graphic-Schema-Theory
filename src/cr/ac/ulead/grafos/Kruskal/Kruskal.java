package cr.ac.ulead.grafos.Kruskal;

import java.util.*;
import java.lang.*;

public class Kruskal {

	class Edge implements Comparable<Edge> {
		int src, dest, weight;
		Edge(int src, int dest, int weight){
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}

		public Edge() {

		}

		public int compareTo(Edge compareEdge) {
			return this.weight - compareEdge.weight;
		}
	};

	class subset {
		int parent, rank;
	};

	int V, E;
	Edge edge[];

	public Kruskal(int v, int e) {
		V = v;
		E = e;
		edge = new Edge[E];
	}

	public void addEdge(int[][] matrix) {
		int contadorMatrix = 0;
		edge = new Edge[E];
		for (int i = 0; i < matrix.length ;i++)
			for (int j = 0; j < matrix.length  ;j++)
				if (matrix[i][j] > 0){
					edge[contadorMatrix] = new Edge(i,j,matrix[i][j]);
					contadorMatrix++;
				}
	}


	int find(subset subsets[], int i) {
		if (subsets[i].parent != i)
			subsets[i].parent = find(subsets, subsets[i].parent);

		return subsets[i].parent;
	}

	void Union(subset subsets[], int x, int y) {
		int xroot = find(subsets, x);
		int yroot = find(subsets, y);

		if (subsets[xroot].rank < subsets[yroot].rank)
			subsets[xroot].parent = yroot;
		else if (subsets[xroot].rank > subsets[yroot].rank)
			subsets[yroot].parent = xroot;
		else {
			subsets[yroot].parent = xroot;
			subsets[xroot].rank++;
		}
	}

	public ArrayList<String> KruskalMST() {
		ArrayList<String> lista = new ArrayList<>();
		Edge result[] = new Edge[V];
		int e = 0;
		int i = 0;
		for (i = 0; i < V; ++i)
			result[i] = new Edge();

		Arrays.sort(edge);

		subset subsets[] = new subset[V];
		for (i = 0; i < V; ++i)
			subsets[i] = new subset();

		for (int v = 0; v < V; ++v) {
			subsets[v].parent = v;
			subsets[v].rank = 0;
		}

		i = 0;

		while (e < V - 1) {
			Edge next_edge = new Edge();
			next_edge = edge[i++];

			int x = find(subsets, next_edge.src);
			int y = find(subsets, next_edge.dest);

			if (x != y) {
				result[e++] = next_edge;
				Union(subsets, x, y);
			}
		}

		lista.add("MST: ");
		for (i = 0; i < e; ++i)
			lista.add(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);

		return lista;
	}
}
