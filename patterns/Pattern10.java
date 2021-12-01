package patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int n = sc.nextInt();

		//pattern10(n);
		//pattern11(n);
		pattern15(n);

	}

	private static void pattern15(int n) {
		for (int row = 1; row <= 2*n -1 ; row++) {
			int spaceNum = (row <= n) ? (row - 1) : (2*n - row - 1);
			
			int stars = (row <= n) ? (n - row) : (row - n);
			
			for (int col = 0; col < spaceNum; col++) {
				System.out.print(" ");
			}
			
			for (int col = 0; col <= stars; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void pattern11(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col < row; col++) {
				System.out.print(" ");
			}
			for (int col = 0; col <= 2*(n - row); col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void pattern10(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2*row - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
