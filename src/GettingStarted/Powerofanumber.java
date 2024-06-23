package GettingStarted;

public class Powerofanumber {
    public static void main(String[] args) {
        float x = 3.3f;
        int n = 2;

        System.out.println(pow(x, n));
    }

    public static double pow(float x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double half = pow(x, n / 2);

        if ((n & 1) == 0) {
            return half * half;
        }

        return x * half * half;
    }
}
