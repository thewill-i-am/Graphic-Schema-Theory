package cr.ac.ulead.grafos;

import java.io.*;
import java.util.*;

public class Profundidad {

	private int V;

	private LinkedList<Integer> adj[];

	Profundidad(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(v + " ");

		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	void DFS(int v) {
		boolean visited[] = new boolean[V];

		DFSUtil(v, visited);
	}

	public static void main(String args[]) {
		Profundidad g = new Profundidad(7);

		g.addEdge(0, 1);
		g.addEdge(1, 0);
		g.addEdge(0, 3);
		g.addEdge(3, 0);
		g.addEdge(1, 3);
		g.addEdge(3, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 1);
		g.addEdge(1, 4);
		g.addEdge(4, 1);
		g.addEdge(2, 4);
		g.addEdge(4, 2);
		g.addEdge(3, 4);
		g.addEdge(4, 3);
		g.addEdge(3, 5);
		g.addEdge(5, 3);
		g.addEdge(5, 4);
		g.addEdge(4, 5);
		g.addEdge(5, 6);
		g.addEdge(6, 5);
		g.addEdge(4, 6);
		g.addEdge(6, 4);

		System.out.println("Recorriendo en profunidad desde el vertice 2");

		g.DFS(0);
	}

}
