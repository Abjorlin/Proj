import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GraphIO2000 {

	static public void main(String args[]) throws FileNotFoundException {
		
		Graph2000 graph = new Graph2000(2000);
		
		
		File file = new File("C:\\Users\\Axel\\eclipse-workspace\\Proj\\src\\datatrim2000.txt");
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()) {
			String elements = scan.nextLine();
			String[] splitElements = elements.split(" ");
			if (!elements.isEmpty()) {
				graph.addEdge(Integer.parseInt(splitElements[0]), Integer.parseInt(splitElements[1]));
			}
		}

		scan.close();
		/*
		for (int i=0; i<948; i++) {
			System.out.print(graph.AdjListLen(i) + "\n");
		}
		
		System.out.print(graph.AdjListLen(162));
		*/
		
		graph.degreeDistribution(); 
	}
	
}