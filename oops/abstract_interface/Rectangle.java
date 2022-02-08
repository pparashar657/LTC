package oops.abstract_interface;

public class Rectangle extends Shape {

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        super(4);
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return this.length * this.breadth;
    }
}
