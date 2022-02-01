package oops.inheitance;

public class Vehicle {
    String name;
    int noOfTyre;
    int price;

    public Vehicle(String name, int noOfTyre, int price) {
        this.name = name;
        this.noOfTyre = noOfTyre;
        this.price = price;
    }

    void printPrice() {
        System.out.println("the price = " + this.price);
    }

    void start() {
        System.out.println(this.name + " is starting....");
    }

    public String toString() {
        return "name ='" + name + '\'' +
                ", noOfTyre =" + noOfTyre +
                ", price =" + price;
    }
}
