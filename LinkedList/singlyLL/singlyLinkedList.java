package LinkedList.singlyLL;

public class singlyLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public singlyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;

    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;

    }

    public void insertAtPosition(int position, int data) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 1) {
            insertAtHead(data);
            return;
        }

        if (position == size + 1) {
            insertAtTail(data);
            return;
        }

        Node prevNode = head;
        for (int i = 1; i <= position - 2; i++) {
            prevNode = prevNode.next;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null || tail == null;
    }

    public void getHead() {
        if (head == null) {
            System.out.println("head does not exist");
        }
        System.out.println(head.data);
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("tail does not exists");
        }
        System.out.println(tail.data);
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        head = head.next;
    }

    public void deleteTail() {
        if (tail == null) {
            System.out.println("tail not exists");
            return;
        }

    }

    public void deleteAtPosition(int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;

    }

    public boolean serchElement(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;

        }
        return false;
    }

    public int findPosition(int target) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == target) {
                return position;
            }
            temp = temp.next;
            position++;
        }
        return -1;
    }

    public void updateAtPosition(int position, int newData) {
        Node temp = head;

        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        temp.data = newData;
    }

    public static void main(String args[]) {
        singlyLinkedList myList = new singlyLinkedList();
        if (myList.isEmpty()) {
            System.out.println("list is empty");
        }

        System.out.println("size of linked list = " + myList.getSize());

        myList.insertAtHead(10);
        myList.printLinkedList();

        myList.insertAtHead(20);
        myList.printLinkedList();

        myList.insertAtHead(30);
        myList.printLinkedList();

        myList.insertAtTail(100);
        myList.printLinkedList();

        myList.insertAtTail(110);
        myList.printLinkedList();

        myList.insertAtTail(120);
        myList.printLinkedList();

        myList.insertAtPosition(5, 105);
        myList.printLinkedList();

        System.out.println(myList.getSize());
        System.out.println(myList.isEmpty());
        myList.getHead();
        myList.getTail();
        System.out.println(myList.serchElement(500));
        System.out.println(myList.findPosition(105));
        myList.updateAtPosition(3, 15);
        myList.printLinkedList();
        myList.deleteAtPosition(3);
        myList.printLinkedList();
        myList.deleteHead();
        myList.printLinkedList();
    }
}
