package Sorting;

public class insertionSort {

    public static void insertionSort(int number[]){
        for(int i = 1; i < number.length; i++){
            int curr = number[i];
            int prev = i-1;

            //finding out the correct position to insert
            while(prev >= 0 && number[prev] > curr){
                number[prev+1] = number[prev];
                prev--;
            }
            //insertion
            number[prev+1] = curr;
        }
    }

    public static void printArray(int number[]){
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int number[] = {5,8,6,7,3,4,9};
        System.out.println(number.length);
        insertionSort(number);
        printArray(number);
    }
}
