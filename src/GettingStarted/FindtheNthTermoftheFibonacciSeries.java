package GettingStarted;

import java.util.HashMap;

public class FindtheNthTermoftheFibonacciSeries {
    public static void main(String[] args) {
        HashMap<Integer, Long> memo = new HashMap<>();
        int n = 100;

        System.out.println(nthFibonacci(n, memo));
    }

    public static long nthFibonacci(int n, HashMap<Integer, Long> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n <= 1) {
            return n;
        }

        memo.put(n, nthFibonacci(n - 1, memo) + nthFibonacci(n - 2, memo));

        return memo.get(n);
    }
}
