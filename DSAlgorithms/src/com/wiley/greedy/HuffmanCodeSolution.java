package com.wiley.greedy;



import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class HuffmanCodeSolution {

	static Map<Character,String> prefix=new HashMap();
	static Node root;
	
	public static Node buildTree(Map<Character,Integer> freq)
	{
		PriorityQueue<Node> pq=new PriorityQueue();//lambda expression to override comparator);
		Set<Character> keys=freq.keySet();
		for(Character c:keys)
		{
			Node n=new Node();
			n.c=c;
			n.freq=freq.get(c);
			n.left=null;
			n.right=null;
			pq.offer(n);
		}
		while(pq.size()>1)
		{
			Node x=pq.peek();
			pq.poll();
			
			Node y=pq.peek();
			pq.poll();
			
			Node combinedNode=new Node();
			combinedNode.freq=x.freq+y.freq;
			combinedNode.c='-';
			
			combinedNode.left=x;
			combinedNode.right=y;
			
			root=combinedNode;
			
			pq.offer(combinedNode);
			
		}
		return pq.poll();
	}
	public static void main(String args[])

	{
		String message="ABCDEBBCCAADE";
		System.out.println(message);
		String encoded=encode(message);
		System.out.println("Encoded String is "+encoded);
		decode(encoded);
		
	}
	private static String encode(String message) {

		Map<Character,Integer> freq=new HashMap<Character,Integer>();
		for(int i=0;i<message.length();i++)
		{
			if(!freq.containsKey(message.charAt(i)))
				freq.put(message.charAt(i), 0);
			else
				freq.put(message.charAt(i),freq.get(message.charAt(i)) + 1);
		}
		
		System.out.println(freq);
		root=buildTree(freq);
		setCodes(root,new StringBuffer());
		System.out.println(prefix);
		StringBuffer s1=new StringBuffer();
		for(int i=0;i<message.length();i++)
		{
			char c=message.charAt(i);
			s1.append(prefix.get(c));
		}
		
		return s1.toString();
	}
	private static void setCodes(Node node, StringBuffer sb)

	{
		if(node!=null)
		{
			if(node.left==null && node.right== null)
				prefix.put(node.c, sb.toString());
			else
			{
				sb.append('0');
				setCodes(node.left,sb);
				sb.deleteCharAt(sb.length()-1);
				
				sb.append('1');
				setCodes(node.right,sb);
				sb.deleteCharAt(sb.length()-1);
				
			}
					
		}
	}
	
	public static void decode(String es)
	{
		StringBuilder sb=new StringBuilder();
		Node temp=root;
		for(int i=0;i<es.length();i++)
		{
			int j=Integer.parseInt(String.valueOf(es.charAt(i)));
			
			if(j==0)
			{
				temp=temp.left;
				if(temp.left==null && temp.right ==null)
				{
					sb.append(temp.c);
					temp=root;
				}
			}
			if(j==1)
			{
				temp=temp.right;
				if(temp.right==null && temp.left ==null)
				{
					sb.append(temp.c);
					temp=root;
				}
			}
		}
		System.out.println("Decoded String is "+sb.toString());
	}
}
// String s = "SDFSGSKGNSKFNFKNSKFHNKSFNH"  // OMITING THE SPECIAL CHAR ENCODED STRING USING HUFFMAN

// CHAR ARRAY [] , INT FREQ[] have to add comparable yet
class Node implements Comparable<Node>
{
	char c;
	int freq;
	Node left,right;
	@Override
	public int compareTo(Node that) {
		return this.freq-that.freq;
	}
}