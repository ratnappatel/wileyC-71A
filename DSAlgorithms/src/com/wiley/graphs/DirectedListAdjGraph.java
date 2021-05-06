package com.wiley.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// considering vertices as int value 

class Edge
{
	int src, dest;
	public Edge(int src,int dest) {
		this.src=src;
		this.dest=dest;
	}
}

// directed graph : edge defining direction [source -- > destination ]
public class DirectedListAdjGraph {
	
	//Adjency list
	List<List<Integer>> adj=new ArrayList<>();
	
	// find the maximum no of vertex required to represent given edges
	public DirectedListAdjGraph(List<Edge> edges) {
		int n=0;
		for(Edge e:edges)
		{
			n=Integer.max(n,Integer.max(e.src,e.dest));
		}
		
		// generate vertices
		for(int i=0;i<=n;i++)
			adj.add(i,new ArrayList<>());
		
		for(Edge curr:edges)
		{
			// allocating new node in adj list from src to dest
			adj.get(curr.src).add(curr.dest);
			
			// if graph is undirected 
			//adj.get(crr.det).add(curr.src);
		}
		
	}
	
	public static void printGrpah(DirectedListAdjGraph graph)
	{
		int src=0;
		int n=graph.adj.size();
		
		while(src<n)
		{
			for(int dest: graph.adj.get(src))
			{
				System.out.print("( "+src+" --> "+dest+" ) \t");
			}
			System.out.println("");
			src++;
		}
	}
	
	public static void main(String[] args) {
		List<Edge> edges=Arrays.asList(new Edge(0,1),
									  new Edge(0,4),
									  new Edge(2,3),
									  new Edge(1,2),
									  new Edge(3,1),
									  new Edge(4,2),
									  new Edge(2,0)
							);
		DirectedListAdjGraph graph=new DirectedListAdjGraph(edges);
		DirectedListAdjGraph.printGrpah(graph);

	}

}

/*
 *  1 --> [1--> 2 ] , [ 1 <-- 4],[],[]
 */
