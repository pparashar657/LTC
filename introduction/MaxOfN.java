package introduction;

import java.util.Scanner;

public class MaxOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers you want to enter?");
		
		int n = sc.nextInt();
		int num, max = Integer.MIN_VALUE;
		
		System.out.println("Enter the numbers: ");
		for (int i=0;i<n;i++) {
			num = sc.nextInt();
			max = Math.max(num, max);
		}
		
		System.out.println("The maximum is : " + max);
	}

}
