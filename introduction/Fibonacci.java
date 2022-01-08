package introduction;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers ?");
		int n = sc.nextInt();
		
		int first = 0;
		int second = 1;
		int third = 0;
		while(n-- > 0) {
			third = first + second;
			first = second;
			second = third;
		}
		System.out.print(second + " ");
		
//		
		
//		System.out.println("Upto which number ?");
//		int n = sc.nextInt();
//		
//		int first = 0;
//		int second = 1;
//		int third = 0;
//		while(second <= n) {
//			System.out.print(second + " ");
//			third = first + second;
//			first = second;
//			second = third;
//		}
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE;
		
	}

}
