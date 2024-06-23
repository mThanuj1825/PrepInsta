package GettingStarted;

public class Factorialofanumber {
    public static void main(String[] args) {
        int n = 20;

        System.out.println(factorial(n));
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return n;
        }

        return n * factorial(n - 1);
    }
}
