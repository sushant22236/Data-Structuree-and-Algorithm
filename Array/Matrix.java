package Array;

import java.util.Scanner;

public class Matrix {

    public static boolean search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key is found at "+ i+","+ j+ " ");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void largestInRow(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
            System.out.println("Largest in row " + i + " is " + largest);
        }
    }

    public static void largestInMatrix(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest in the matrix is " + largest);
    }


    public static void smallestInMatrix(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest in the matrix is " + smallest);
    }
    public static void main(String[] args){

        int matrix[][] = new int[3][3];
        
        int n = matrix.length; //no. of rows
        int m = matrix[0].length; //no. of columns

        Scanner sc = new Scanner(System.in);

        //input
        for(int i = 0; i < n; i++){ //rows
            for(int j = 0; j < m; j++){ //columns
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < n; i++){ //rows
            for(int j = 0; j < m; j++){ //columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(matrix.length);
        search(matrix, 8);
        largestInRow(matrix);
        largestInMatrix(matrix);
        smallestInMatrix(matrix);
    }
}
