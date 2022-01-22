package oops.introduction;

public class Human {
    // Data member/ Data properties
    String name;
    int age;
    char gender;

    Human() {
        System.out.println("I am constructor");
    }

    void changeName(String name) {
        this.name = name;
    }

    // Methods | Functions
    void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    void printDetails() {
        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);
        System.out.println("Gender = " + this.gender);
    }
}
