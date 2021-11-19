package introduction;

import java.util.Scanner;

public class MultipleOf2Or5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		for (int count = 1; count <= num; count++) {
//			if (count%2 == 0 || count%5 == 0) {
//				System.out.println(count);
//			}
			
			if (count%2 == 0) {
				System.out.println(count);
			} else if (count%5 == 0) {
				System.out.println(count);
			}
		}

	}

}
