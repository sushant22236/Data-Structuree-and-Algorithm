package Sorting;

public class bubbleSort {
    public static void bubbleSort(int number[]){
        for(int turns = 0; turns < number.length-1; turns++){
            for(int j = 0; j < number.length-1-turns; j++){
                if(number[j] > number[j+1]){
                    //swap
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSortInDecendingOrder(int number[]){
        for(int turn = number.length-1; turn > 0; turn--){
            for(int j = number.length-1-turn; j >= 0; j-- ){
                if(number[j] < number[j+1] ){
                    //swap
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }

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
        //bubbleSort(number);
        bubbleSortInDecendingOrder(number);
        printArray(number);
    }
}
