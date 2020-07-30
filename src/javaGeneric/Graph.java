package javaGeneric;

import java.util.LinkedList;
import java.util.List;

public class Graph {

	static class Build{
		int vertices;
		
		LinkedList<Integer> adjListArray[];
		
		Build(int vertices){
			this.vertices=vertices;
			
			adjListArray = new LinkedList[vertices];
			for(int i=0; i<vertices; i++){
			adjListArray[i] = new LinkedList();
			}
		}
	}
	
	static void addEdge(Build b, int source, int destination){
		b.adjListArray[source].add(destination);
		
		//for undirected graph
		b.adjListArray[destination].add(source);
	}
	
	static void printGraph(Build b){
		
		for(int i=0; i<b.vertices;i++){
			System.out.println("vertices number: "+i);
			System.out.print("List of Edges: ");
			for(Integer pCrawl: b.adjListArray[i]){
				System.out.print(" Edje-> "+pCrawl);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		int vertices = 5;
		Build b = new Build(vertices);
		addEdge(b,0,1);
		addEdge(b,0,4);
		addEdge(b,1,2);
		addEdge(b,1,3);
		addEdge(b,1,4);
		addEdge(b,2,3);
		addEdge(b,3,4);
		
		printGraph(b);
		
	}

}
