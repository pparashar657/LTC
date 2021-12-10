package introduction;

import java.util.Arrays;

public class FunctionsDemo {

	public static void main(String[] args) {
//		System.out.println("I am before function");
//		printHello();
//		System.out.println("I am after function");
		
//		sayHello("Pawan");
//		sayHello("Ankit");
//		sayHello("Aman");
		
//		int ans = square(10);
//		System.out.println(ans);
//		
//		int ans = max(100, 20);
//		System.out.println(ans);
//		
	//	 Call by Value
//		int a = 10;
//		increase(a);
//		System.out.println(a);
		
		
		// Call by reference
		int[] arr = {1,2,3};
		
		int[] b = arr;
		
		increaseArr(b);
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static void increaseArr(int[] ankit) {
		for (int i = 0; i< ankit.length; i++) {
			ankit[i] = ankit[i] + 1;
		}
	}

	private static void increase(int num) {
		num = 100;
	}

	private static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	static void printHello() {
		System.out.println("Hello World");
	}
	
	static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	static int square(int num) {
		int ans = num * num;
		return ans;
	}

}
