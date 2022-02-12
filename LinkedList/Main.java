package LinkedList;

import java.util.Arrays;

public class Main {

//    static void printLinkedList(Node head) {
//        while(head != null) {
//            System.out.println(head.data);
//            head = head.next;
//        }
//    }

    public static void main(String[] args) {

//        Node<String> node1 = new Node<>("Ankit");
//
//        Node<String> node2 = new Node<>("Pawan");
//
//        node1.next = node2;
//
//        printLinkedList(node1);

        MyLL list = new MyLL();
        list.insert(0,100);
        list.insert(10);
        list.insert(2, 30);

        list.insertFirst(40);
        list.insert(3, 70);
        list.insertFirst(50);

        list.display();

        list.remove();
        list.removeLast();
        list.display();
        list.remove(0);
        list.insert(0,200);
        list.remove(2);
        list.insert(3,400);

        list.display();
        System.out.println(list);


    }

}
