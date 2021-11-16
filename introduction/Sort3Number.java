package introduction;

import java.util.Scanner;

public class Sort3Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("The numbers in sorted order : ");
		
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			} else {
				System.out.println(num1 + " " + num3 + " " + num2);
			}
		} else if (num2 > num3) {
			if (num1 > num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			} else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		} else if (num1 > num2) {
				System.out.println(num3 + " " + num1 + " " + num2);
		} else {
				System.out.println(num3 + " " + num2 + " " + num1);
		}

	}

}
