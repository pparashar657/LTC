package introduction;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		int num = sc.nextInt();
		
		boolean flag = true;
		
//		for (int i=2; i<=Math.sqrt(num); i++)
//			if(num%i == 0)
//				flag = false;
		
		for (int i=2; i*i<=num; i++)
			if(num%i == 0) {
				flag = false;
				break;
			}
		
		if (flag) {
			System.out.println("The number "+ num +" is Prime.");
		} else {
			System.out.println("The number "+ num +" is not Prime.");
		}
	}

}
