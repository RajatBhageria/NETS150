import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author RajatBhageria 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AdjacencyMatrix matrix = new AdjacencyMatrix(52);
		AdjacencyMatrix matrix = new AdjacencyMatrix(4039);
		int i = 0, j = 0;
		
		String file= "src/facebook_combined.txt";
		//String file = "src/test1.txt";
		try {
		    BufferedReader in = new BufferedReader(new FileReader(file));
		    String str;
		    while ((str = in.readLine()) != null){
		    	int spaceIndex = str.indexOf(" ");
		    	
		    	//Parse the indexes of the txt file and then data to matrix
		    	try{
		    		i = Integer.parseInt((str.substring(0, spaceIndex)));
			    	j = Integer.parseInt((str.substring(spaceIndex+1, str.length())));
			    	matrix.addEdge(i,j);
			    	matrix.addEdge(j, i);
		    	} catch(ArrayIndexOutOfBoundsException a){
		    		continue;
		    	}
		    }
		    in.close();
		    //System.out.println(matrix.toString());
		} catch (IOException e) {
			System.out.println("ERROR: unable to read file " + file);
		    e.printStackTrace(); 
		}		
		
		Searches search = new Searches(matrix);
		//System.out.println(search.runBFS(0, 1232));
		
		System.out.println("The Distance between nodes 40 and 1050 is: " +search.runBFS(40, 1050));
		//System.out.println("The Distance between nodes 40 and 1050 is: " +search.breadthFirstSearch(0, 51));


		
		
	}

}