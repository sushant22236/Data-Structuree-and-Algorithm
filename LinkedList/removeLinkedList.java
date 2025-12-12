package LinkedList;

public class removeLinkedList {

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
    public static int size;

    public int removeNode(){
        if(size == 0){
            System.out.println("Linkedlist is empty");
            return -1;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public int removeFromLast(){
        int val = tail.data;
    }
    public static void main(String args[]){

    }
}
