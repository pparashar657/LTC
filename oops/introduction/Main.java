package oops.introduction;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Human pawan = new Human();
        Human ankit = new Human();

//        pawan.printDetails();

        System.out.println(pawan.age);
        System.out.println(pawan.name);

        pawan.name = "Pawan Kumar";
        pawan.age = 22;

        ankit.name = "Ankit";
        ankit.age = 18;
        ankit.gender = 'M';

        System.out.println(pawan.age);
        System.out.println(pawan.name);

        ankit.printDetails();

        System.out.println(pawan);
        System.out.println(ankit);

        pawan.changeName("New Pawan");

        pawan.printDetails();
        ankit.printDetails();

        pawan = ankit;
        System.out.println(pawan);
        System.out.println(ankit);

        pawan.printDetails();
        ankit.printDetails();

        pawan.changeName("Ok bro");

        System.out.println(ankit.name);

        Human rishab = new Human();

        rishab.increasePopulation();

        pawan.increasePopulation();

        System.out.println(Human.population);
        Human.printPopulation();


    }





}
