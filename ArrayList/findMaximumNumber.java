package ArrayList;

import java.util.ArrayList;

public class findMaximumNumber {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(11);
        list.add(5);
        list.add(3);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("max element is:"+ max);

    }
}
