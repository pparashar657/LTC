package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class InbuildLL {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(2, 100);
        System.out.println(list);

    }

}
