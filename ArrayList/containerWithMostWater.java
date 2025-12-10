package ArrayList;

import java.util.ArrayList;

public class containerWithMostWater {

    //Two Pointer Approach
    public static int twoPointerApproach(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp -lp;
            int currentWater = ht*width;
            maxWater = Math.max(maxWater, currentWater);

            //Update height
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    //Brute Force Approach
    public static int maximumWater(ArrayList<Integer> height){
        int maximumWater = 0;
        //Brute force 
        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j < height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currentWater = ht * width;
                maximumWater = Math.max(maximumWater, currentWater);
            }
        }
        return maximumWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Maximum water that can be contained: " + maximumWater(height));
        System.out.println("Maximum water that can be contained (Two Pointer Approach): " + twoPointerApproach(height));
    }
}
