package GettingStarted;

import java.util.ArrayList;
import java.util.List;

public class Primenumberwithinagivenrange {
    public static void main(String[] args) {
        int start = 10, end = 30;

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
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
