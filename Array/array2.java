package Array;

public class array2 {
    public static int largestNumber(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;

    }

    public static int smallestNuber(int number[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < number.length; i++){
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 13, 8, 9, 10, 11};
        int ds = smallestNuber(number);
        int sd = largestNumber(number);
        System.out.println(ds);
        System.out.println(sd);

    }
    
}
