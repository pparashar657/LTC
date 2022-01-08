package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintWays {

	public static void main(String[] args) {
		
		int n = 4;
		//System.out.println(countWays(n));
		
		printWays(n, new ArrayList<>());
		
	}
	
	private static void printWays(int n, List<Integer> path) {
		
		if( n < 0) {
			return;
		}
		
		if(n == 0) {
			System.out.println(path);
			return;
		}
		
		path.add(1);
		printWays(n-1, path);
		
		path.remove(path.size()-1);
		
		path.add(2);
		printWays(n-2, path);
		path.remove(path.size()-1);
	}

	//Function to count number of ways to reach the nth stair.
    static int countWays(int n)
    {
        
        if(n == 1 || n == 2) return n;
        
        return countWays(n-1) + countWays(n-2);
        
    }

}
