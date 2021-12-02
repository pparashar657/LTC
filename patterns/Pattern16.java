package patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		
		//pattern16(n);
		//pattern21(n);
		
		pattern19(n);
		
	}

	private static void pattern19(int n) {
		for(int row = 0; row < n; row++) {
			int ans = 1;
			System.out.print(ans + " ");
			for (int col = 1; col<=row; col++) {
				ans = ((row - col + 1)*ans/ col);
				System.out.print(ans +" ");
			}
			System.out.println();
		}
		
	}

	private static void pattern21(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if((row == 1) || (row == n) || row == col || (row + col) == n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	private static void pattern16(int n) {
		for (int row = 1; row <n ;row++) {
			// Outer spaces loop
			
			for (int col = 0; col < n - row; col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if ( row == 1) {
				System.out.println();
				continue;
			}
			
			// Inner spaces
			
			for (int col = 0; col < (2*(row - 1)- 1); col++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int col = 0; col < 2* n - 1; col++) {
			System.out.print("*");
		}
	}

}
