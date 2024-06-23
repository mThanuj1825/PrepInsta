package GettingStarted;

import java.util.ArrayList;
import java.util.List;

public class Factorsofanumber {
    public static void main(String[] args) {
        int n = 28;

        System.out.println(factors(n));
    }

    public static List<Integer> factors(int n) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                res.add(n / i);
            }
        }

        return res;
    }
}
