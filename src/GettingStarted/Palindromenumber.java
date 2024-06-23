package GettingStarted;

public class Palindromenumber {
    public static void main(String[] args) {
        int n = 1211;

        System.out.println(check(n));
    }

    public static boolean check(int n) {
        return n == reverse(n);
    }

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        return rev;
    }
}
