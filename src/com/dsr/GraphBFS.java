package com.dsr;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphBFS {
	
	private Integer vertixes;
	private LinkedList<Integer> adjuscents[];
	
	public GraphBFS(int v)
	{
		vertixes=v;
		adjuscents=new LinkedList[v] ;
		for(int i=0;i<v;i++) {
			adjuscents[i]=new LinkedList<Integer>();
		}
	}
	
	// Function to add an edge into the graph 
    void addEdge(int v,int w) 
    { 
        adjuscents[v].add(w); 
    } 
    
    public void getBFS(int v) {
    	
    	boolean visited[]=new boolean[vertixes];
    	
    	LinkedList<Integer> queue=new LinkedList<Integer>();
    	
    	visited[v]=true;
    	queue.add(v);
    	
    	while(queue.size()!=0)
    	{
    		v=queue.poll();
    		System.out.println(v +" " );
    		LinkedList<Integer> vertices = adjuscents[v];
    		Iterator<Integer> iteratore = vertices.iterator();
    		while(iteratore.hasNext())
    		{
    			int n=iteratore.next();
    			if(!visited[n])
    			{
    				visited[n]=true;
    				queue.add(n);
    			}
    		}
    		
    	}
    	
    }
    
    
    public static void main(String[] args) {
    	
    	GraphBFS bfs=new GraphBFS(4);
    	 bfs.addEdge(0, 1); 
         bfs.addEdge(0, 2); 
         bfs.addEdge(1, 2); 
         bfs.addEdge(2, 0); 
         bfs.addEdge(2, 3); 
         bfs.addEdge(3, 3); 
         int i=0;
         bfs.getBFS(2);
	}

}
