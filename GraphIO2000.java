import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GraphIO2000 {
	
	static public void main(String args[]) throws FileNotFoundException {
		
		
		Graph2000 graph = new Graph2000(8084469);
		//8084469
		//18679
		
		Hashtable<String, Integer> HT = new Hashtable<String,Integer>();
		
		//C:\\Users\\Axel\\Desktop\\Datalogi\\shell\\gigafiler\\uniqsproj.txt
		//C:\\Users\\Axel\\eclipse-workspace\\Proj\\src\\uniqshead50000.txt
		
		File uniqs = new File("C:\\Users\\Axel\\Desktop\\Datalogi\\shell\\gigafiler\\uniqsproj.txt");
		Scanner scanuniq = new Scanner(uniqs);
		
		int i = 0;
		while (scanuniq.hasNextLine()) {
			String unique = scanuniq.nextLine();
			HT.put(unique, i);
			i++;
		}
		scanuniq.close();
		
		
		System.out.println("Hashing done!");
		
		
		File file = new File("C:\\Users\\Axel\\Desktop\\Datalogi\\shell\\gigafiler\\datatrimproj.txt");
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()) {
			String elements = scan.nextLine();
			String[] splitElements = elements.split(" ");
			if (!elements.isEmpty()) {
				graph.addEdge(HT.get(splitElements[0]), HT.get(splitElements[1]));
			}
		}
		scan.close();
		
		
		System.out.println("Graph setup done!");
		System.out.println("Initializing DFS...");

		
		ConnectedComponents cc = new ConnectedComponents(graph);

		
		System.out.println("DFS done!");
		
		
		graph.degreeDistribution();
		cc.componentSizeDistribution();
		System.out.println("Amount of components: " + cc.count());
		System.out.println("Amount of nodes: " + i);
		
		
	}
	
}