package GettingStarted;

import java.util.ArrayList;
import java.util.List;

public class Armstrongnumberinagivenrange {
    public static void main(String[] args) {
        int start = 1, end = 1000000000;

        System.out.println(generate(start, end));
    }

    public static List<Integer> generate(int start, int end) {
        List<Integer> res = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (check(i)) {
                res.add(i);
            }
        }

        return res;
    }

    public static boolean check(int n) {
        int digits = (int) Math.log10(n) + 1;
        int t = n;
        int sum = 0;

        while (n != 0) {
            sum += (int) Math.pow(n % 10, digits);
            n /= 10;
        }

        return t == sum;
    }
}
