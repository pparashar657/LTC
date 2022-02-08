package oops.abstract_interface;

public class Helper implements MyInterface, MyInterface2 {

    public void test1() {
        System.out.println(MyInterface.COUNT);
        System.out.println("I am in test");
    }

    public int test3() {
        System.out.println("I am in test 3");
        return 1;
    }

    public int test2() {
        System.out.println("I am in test 2");
        return 0;
    }
}
