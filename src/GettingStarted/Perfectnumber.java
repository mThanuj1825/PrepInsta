package GettingStarted;

public class Perfectnumber {
    public static void main(String[] args) {
        int n = 6;

        System.out.println(check(n));
    }

    public static boolean check(int n) {
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != 1) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}
