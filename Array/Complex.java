package Array;
import java.util.Scanner;

public class Complex {
    public static void sum(int r1, int i1, int r2, int i2){
        int a = r1 + r2;
        int b = i1 + i2;
        System.out.println(a+"+"+b+"i");
    }

    public static void difference(int r1, int i1, int r2, int i2){
        int a = r1 - r2;
        int b = i1 - i2;
        System.out.println(a+"+"+b+"i");
    }

    public static void mutliply(int r1, int i1, int r2, int i2){
        int a = r1*r2;
        int b = i1*i2;
        System.out.println(a+"+"+b+"i");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        sum(r1, i1, r2, i2);
        difference(r1, i1, r2, i2);
        mutliply(r1, i1, r2, i2);
        
    }
}
