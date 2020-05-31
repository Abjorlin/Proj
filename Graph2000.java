import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Graph2000 {
	
	
	int V;
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
	
	public int numVertex() {
		return this.V;
	}

	public LinkedList<Integer> AdjList(int index) { 
        return adjList[index];
    }
	
	public int AdjListLen(int index) { 
        return adjList[index].size();
    }
	
	
	public void degreeDistribution() {
				
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0; i<this.V; i++) {
			arr.add(AdjListLen(i));
		}

		Set<Integer> distinct = new HashSet<>(arr);
		for (int s: distinct) {
			System.out.println(s + " degrees occur " + Collections.frequency(arr, s) + " times.");
		}
	}
} 



