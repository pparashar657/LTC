package oops.inheitance;

public class Car extends Vehicle {
    int noOfAirBag;
    float average;
    int noOfSeats;

    public Car(String name, int price, int noOfAirBag, float average, int noOfSeats) {
        super(name, 4, price);
        this.noOfAirBag = noOfAirBag;
        this.average = average;
        this.noOfSeats = noOfSeats;
    }

    public void openAirBag() {
        System.out.println("Air Bag is opened" + noOfAirBag);
    }

    public String toString() {
        return super.toString() + " noOfAirBag = " + this.noOfAirBag
                + " Average = " + this.average
                + " No of Seats = " + this.noOfSeats;
    }

//    void test() {
//        System.out.println(super.name);
//        super.printPrice();
//    }

}
