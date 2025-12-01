package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class swapTwoNumber {
    public static void swap(ArrayList <Integer> list, int indx1, int indx2){
        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);
    }
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(11);
        list.add(5);
        list.add(1);

        // int indx1 = 1;
        // int indx2 = 3;
        System.out.println(list);
        swap(list, 1, 3);
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);// ascending order

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);// descending order
    }
}
