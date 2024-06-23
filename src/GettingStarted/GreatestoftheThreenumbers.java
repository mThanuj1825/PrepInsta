package GettingStarted;

public class GreatestoftheThreenumbers {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 8;

        System.out.println(max(a, b, c));
    }

    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        }

        return c;
    }
}
