package GettingStarted;

public class Sumofdigitsofanumber {
    public static void main(String[] args) {
        int n = 123;

        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + sum(n / 10);
    }
}
