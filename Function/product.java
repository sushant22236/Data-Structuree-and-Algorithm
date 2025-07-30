import java.util.Scanner;

public class product {
    public static int multiply(int n , int x){
        int product = n*x;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int prod = multiply(n, x);
        System.out.println(prod);
        sc.close();
    }
    
}
