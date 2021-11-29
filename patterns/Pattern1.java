package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int n = sc.nextInt();

		//pattern1(n);
		
		//pattern2(n);
		
		pattern3(n);
		
	}

	private static void pattern3(int n) {
		for (int row = 0; row < n; row++) {
			for(int col = 0; col < n - row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void pattern2(int n) {
		for (int row = 0; row < n; row++) {
			for(int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void pattern1(int n) {
		
		for (int row = 0; row < n; row ++) {
			for (int col = 0; col < n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
