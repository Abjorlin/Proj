import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ConnectedComponents {
	
	private boolean[] visited;
	private int[] size;
	private int count = 0;

	
	public ConnectedComponents(Graph2000 G) {
		visited = new boolean[G.numVertex()];
        size = new int[G.numVertex()];
        for (int v = 0; v < G.numVertex(); v++) {
        	if (!visited[v]) {
            	DFS(G, v);
                count++;
            } 
        }  
    }
	
	
	
	 private void DFS(Graph2000 G, int v) {
		visited[v] = true;
		size[count]++;
		for (int w: G.AdjList(v)) {
			if (!visited[w]) {
	    		 DFS(G, w);
	            }
	        }
	    }
	 
	 
	 
	 public int componentSize(int v) {
		 return size[v];
	 }
	
	 public int count() {
		 return count;
	 }
	 
	 
	 public int amountOfNodes() {
		 int nodes = 0;
		 
		 for(int j = 0; j < count; j++) {
				nodes += componentSize(j);
		 }
		 return nodes;
	 }
	 
	 public void componentSizeDistribution() {
			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			for (int i=0; i<count; i++) {
				arr.add(componentSize(i));
			}

			Set<Integer> distinct = new HashSet<>(arr);
			for (int s: distinct) {
				System.out.println("Components of size " + s + " occurs " + Collections.frequency(arr, s) + " times.");
			}
		}
	 
	 
}
