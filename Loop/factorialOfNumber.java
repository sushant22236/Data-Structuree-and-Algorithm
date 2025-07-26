import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
            
        } // Input number for which factorial is to be calculated
        System.out.println("The factorial of " + n + " is: " + fact);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
