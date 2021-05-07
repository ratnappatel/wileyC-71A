package com.wiley.graphs.shortestPath.nWeight;
import java.util.Arrays;
import java.util.List;

// A class to store a graph edge
class Edge
{
	int source, dest, weight;

	public Edge(int source, int dest, int weight)
	{
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}
}

public class BellmanFordDemo
{
	// Recursive function to print the path of a given vertex from source vertex
	static void printPath(int parent[], int vertex)
	{
		if (vertex < 0) {
			return;
		}

		printPath(parent, parent[vertex]);
		System.out.print(vertex + " ");
	}

	// Function to run the Bellman–Ford algorithm from a given source
	public static void bellmanFord(List<Edge> edges, int source, int N)
	{
		// `distance[]` and `parent[]` stores the shortest path
		// (least cost/path) information
		
		int distance[] = new int[N];
		int parent[] = new int[N];

		// initialize `distance[]` and `parent[]`. Initially, all vertices
		// except source vertex weight INFINITY and no parent
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[source] = 0; // STARTING VERTEX

		Arrays.fill(parent, -1);

		// relaxation step (run `V-1` times)
		for (int i = 0; i < N - 1; i++)
		{
			for (Edge edge: edges)
			{
				// edge from `u` to `v` having weight `w`
				int u = edge.source;
				int v = edge.dest;
				int w = edge.weight;

				// if the distance to destination `v` can be
				// shortened by taking edge `u —> v`
				if (distance[u] + w < distance[v])
				{
					// update distance to the new lower value
					distance[v] = distance[u] + w;

					// set v's parent as `u`
					parent[v] = u;
				}
			}
		}

		// run relaxation step once more for N'th time to
		// check for negative-weight cycles
		
		for (Edge edge: edges)
		{
			// edge from `u` to `v` having weight `w`
			int u = edge.source;
			int v = edge.dest;
			int w = edge.weight;

			// if the distance to destination `u` can be
			// shortened by taking edge `u —> v`
			if (distance[u] + w < distance[v])
			{
				System.out.println("Negative-weight cycle is found!!");
				return;
			}
		}

		for (int i = 0; i < N; i++)
		{
			System.out.print("The distance of vertex " + i + " from the " +
					"source is " + distance[i] + ". Its path is [ ");

			printPath(parent, i);
			System.out.println("]");
		}
	}

	public static void main(String[] args)
	{
		// List of graph edges as per the above diagram
		List<Edge> edges = Arrays.asList(
				// `(x, y, w)` --> edge from `x` to `y` having weight `w`
				new Edge( 0, 1, -1 ), new Edge( 0, 2, 4 ),
				new Edge( 1, 2, 3 ), new Edge( 1, 3, 2 ),
				new Edge( 1, 4, 2 ), new Edge( 3, 2, 5 ),
				new Edge( 3, 1, 1 ), new Edge( 4, 3, -3 )
		);

		// set the maximum number of nodes in the graph
		final int N = 5;

		// let source be vertex 0
		int source = 0;

		// run the Bellman--Ford algorithm from a given source
		bellmanFord(edges, source, N);
	}
}