package oops.abstract_interface;

public class Main {

    public static void main(String[] args) {
        Square mySquare = new Square(10);
        System.out.println(mySquare.area());
        mySquare.printSides();

        Rectangle myRectangle = new Rectangle(10,15);
        System.out.println(myRectangle.area());

        myRectangle.printSides();

        Helper helper = new Helper();

        helper.test1();
        helper.test2();

    }

}
