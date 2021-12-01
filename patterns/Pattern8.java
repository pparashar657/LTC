package patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		
//		pattern8(n);
		pattern9(n);


	}
	/*
	 
	 *****
      ****
       ***
        **
         *

	 
	 */

	private static void pattern9(int n) {
		
		for(int row = 0; row < n ; row++) {
			for (int col = 0; col < row; col++) {
				System.out.print(" ");
			}
			
			for(int col = 0; col< n-row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	/*
	 
	  	 *
        **
       ***
      ****
     *****

	 
	 */
	private static void pattern8(int n) {
		
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col<=n ; col ++) {
				if (col <= (n - row)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
