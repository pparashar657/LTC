package introduction;

import java.util.Scanner;

public class TrailingZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int trailingZeros = 0;
		trailingZeros = trailingZeros + num/5;
		trailingZeros = trailingZeros + num/25;
		trailingZeros = trailingZeros + num/125;
		trailingZeros = trailingZeros + num/625;
		trailingZeros = trailingZeros + num/3125;
		System.out.println("The number of trailing zeros in "+num+"! = "+trailingZeros);
	}

}
