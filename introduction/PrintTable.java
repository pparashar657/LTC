package introduction;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		for(int count = 1; count <= 10; count++) {
			System.out.println(num + " *  " + count +" = "+(num*count));
		}
	}

}
