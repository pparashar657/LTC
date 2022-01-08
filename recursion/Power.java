package recursion;

public class Power {

	public static void main(String[] args) {
		
		System.out.println(power(2,10));

	}

	private static int power(int a, int b) {
		
		if(b == 0) {
			return 1;
		}
		
		int smallAns = power(a, b/2);
		
		if(b % 2 == 0) {
			return smallAns * smallAns;
		} else {
			return smallAns * smallAns * a;
		}
	}

}
