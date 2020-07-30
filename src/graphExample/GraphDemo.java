package graphExample;

import java.util.LinkedList;

public class GraphDemo {
	
	static class Graph {
		int vertices ;
		LinkedList<Integer> adjListArray[];

		//Constructor
		Graph(int vertices ){
			this.vertices = vertices;
			
			adjListArray = new LinkedList[vertices];
			
			for(int i=0; i< vertices; i++){
				adjListArray[i] = new LinkedList<>();
			}
		}
	}
	//creating Edge
	static void addEdge(Graph graph, int source, int destination){
		//add edge from src to dest
		graph.adjListArray[source].add(destination);
		
		//since it is a undirected graph so if there is a edge from one src to dest 
		//that there is an edge from dest to src
		
		graph.adjListArray[destination].add(source);
	}
	
	//Function to print graph vertices and there adjacent vertices 
	
	static void printGraph(Graph graph){
	
		for(int i=0; i<graph.vertices; i++){
			System.out.println("Adjacency list verties:"+i);
			System.out.print("Head");
			for(Integer pCrawl: graph.adjListArray[i]){
				System.out.print("-> "+pCrawl);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		int vertices = 5;
		Graph graph = new Graph(vertices);
		addEdge(graph,0,1);
		addEdge(graph,0,4);
		addEdge(graph,1,2);
		addEdge(graph,1,3);
		addEdge(graph,1,4);
		addEdge(graph,2,3);
		addEdge(graph,3,4);
		
		printGraph(graph);
		
	}

}
