package LinkedList;

public class searchLinkedList {
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

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;

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
        searchLinkedList ll = new searchLinkedList();
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(7);
        ll.addFirst(9);
        ll.addFirst(11);
        System.out.println(ll.searchNode(7));
        System.out.println(ll.searchNode(12));
        System.out.println(ll.recursiveSearch(5));
        System.out.println(ll.recursiveSearch(15));
    }
}
