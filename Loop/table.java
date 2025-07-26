import java.util.Scanner;

public class table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input for which table is to be printed
        for(int i = n; i <= 10 *n; i += n){
            System.out.println(i);
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
    
}
