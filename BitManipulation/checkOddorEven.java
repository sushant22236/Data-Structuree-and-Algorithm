package BitManipulation;

public class checkOddorEven {
    public static boolean checkOddorEven(int n){
        int bitwise = 1;
        if((n & bitwise) == 0){
            System.out.println("Even Number");
            return true;
        }else{
            System.out.println("Odd Number");
            return false;
        }
    }
    public static void main(String[] args){
        checkOddorEven(5);
        checkOddorEven(7);
        checkOddorEven(10);
    }
}
