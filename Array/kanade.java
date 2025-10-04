package Array;

public class kanade {

    public static void kanadeAlgorithm(int number[]){
        int currentsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            currentsum += number[i];
            if(currentsum < 0){
                currentsum = 0;
            }
            max = Math.max(currentsum, max);
        }
        System.out.println("Maximum Subarray Sum is: "+max);
    }

    public static void main(String[] args){
        int number[] = {2,-4,-6,8,10};
        kanadeAlgorithm(number);
    }
    
}
