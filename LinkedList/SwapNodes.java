package LinkedList;

public class SwapNodes {

    public static void swapNodes(MyLL list, int data1, int data2) {

        Node tempNode = new Node(-1);
        tempNode.next = list.head;
        list.head = tempNode;

        Node temp = list.head;
        Node p1=null,p2=null,n1=null,n2=null;

        while (temp.next != null) {
            if(temp.next.data == data1) {
                p1 = temp;
                n1 = p1.next;
            } else if(temp.next.data == data2) {
                p2 = temp;
                n2 = p2.next;
            }
            temp = temp.next;
        }
        temp = n2.next;

        p1.next = n2;
        p2.next = n1;
        n2.next = n1.next;
        n1.next = temp;
        list.head = list.head.next;
    }

    public static void main(String[] args) {
        MyLL list = new MyLL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();

        swapNodes(list, 10, 40);

        list.display();

    }

}
