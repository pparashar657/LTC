package introduction;

public class DefaultArguments {

	public static void main(String[] args) {
		
		
//		printHello("Ankit", "Pawan");
//
//		//printHello();
//		printHello2();
//		printHello2("Pawan");
//		printHello2("Pawan", "Ankit");
		
		printDetails("Pawan", "10");
		printDetails("Pawan", "10", "English");
		printDetails("Pawan", "10", "Eng", "math");
		
	}

	private static void printHello(String name1, String name2) {
		System.out.println("Hello " + name1 +" and " + name2);
		
	}
	
	static void printHello2(String ...name) {
		System.out.println(name[0]);
	}
	
	static void printDetails(String name, String rollNo, String ...subjects) {
		
	}
	
//	static void printDetails2(String ...subjects, String rollNo, String name) {
//		
//	}

}
