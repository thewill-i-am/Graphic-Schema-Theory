package cr.ac.ulead.grafos.dijkstra;

import java.util.ArrayList;

public class DijkstrasAlgorithm {

	private static final int NO_PARENT = -1;
	private static final ArrayList<String> lista = new ArrayList<String>();
	public static ArrayList<String> dijkstra(int[][] adjacencyMatrix,
											 int startVertex)
	{
		int nVertices = adjacencyMatrix[0].length;
		int[] shortestDistances = new int[nVertices];
		boolean[] added = new boolean[nVertices];

		for (int vertexIndex = 0; vertexIndex < nVertices;
			 vertexIndex++)
		{
			shortestDistances[vertexIndex] = Integer.MAX_VALUE;
			added[vertexIndex] = false;
		}

		shortestDistances[startVertex] = 0;
		int[] parents = new int[nVertices];
		parents[startVertex] = NO_PARENT;
		for (int i = 1; i < nVertices; i++)
		{
			int nearestVertex = -1;
			int shortestDistance = Integer.MAX_VALUE;
			for (int vertexIndex = 0;
				 vertexIndex < nVertices;
				 vertexIndex++)
			{
				if (!added[vertexIndex] &&
						shortestDistances[vertexIndex] <
								shortestDistance)
				{
					nearestVertex = vertexIndex;
					shortestDistance = shortestDistances[vertexIndex];
				}
			}

			added[nearestVertex] = true;
			for (int vertexIndex = 0;
				 vertexIndex < nVertices;
				 vertexIndex++)
			{
				int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];

				if (edgeDistance > 0
						&& ((shortestDistance + edgeDistance) <
						shortestDistances[vertexIndex]))
				{
					parents[vertexIndex] = nearestVertex;
					shortestDistances[vertexIndex] = shortestDistance +
							edgeDistance;
				}
			}
		}

		printSolution(startVertex, shortestDistances, parents);
		return lista;
	}


	public static void printSolution(int startVertex,
									  int[] distances,
									  int[] parents)
	{
		String[] abcdario = {"A","B","C","D","E","F"};
		int nVertices = distances.length;
		System.out.print("Vertice\t Distancia\tCamino");

		for (int vertexIndex = 0;
			 vertexIndex < nVertices;
			 vertexIndex++)
		{
			if (vertexIndex != startVertex)
			{
				lista.add("\n" + abcdario[startVertex] + " => ");
				lista.add(abcdario[vertexIndex] + " \t\t ");
				lista.add(distances[vertexIndex] + "\t\t");
				printPath(vertexIndex, parents);
			}
		}
	}

	public static void printPath(int currentVertex,
								  int[] parents)
	{
		String[] abcdario = {"A","B","C","D","E","F"};
		if (currentVertex == NO_PARENT)
		{
			return;
		}
		printPath(parents[currentVertex], parents);
		lista.add(abcdario[currentVertex] + " ");
	}
}

