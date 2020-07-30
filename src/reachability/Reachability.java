package reachability;

import java.util.LinkedList;

public class Reachability {

	static class Graph{
		int v ;
		LinkedList<Integer> AdjListArray[];
		
		Graph(int v){
			this.v=v;
			
			//define size of List
			AdjListArray = new LinkedList[v];
			
			//adding List
			for(int i=0; i<v;i++){
				AdjListArray[i] = new LinkedList<>();
			}
			
		}
	}//Graph
	
	//adding edge to the directed graph
	static void addEdge(Graph graph, int src, int dest){
		
		//adding edge from src to dest
		graph.AdjListArray[src].add(dest);
		
		graph.AdjListArray[dest].add(src); 
	}
	
	static int reachability(Graph graph, int a, int b){
		
	
			if(graph.AdjListArray[a].contains(b)){
			return 1;
			}
			else return 0;
	}
	
	static void printGraph(Graph graph){
		
		for(int i=0; i<graph.v ; i++){
			System.out.println("Adjacency List of: "+(i));
			System.out.println("Head ");
			for(Integer crawl: graph.AdjListArray[i]){
				System.out.print("-> "+crawl);
			}
			System.out.println("\n");
		}
	}
	
	
	public static void main(String[] args) {
		int v=5;
	Graph graph =new Graph(v);
	addEdge(graph, 0, 1); 
    addEdge(graph, 0, 4); 
    addEdge(graph, 1, 2); 
    addEdge(graph, 1, 3); 
    addEdge(graph, 1, 4); 
    addEdge(graph, 2, 3); 
    addEdge(graph, 3, 4);
	 
	// printGraph(graph);
	 int result = reachability(graph,3,0);
	 System.out.println(result);
	}
	
}
