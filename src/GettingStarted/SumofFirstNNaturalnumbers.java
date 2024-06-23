package GettingStarted;

public class SumofFirstNNaturalnumbers {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(sum(n));
    }

    public static int sum(int n) {
        return (n * (n + 1)) / 2;
    }
}
