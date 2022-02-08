package oops.abstract_interface;

public class Square extends Shape {

    int side;

    public Square(int side) {
        super(4);
        this.side = side;
    }

    int area() {
        return side * side;
    }
}
