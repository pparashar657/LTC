package LinkedList;

public class ReverseLL {

    public static Node reverseList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node smallAns = reverseList(head.next);

        Node temp = smallAns;

        while(temp.next != null) {
            temp = temp.next;
        }
        head.next = null;
        temp.next = head;
        return smallAns;
    }

    public static Node reverseListItr(Node head) {

        if(head == null) return null;

        Node prev = null;
        Node curr = head;
        Node nxt = head.next;

        while(nxt != null) {
            curr.next = prev;

            prev =curr;
            curr = nxt;
            nxt = nxt.next;
        }
        curr.next = prev;

        return curr;
    }


    public static void main(String[] args) {
        MyLL list = new MyLL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();

//        list.head = reverseList(list.head);
        list.head = reverseListItr(list.head);

        list.display();

    }

}
