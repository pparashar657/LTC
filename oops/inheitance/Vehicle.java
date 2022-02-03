package oops.inheitance;

public class Vehicle {
    private String name;
    private int noOfTyre;
    private int price;

//    Data Hiding

    public Vehicle(String name, int noOfTyre, int price) {
        this.name = name;
        this.noOfTyre = noOfTyre;
        this.price = price;
    }
    //Getters
    public String getName() {
        return this.name;
    }


    //setters
    public void setName(String name) {
        this.name = name;
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
