package GettingStarted;

public class Armstrongnumber {
    public static void main(String[] args) {
        int n = 153;

        System.out.println((check(n) ? "Armstrong" : "Not Armstrong") + " number");
    }

    public static boolean check(int n) {
        int digits = (int) Math.log10(n) + 1;
        int t = n;
        int sum = 0;

        while (n != 0) {
            sum += (int) Math.pow(n % 10, digits);
            n /= 10;
        }

        return sum == t;
    }
}
