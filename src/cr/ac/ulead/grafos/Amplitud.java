package cr.ac.ulead.grafos;

import java.io.*;
import java.util.*;

public class Amplitud {

	private int V; 
	private LinkedList<Integer> adj[]; 

	Amplitud(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	
	void BFS(int s) {
		boolean visited[] = new boolean[V];

		LinkedList<Integer> queue = new LinkedList<Integer>();

		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");

			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String args[]) {
		Amplitud g = new Amplitud(7);

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

		System.out.println("Recorriendo longitudinalmente desde vertice 2)");

		g.BFS(0);
	}

}
