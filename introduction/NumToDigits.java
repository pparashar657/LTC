package introduction;

import java.util.Scanner;

public class NumToDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		while(num != 0) {
			int digit = num% 10;
			System.out.println(digit);
			num /= 10;
		}

	}

}
