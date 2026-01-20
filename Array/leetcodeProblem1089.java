package Array;

import java.util.Arrays;

public class leetcodeProblem1089 {

    public static void duplicateZero(int arr[]){
        int[] number = new int[arr.length];

        int a = 0;
        int b = 0;

        while(a < arr.length && b < arr.length){
            if(arr[a] == 0){
                number[b] = 0;
                b++;

                if(b < arr.length){
                    number[b] = 0;
                    b++;
                }
                a++;
            }else{
                number[b] = arr[a];
                a++;
                b++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = number[i];
        }


    }
    public static void main(String args[]){
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZero(arr);

        System.out.println(Arrays.toString(arr));
    }
}
