package graph;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 3);
		graph.addEdge("B", "C", 1);
		graph.addEdge("C", "D", 8);
		graph.addEdge("D", "E", 10);
		graph.addEdge("E", "F", 45);
		graph.addEdge("E", "G", 7);
		graph.addEdge("F", "G", 18);
		
		graph.display();
		
//		System.out.println(graph.numVertex());
//		System.out.println(graph.numEdges());
//		
//		System.out.println(graph.containsEdge("A", "C"));
//		System.out.println(graph.containsEdge("E", "F"));
//		
//		graph.removeEdge("D", "E");
//		graph.display();
//		
//		graph.removeVertex("F");
//		graph.display();
//		
//		graph.addVertex("F");
//		graph.display();
//		
//		graph.addEdge("F", "A", 10);
//		graph.display();
		
		System.out.println(graph.hasPath("A", "F", new HashMap<>()));
	}

}
