package Array;

public class printSubarray {
    public static void printSubarrays(int number[]){
        int ts = 0;
        for(int i=0; i<number.length; i++){
            //int start = i;
            for(int j=i; j<number.length; j++){
                //int end = j;
                for(int k=i; k<=j; k++){
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+ts);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        printSubarrays(number);
    }   
    
}
