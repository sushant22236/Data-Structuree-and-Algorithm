package Array;

public class findTargetIndex {
    public static int findTargetIndex(int nums[], int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {4,  5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Target Index: " + findTargetIndex(nums, target));
    }
}
