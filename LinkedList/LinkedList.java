package LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step 1. -> create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2. -> newNode next = head
        newNode.next = head;
        //step 3. -> head = newNode
        head = newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null ){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("Linkedlist is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    public int searchNode(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        } else {
            return idx + 1;
        }
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // ll.head.next = new Node(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();

        System.out.println(ll.searchNode(3));
        System.out.println(ll.searchNode(10));

        System.out.println(ll.recursiveSearch(4));
        System.out.println(ll.recursiveSearch(99));
    }
}
