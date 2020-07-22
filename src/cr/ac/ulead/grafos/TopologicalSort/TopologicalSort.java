package cr.ac.ulead.grafos.TopologicalSort;
import java.util.*;

public class TopologicalSort
{
	private int V;
	int [][] matrix;

	public TopologicalSort(int v)
	{
		V = v;
	}

	public void addEdge(int[][] matrix) {
		this.matrix = matrix;
	}

	void topologicalSortUtil(
			int v, boolean visited[],
			Stack<Integer> stack)
	{
		visited[v] = true;
			for (int j = 0; j < this.matrix[v].length ; j++) {
				if (!visited[j])
					if (this.matrix[j][v] == 1)
						topologicalSortUtil(j, visited, stack);
		}
		stack.push(new Integer(v));
	}

	public ArrayList<String> topologicalSort()
	{
		ArrayList<String> lista = new ArrayList<>();
		Stack<Integer> stack = new Stack<Integer>();

		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;
		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				topologicalSortUtil(i, visited, stack);

		while (stack.empty()==false)
			lista.add(stack.pop() + " ");

		return lista;
	}
}
