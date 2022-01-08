package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Ok");
		System.out.println(fibo(50));;
	}

	// Time COmplexity - 2^n
	private static int fibo(int n) {
		
		if(n == 1 || n == 2) {
			return 1;
		}
		
		return fibo(n-1) + fibo(n-2);

	}

}
