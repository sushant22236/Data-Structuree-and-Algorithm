import java.util.Scanner;

public class printReverseOfNumber {
    public static void main (String[] args){
        Scanner st = new Scanner(System.in);
        int n = st.nextInt(); 
        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        System.out.println(); // To move to the next line after printing the reverse
        st.close();
    }
    
}
