package WorkingWithNumbers;

public class HighestCommonFactor {
    public static void main(String[] args) {
        int a = 6, b = 4;

        System.out.println(hcf(a, b));
    }

    public static int hcf(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }
}
