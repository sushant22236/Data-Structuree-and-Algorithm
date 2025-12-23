package Recursion;

public class friendPairing {

    public static int friendPairing(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }

        // kaam

        // for single 
        int fnm1 = friendPairing(n-1);

        // for pairing problem

        int fnm2 = friendPairing(n-1) * friendPairing(n-2);

        int fn = fnm1 + fnm2;
        return fn;

    }
    public static void main(String[] args){
        System.out.println(friendPairing(3));
    }
}
