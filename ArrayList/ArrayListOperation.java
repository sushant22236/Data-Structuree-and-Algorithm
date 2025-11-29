package ArrayList;

import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //Add operation O(1)
        list.add(1);
        list.add(2);    
        list.add(3);
        list.add(4);
        list.add(4,78); // O(n)
        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // //get operation O(1)
        // int element = list.get(2);
        // System.out.println("Element at index 2: " + element);

        // //remove operation O(n)
        // list.remove(2);
        // System.out.println(list);

        //set operation O(n)
        // list.set(4, 10);
        // System.out.println(list);

        //contain operation O(n)
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));
    }
}
