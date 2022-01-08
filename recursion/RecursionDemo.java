package recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		
		System.out.println("I am inside main");

		//func1();
		
		func(1);
		
		System.out.println("I am exiting main");
		
	}
	
	private static void func(int count) {
		System.out.println("I am inside func " + count);

		if (count < 3) {
			func(count + 1);
		} else {
			System.out.println("Hello world");
		}
		
		System.out.println("I am exiting func " + count);
	}

//	private static void func1() {
//		System.out.println("I am inside func " + 1);
//
//		func2();
//		
//		System.out.println("I am exiting func " + 1);
//		
//	}
//	
//	private static void func2() {
//		System.out.println("I am inside func " + 2);
//
//		func3();
//		
//		System.out.println("I am exiting func " + 2);
//		
//	}
//	
//	private static void func3() {
//		System.out.println("I am inside func " + 3);
//		
//		System.out.println("Hello World");
//		
//		System.out.println("I am exiting func " + 3);
//		
//	}

}
