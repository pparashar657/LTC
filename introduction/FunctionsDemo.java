package introduction;

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
		
		int ans = max(100, 20);
		System.out.println(ans);
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
