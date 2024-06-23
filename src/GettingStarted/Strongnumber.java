package GettingStarted;

public class Strongnumber {
    public static void main(String[] args) {
        int n = 145;

        System.out.println(check(n));
    }

    public static boolean check(int n) {
        int t = n;
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum += factorial(rem);
            n /= 10;
        }

        return sum == t;
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
