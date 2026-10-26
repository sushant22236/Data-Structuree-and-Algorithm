package Array;

import java.util.*;

public class crud3 {
    public static void main(String args[]) {
        createArray ca = new createArray();
        ca.createArray();

    }
}

class createArray {
    public int[] createArray() {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        updateArray(arr, 2, 90);
        deleteArray(arr, 1);
        searchElement(arr, 2);
        return arr;
    }

    public void printArray(int arr[]) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public int[] updateArray(int[] arr, int index, int value) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid");
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = value;
            }
        }
        printArray(arr);
        return arr;

    }

    public int[] deleteArray(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            } else {
                newArr[j] = arr[i];
                j++;
            }
        }
        printArray(newArr);
        return newArr;

    }

    public void searchElement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (i == value) {
                System.out.println(arr[i]);

            }
        }
        // printArray(arr);
        // return arr;

    }

}
