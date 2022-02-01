package oops.inheitance;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Sita", 100, 2, 12.5f, 4);

        myCar.start();
        myCar.printPrice();
        myCar.openAirBag();

        System.out.println(myCar);
    }

}
