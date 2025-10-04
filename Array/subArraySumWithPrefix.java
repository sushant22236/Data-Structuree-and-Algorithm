package Array;

public class subArraySumWithPrefix {

    public static void printSubarrays(int number[]){
        int max = Integer.MIN_VALUE;
        int currentsum = 0;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        //Calculate Prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        
        }

        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                //formula to calculate subarray sum
                currentsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(max < currentsum){
                    max = currentsum;
                }
                System.out.println(currentsum);
            }
        }
        System.out.print("Maximum Subarray Sum is: "+max);
    }
    public static void main(String[] args){
        int number[] = {2,4,6,8,10};
        printSubarrays(number);
    }
    
}
