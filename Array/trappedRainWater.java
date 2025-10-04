package Array;

public class trappedRainWater {
    public static int trappedRainWater(int height[]){
        int n = height.length;
        //calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        //calculate trapped water
        int trappedwater = 0;
        for(int  i=0; i<n; i++){
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            trappedwater = trappedwater + waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Rain Water is: " + trappedRainWater(height));
    }
}
