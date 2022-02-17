package LinkedList;

public class MyLL {

    Node head;
    Node tail;
    int size;

    private void insertFirstNode(Node newNode) {
        this.head = newNode;
        this.tail = newNode;
    }

    // Add data to last
    public void insert(int data) {

        Node newNode = new Node(data);

        if (this.head == null) {
            insertFirstNode(newNode);
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            insertFirstNode(newNode);
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insert(int index, int data) {

        if(index < 0 || index > size) {
            System.out.println("Index is not valid..");
            return;
        }

        if(index == 0) {
            insertFirst(data);
            return;
        }

        if(index == size) {
            insert(data);
            return;
        }

        Node newNode = new Node(data);
        Node prev = get(index-1);
        newNode.next = prev.next;
        prev.next = newNode;

        size++;
    }

    // It removes from front
    public int remove() {

        if(isEmpty()) {
            System.out.println("List is empty cannot remove");
            return -1;
        }
        int data = head.data;
        if(head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;

        return data;
    }

    public int removeLast() {
        if(isEmpty()) {
            System.out.println("List is empty cannot remove");
            return -1;
        }
        int data = tail.data;
        if(head == tail) {
            head = null;
            tail = null;
        } else {
            Node prev = get(size-2);
            prev.next = null;
            tail = prev;
        }
        size--;
        return data;
    }

    public int remove(int index) {

        if(index < 0 || index >= size) {
            System.out.println("Index is not valid..");
            return -1;
        }

        if(index == 0) {
            return remove();
        }

        if(index == size-1) {
            return removeLast();
        }

        Node prev = get(index-1);
        int data = prev.next.data;
        prev.next = prev.next.next;
        size--;

        return data;
    }

    public Node get(int index) {

        if(index < 0 || index >= size) {
            System.out.println("Index is not valid..");
            return null;
        }

        Node temp = head;

        while(index-- > 0) {
            temp = temp.next;
        }
        return temp;
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder ans = new StringBuilder();
        while(temp != null) {
            ans.append(temp.data).append(" -> ");
            temp = temp.next;
        }
        ans.append("null");
        return ans.toString();
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
