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

    public static void removeCycle(){
        //step 1. Detect cycle

        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next;  //+2
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        //step 2. Find meeting point
        
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //step 3. remove cycle last.next = null
        prev.next = null;

    }
    public static void main(String args[]){
        //LinkedList1 ll = new LinkedList1();
        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(3);
        head.next.next = temp;
        head.next.next.next = new Node(5);
        head.next.next.next.next = temp; 
        
        // ll.print();

        System.out.println(isCyclic());
        removeCycle();
        System.out.println(isCyclic());

    }
}
