package WorkingWithNumbers;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "110";

        System.out.println(binToDec(s));
    }

    private static int binToDec(String s) {
        int n = 0;

        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) == '1') {
                n += pow(2, s.length() - i - 1);
            }
        }

        return n;
    }

    private static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int half = pow(x, n / 2);

        if ((n & 1) == 0) {
            return half * half;
        }

        return half * half * x;
    }
}
