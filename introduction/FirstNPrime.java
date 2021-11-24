package introduction;

import java.util.Scanner;

public class FirstNPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers?");
		
		int n = sc.nextInt();
		
		int count = 0;
		boolean flag;
		
		for(int curr = 2; count<n; curr++) {
			flag = true;
			for (int i=2; i*i<=curr; i++) {
				if (curr % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(curr);
				count++;
			}
		}
	}

}
