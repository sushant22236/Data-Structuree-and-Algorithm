package Array;
import java.util.Scanner;

public class crud {
    public static void main(String[] args){

        //insertion of an element in an array
        int arr [] = {};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        // Read element
        System.out.println("\nEnter the index of the element you want to read: ");
        int index = sc.nextInt();
        if(index >= 0 && index < size){
            System.out.println("Element at index " + index + " is: " + arr[3]);
        } else {
            System.out.println("Invalid index");
        }

        // Update element
        System.out.println("Enter the index of the element you want to update: ");
        int updateIndex = sc.nextInt();
        if(updateIndex >= 0 && updateIndex < size){
            System.out.println("Enter the new value: ");
            int newValue = sc.nextInt();
            arr[updateIndex] = newValue;
            System.out.println("Element updated successfully.");
            System.out.println("Updated array elements are: ");
            for(int i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Invalid index");
        }

        // Delete element
        System.out.println("\nEnter the index of the element you want to delete: ");
        int deleteIndex = sc.nextInt();
        if(deleteIndex >= 0 && deleteIndex < size){
            for(int i = deleteIndex; i < size - 1; i++){
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("Element deleted successfully.");
            System.out.println("Updated array elements are: ");
            for(int i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Invalid index");
        }
    }
}