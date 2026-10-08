package Array;

public class multiplyarray {

    public static int[] multiplyarray(int arr[]) {

        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = { 2, 3, 5, 9, 12 };
        int newArray[] = multiplyarray(arr);
        printArray(newArray);
    }
}
