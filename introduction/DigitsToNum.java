package introduction;

import java.util.Scanner;

public class DigitsToNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many digits you want to enter?");
		
		int n = sc.nextInt();
		int digit, ans = 0;
		
		System.out.println("Enter the digits (0-9): ");
		for (int i=0;i<n;i++) {
			digit = sc.nextInt();
			ans = ans*10 + digit;
		}
		
		System.out.println("The number is : " + ans);
	}

}
