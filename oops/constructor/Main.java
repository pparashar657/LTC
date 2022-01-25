package oops.constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Human pawan = new Human();
//        Human ankit = new Human();
//
////        pawan.printDetails();
//
//        System.out.println(pawan.age);
//        System.out.println(pawan.name);
//
//        pawan.name = "Pawan Kumar";
//        pawan.age = 22;
//
//        ankit.name = "Ankit";
//        ankit.age = 18;
//        ankit.gender = 'M';
//
//        System.out.println(pawan.age);
//        System.out.println(pawan.name);
//
//        ankit.printDetails();
//
//        System.out.println(pawan);
//        System.out.println(ankit);
//
//        pawan.changeName("New Pawan");
//
//        pawan.printDetails();
//        ankit.printDetails();
//
//        pawan = ankit;
//        System.out.println(pawan);
//        System.out.println(ankit);
//
//        pawan.printDetails();
//        ankit.printDetails();
//
//        pawan.changeName("Ok bro");
//
//        System.out.println(ankit.name);
//
//        Human rishab = new Human();

          Human pawan = new Human("Pawan Kumar", 22, 'M');

          pawan.printDetails();

          Human ankit = new Human("Ankit Yadav");
          ankit.printDetails();

          Human pawan2 = new Human(pawan);
          pawan2.printDetails();

          pawan2.name = "New Pawan";
          pawan2.printDetails();

          pawan.printDetails();

//          pawan.printPopulation();

        Human.printPopulation();

//          int[] a = {};
//        Arrays.toString(a);

//          String str = new String("Pawan");


    }





}
