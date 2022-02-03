package oops.introduction;

public class Human {
    // Data member/ Data properties
    String name;
    int age;
    char gender;
    static int population = 0;

    Human() {
        System.out.println("I am default constructor");
    }

    Human(int a) {
        System.out.println("I am parameterized constructor");
    }

    void increasePopulation() {
        Human.population ++;
    }

    public static void printPopulation() {
//        System.out.println(name);
        System.out.println(Human.population);
    }

    void changeName(String name) {
        this.name = name;
    }

    // Methods | Functions
    void sleep() {
        System.out.println(this.name + " is sleeping");
    }

//    void test() {
//        System.out.println("I am test 1");
//    }
//
//    void test(int a) {
//        System.out.println("I am test 2");
//    }
//
//    void test(int a, int b) {
//        System.out.println("I am test 3");
//    }
//
//    void test(int b, String a) {
//        System.out.println("I am test 4");
//    }
//
//    void test(String b, int a) {
//        System.out.println("I am test 5");
//    }

    void printDetails() {
        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);
        System.out.println("Gender = " + this.gender);
    }
}
