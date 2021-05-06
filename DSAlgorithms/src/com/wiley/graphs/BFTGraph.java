package com.wiley.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFTGraph {

	int vertices;
	LinkedList<Integer> adj[];
	
	public BFTGraph(int v)
	{
		vertices=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;++i)
			adj[i]=new LinkedList();
		
	}
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	// java 8 stream api flat map operation
	void bft_helper(int v)
	{
		boolean visited[]=new boolean[vertices];
		
		LinkedList<Integer> queue=new LinkedList<Integer>();
		
		
		visited[v]=true;
		queue.add(v);
		//System.out.print(v+" --> "+adj[v]+"\n");
		
		while(queue.size()>0)
		{
			v=queue.poll();
			System.out.println(v+" "+adj[v]);
			
			Iterator<Integer> itr=adj[v].listIterator();
			while(itr.hasNext())
			{
				int n=itr.next();
				if(!visited[n])
				{
					visited[n]=true;
					queue.add(n);
				}
			}
			
		}
	}
	
	
	
	public static void main(String args[])
	{
		BFTGraph graph=new BFTGraph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(1, 4);
		graph.addEdge(3, 4);
		
		System.out.println("Breadth- First Traversal for given graph with 0 start index..");
		graph.bft_helper(0);
	}

}
