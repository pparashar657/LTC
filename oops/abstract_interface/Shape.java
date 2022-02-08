package oops.abstract_interface;

abstract public class Shape {

    int no_of_sides;

    public Shape(int no_of_sides) {
        this.no_of_sides = no_of_sides;
    }

//    void test1();

    abstract int area();

    void printSides() {
        System.out.println(this.no_of_sides);
    }
}
