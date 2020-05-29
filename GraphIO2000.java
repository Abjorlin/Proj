import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GraphIO2000 {
	
	static public void main(String args[]) throws FileNotFoundException {
		
		/*
		Graph2000 graph = new Graph2000(23);
		
		//948
		//23
		//464
		File file = new File("C:\\Users\\Axel\\eclipse-workspace\\Proj\\src\\test.txt");
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()) {
			String elements = scan.nextLine();
			String[] splitElements = elements.split(" ");
			if (!elements.isEmpty()) {
				graph.addEdge(Integer.parseInt(splitElements[0]), Integer.parseInt(splitElements[1]));
			}
		}
		
		scan.close();
		*/
		
		
		
		
		Graph2000 graph = new Graph2000(18679);

		
		Hashtable<Integer, Integer> HT = new Hashtable<Integer,Integer>();
		File uniqs = new File("C:\\Users\\Axel\\eclipse-workspace\\Proj\\src\\uniqshead50000.txt");
		Scanner scanuniq = new Scanner(uniqs);
		int i = 0;
		while (scanuniq.hasNextLine()) {
				String unique = scanuniq.nextLine();
				HT.put(unique.hashCode(), i);
				i++;
		}
		scanuniq.close();
		System.out.println(i);
		
		File file = new File("C:\\Users\\Axel\\eclipse-workspace\\Proj\\src\\datatrim50000.txt");
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()) {
			String elements = scan.nextLine();
			String[] splitElements = elements.split(" ");
			if (!elements.isEmpty()) {
				graph.addEdge(HT.get(splitElements[0].hashCode()), HT.get(splitElements[1].hashCode()));
			}
		}
		
		scan.close();
		
		
		ConnectedComponents cc = new ConnectedComponents(graph);
		System.out.println(graph.AdjList(0));
		System.out.println(graph.AdjList(1));
		System.out.println(graph.AdjList(2));
		graph.degreeDistribution(); 
		System.out.println(cc.count() + " components");
		System.out.println(cc.size(0));
		System.out.println(cc.size(1));
		System.out.println(cc.size(2) );
		System.out.println(graph.countVertex());

		
	}
	
}