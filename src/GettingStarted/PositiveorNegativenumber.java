package GettingStarted;

public class PositiveorNegativenumber {
    public static void main(String[] args) {
        int n = 112;

        System.out.println(check(n) > 0 ? "Positive" : "Negative");
    }

    public static int check(int n) {
        return (n > 0) ? 1 : -1;
    }
}
