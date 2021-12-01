package introduction;

import java.util.Scanner;

public class EncryptNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		int ans = encryptNumber(num);
		
		System.out.println("The encrypted number is : ");
		System.out.println(ans);
		
		System.out.println("The original number was: ");
		System.out.println(decryptNumber(ans));
	}

	private static int encryptNumber(int num) {
		int pos = 1;
		int ans = 0;
		int exp = 1;
		while(num != 0) {
			int currDigit = num % 10;
			if (pos % 2 == 0) {
				currDigit++;
			} else {
				currDigit--;
			}
			currDigit = (currDigit + 10) % 10;
			ans = ans + currDigit * exp;
			exp *= 10;
			num /= 10;
			pos++;
		}
		return ans;
	}
	
	static int decryptNumber(int num) {
		int pos = 1;
		int ans = 0;
		int exp = 1;
		while(num != 0) {
			int currDigit = num % 10;
			if (pos % 2 == 0) {
				currDigit--;
			} else {
				currDigit++;
			}
			currDigit = (currDigit + 10) % 10;
			ans = ans + currDigit * exp;
			exp *= 10;
			num /= 10;
			pos++;
		}
		return ans;
	}

}
