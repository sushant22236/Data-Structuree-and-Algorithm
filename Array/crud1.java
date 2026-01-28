package Array;

import java.util.Scanner;

public class crud1 {

    public static int[] insertArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int[] deleteElement(int arr[], int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void updateElement(int arr[], int index, int newValue) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }
        arr[index] = newValue;
    }

    public static void searchElement(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void readElement(int arr[], int index){
        if(index >= 0 && index < arr.length){
            System.out.println("Element at index "+ index + " is "+ arr[index]);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = insertArray();

        //searchElement(arr, 2);
        readElement(arr, 3);

    }
}
