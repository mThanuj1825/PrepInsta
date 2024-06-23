package GettingStarted;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesuptonthterm {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(generate(n));
    }

    public static List<Integer> generate(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        res.add(1);

        int first = 0, second = 1;
        for (int i = 0; i < n - 2; i++) {
            int third = second + first;
            res.add(third);
            first = second;
            second = third;
        }

        return res;
    }
}
