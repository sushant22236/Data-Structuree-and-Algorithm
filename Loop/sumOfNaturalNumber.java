public class sumOfNaturalNumber {
    public static void main(String[] args) {
        int n = 10; // Example input
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
