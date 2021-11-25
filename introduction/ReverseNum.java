package introduction;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int ans = 0;
		
		while(num != 0) {
			int digit = num% 10;
			ans = ans * 10 + digit;
			num /= 10;
		}
		
		System.out.println("The reversed number is : " + ans);

	}

}
