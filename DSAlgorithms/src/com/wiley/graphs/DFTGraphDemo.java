package com.wiley.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFTGraphDemo {
	
	int vertices;
	LinkedList<Integer> adj[];
	
	public DFTGraphDemo(int v)
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
	void dft_helper(int v, boolean visited[])
	{
		visited[v]=true;
		System.out.print(v+" --> "+adj[v]+"\n");
		
		Iterator<Integer> itr=adj[v].listIterator();
		
		while(itr.hasNext())
		{
			int n=itr.next();
			if(!visited[n])
				dft_helper(n,visited);
		}
	}
	
	void traverse(int v)
	{
		boolean visited[]=new boolean[vertices];
		
		dft_helper(v,visited);
	}
	
	public static void main(String args[])
	{
		DFTGraphDemo graph=new DFTGraphDemo(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(1, 4);
		graph.addEdge(3, 4);
		
		System.out.println("Depth- First Traversal for given graph with 0 start index..");
		graph.traverse(0);
	}

}
