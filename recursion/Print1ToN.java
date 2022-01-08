package recursion;

public class Print1ToN {

	public static void main(String[] args) {
		
		//print1ToN(10);
		 printNTo1(10);
	}

	private static void print1ToN(int n) {
		
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
		print1ToN(n-1);
		
		System.out.println(n);
		
	}
	
	private static void printNTo1(int n) {
		
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
		System.out.println(n);
		
		printNTo1(n-1);
		
	}
	
	

}
