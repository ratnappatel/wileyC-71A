package com.wiley.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WEdge
{
	int src , dest ,weight;
	public WEdge(int src , int dest , int weight) {
		this.src=src;
		this.dest=dest;
		this.weight=weight;
	}
	
	
}
class Node
{
	int data, weight;
	public Node(int data, int weight) {
		this.data=data;
		this.weight=weight;
	}
	@Override
	public String toString() {
		return data + "( " + weight+" )" ;
	}
	
}



public class WeightedGraph {

	int vertices=0;
	List<List<Node>> adj=new ArrayList<>();
	public WeightedGraph(List<WEdge> edges) 
	{
		int n=0;
		
		for(WEdge e:edges)
			n=Integer.max(n,Integer.max(e.src,e.dest));
		
		vertices=n;
		
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<>());
		
		for(WEdge e:edges)
		{
			// directed edge
			adj.get(e.src).add(new Node(e.dest,e.weight));
			
			// undirected edge
			adj.get(e.dest).add(new Node(e.src,e.weight));
		}
	}
	
	public int getV()
	{
		return vertices;
	}
	public void printGraph(WeightedGraph graph)
	{
		int src=0;
		int n=graph.adj.size();
		
		while(src<n)
		{
			for(Node edge:graph.adj.get(src))
				System.out.print(src+" --- "+edge+"\t");
			System.out.println("");
			src++;
		}
		
	}
	
	public static void main(String[] args) {
		
		List<WEdge> edges=Arrays.asList(
							new WEdge(0 , 1 , 6), new WEdge(1 , 2 , 7),
							new WEdge(3, 2 , 10) , new WEdge(4 , 5 , 1 ),
							new WEdge(5 , 4 , 3), new WEdge(2,1,4), new WEdge(2 , 0 ,5)
				);
		
		WeightedGraph graph=new WeightedGraph(edges);
		graph.printGraph(graph);
	}

}
