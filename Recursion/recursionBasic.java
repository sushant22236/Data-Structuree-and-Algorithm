package Recursion;


public class recursionBasic {

    public static void printDec(int n){
        if( n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n){
        if( n == 0){    
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn =  n * fnm1;
        return fn;
    }

    public static int naturalNumber(int n){
        if(n == 1){
            return 1;
        }
        int a = naturalNumber(n-1);
        int natural = n + a;
        return natural;
    }

    public static int fibonnaci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fibonnaci(n-1);
        int fnm2 = fibonnaci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int i){
        int key = 5;        
        if(i == arr.length-1){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccurence(arr, i+1);


    }

    // public static int lastOccurence(int arr[], int i){
    //     int key = 5;
    //     if(i == arr.length-1){
    //         return -1;
    //     }

    //     return lastOccurence(arr, i+1);
  
    // }

    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }

        int xmn1 = power(x, n-1);
        int xn = x * xmn1;
        return xn;
    }
    public static void main(String args[]){
        System.out.println(power(2, 10));
    }
}
