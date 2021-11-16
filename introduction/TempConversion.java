package introduction;

import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the degree (C/F) : ");
		char degree = sc.next().charAt(0);
		
		System.out.println("Enter the temperature: ");
		double temp = sc.nextDouble();
		
		double newTemp;
		
		if (degree == 'C' || degree == 'c') {
			newTemp = ((9.0 / 5) * temp) + 32;
			System.out.println("The temperature in Fahrenhiet is : " + newTemp);
		} else if (degree == 'F' || degree == 'f'){
			newTemp = (5.0 / 9) * (temp -32);
			System.out.println("The temperature in Celcius is : " + newTemp);
		} else {
			System.out.println("WARNING !! Invalid degree entered.");
		}
	}

}
