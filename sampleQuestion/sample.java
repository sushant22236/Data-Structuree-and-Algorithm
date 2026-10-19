import java.util.*;

public class sample {
    public static void main(String[] args) {
        // Count c = new Count();
        // System.out.println(c.countDigit());

        // sum s = new sum();
        // System.out.println(s.sumOfDigit());

        reverse r = new reverse();
        System.out.println(r.reverseOfDigit());

        palindrome p = new palindrome();
        System.out.println(p.palindrome());

        prime pm = new prime();
        System.out.println(pm.checkPrime());
    }
}

class Count {
    public int countDigit() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            return -1;
        } else {
            while (n > 0) {
                count++;
                n = n / 10;
            }
            return count;
        }
    }
}

class sum {
    public int sumOfDigit() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }
}

class reverse {
    public int reverseOfDigit() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        if (n < 0) {
            return -1;
        }
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
}

class palindrome {
    public boolean palindrome() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (original == rev) {
            return true;
        } else {
            return false;
        }
    }
}

class prime {
    public boolean checkPrime() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;

        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}

class factorial {
    public int factorial() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 0; i < n; i++) {

        }
    }
}