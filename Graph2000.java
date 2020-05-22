import java.util.ArrayList;
import java.util.LinkedList;



public class Graph2000 {

	int V;
	boolean adj;
	double probability;
	LinkedList<Integer>[] adjList;


	Graph2000() {
	}
	
	
	
	Graph2000(int n) {
		
		this.V = n;
		adjList = new LinkedList[n];
		
		for (int i = 0; i < V; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}
	
	
	
	public void addEdge(int src, int dest) {
		adjList[src].add(dest);
		adjList[dest].add(src);
    }
	

	
 
	public LinkedList<Integer> printAdjList(int index) { 
        return adjList[index];
    }
	
	public int printAdjListLen(int index) { 
        return adjList[index].size();
    }
	

	
	
}