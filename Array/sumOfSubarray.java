package Array;

public class sumOfSubarray {
    public static void printSubarrays(int number[]){
        int max = Integer.MIN_VALUE;
        int currentsum = 0;
        for(int i=0; i<number.length; i++){
            //int start = i;
            for(int j=i; j<number.length; j++){
                //int end = j;
                currentsum = 0;
                for(int k=i; k<=j; k++){
                    //System.out.print(number[k]+" ");
                    currentsum += number[k];
                }
                if(max < currentsum){
                    max = currentsum;
                }
                System.out.println(currentsum);
                //System.out.println();
            }
        }
        System.out.print("Maximum Subarray Sum is: "+max);
    }

    public static void main(String[] args){

        int number[] = {2,4,6,8,10};
        printSubarrays(number);

    }
}
