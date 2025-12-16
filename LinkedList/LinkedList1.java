package LinkedList;

public class LinkedList1 {
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

    public static boolean isCyclic(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;          //+1
            fast = fast.next.next;     //+2
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        //LinkedList1 ll = new LinkedList1();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head; 
        
        // ll.print();

        System.out.println(isCyclic());

    }
}
