package introduction;

import java.util.Scanner;

public class FindCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character : ");
		char ch = sc.next().charAt(0);
		
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			if (ch == 'A' || ch == 'a' || 
					ch == 'E' || ch == 'e' || 
					ch == 'I' || ch == 'i' ||
					ch == 'O' || ch == 'o' ||
					ch == 'U' || ch == 'u') {
				System.out.println("The input character " + ch + " is a vowel alphabet");
			} else {
				System.out.println("The input character " + ch + " is a consonant alphabet");
			}
		} else if (ch >= '0' && ch <= '9') {
			int num = ch - '0';
			if (num % 2 == 0) {
				System.out.println("The input character " + ch + " is an even number");
			} else {
				System.out.println("The input character " + ch + " is a odd number");
			}
		} else {
			System.out.println("The input character " + ch + " is a special symbol");
		}
		
	}

}
