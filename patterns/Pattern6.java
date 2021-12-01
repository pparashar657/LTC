package patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		
		pattern6(n);

	}
	
	/**
			*
		    **
		    ***
		    ****
		    *****
		    ****
		    ***
		    **
		    *
	 */


	private static void pattern6(int n) {
		for (int row = 1; row <= 2*n -1 ; row++) {
			
			int colNum = (row <= n) ? (row) : (2*n - row);
//			if (row <=n) {
//				colNum = row;
//			} else {
//				colNum = 2*n - row;
//			}
				
			for (int col = 0; col<colNum; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
