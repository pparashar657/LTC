package introduction;

import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the coefficients (a,b,c)");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double d = b*b - 4*a*c;
		
		if (d > 0) {
			System.out.println("The equation has distict and Real roots : ");
			double root1 = (-1*b + Math.sqrt(d))/(2*a);
			double root2 = (-1*b - Math.sqrt(d))/(2*a);
			System.out.println("Root 1 = " + root1);
			System.out.println("Root 2 = " + root2);
		} else if (d < 0){
			System.out.println("The equation has distict and Imaginary roots : ");
			double rootRe = (-1*b)/(2*a);
			double rootIm = Math.sqrt(-1*d)/(2*a);
			System.out.println("Root 1 = " + rootRe + " + i"+rootIm);
			System.out.println("Root 2 = " + rootRe + " - i"+rootIm);
		} else {
			System.out.println("The equation has equal and real roots : ");
			double root = (-1*b)/(2*a);
			System.out.println("Root 1 and Root 2= " + root);
		}
		
	}
	
	

}
