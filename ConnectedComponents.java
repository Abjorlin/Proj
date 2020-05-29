
public class ConnectedComponents {
	
	private boolean[] visited;
	private int[] id;
	private int[] size;
	private int count = 0;

	
	
	public ConnectedComponents(Graph2000 G) {
		visited = new boolean[G.numVertex()];
        id = new int[G.numVertex()];
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
		 id[v] = count;
	     size[count]++;
	     for (int w: G.AdjList(v)) {
	    	 if (!visited[w]) {
	    		 DFS(G, w);
	            }
	        }
	    }
	 
	 
	 
	 public int size(int v) {
	    return size[id[v]];
	 }
	
	 public int count() {
        return count;
	 }
}
