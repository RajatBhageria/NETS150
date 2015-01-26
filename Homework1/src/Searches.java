import java.util.*;


public class Searches {
	private Deque<Map<Integer,Integer>> deque; 
	private AdjacencyMatrix matrix;
	
	public Searches(AdjacencyMatrix pMatrix){
		deque = new ArrayDeque<Map<Integer,Integer>>();	
		matrix = pMatrix; 
	}
	
	
	private void addElementToDeque(int startI, int startJ){
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		map.put(startI, startJ);
		deque.add(map);
	}
	
	private void iterateThroughDeque(){
		for (int i = 0; i < matrix.getLength(); i++){
			//addElementToDeque();
		}
	}
	 
	public void runBFS(int pStartI, int pStartJ){
		int startI = pStartI;
		int startJ = pStartJ;
		addElementToDeque(pStartI, pStartJ);
		for (int i = 0; i < matrix.getLength(); i++){
			addElementToDeque(startI, i);
		}

		while (deque.iterator().hasNext()){
			//iterateThroughDeque(deque.iterator().next());
			
		}
		System.out.println(deque);
	}
	
	
	public void runDFS(){
		
	}
	
	
}
