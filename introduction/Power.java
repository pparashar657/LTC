package introduction;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = 1;
		for (int i=0;i<b;i++) {
			ans *= a;
		}
		System.out.println(a + " ^ " + b +" = " + ans);
		
		
	}

}
