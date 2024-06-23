package GettingStarted;

import java.util.ArrayList;
import java.util.List;

public class FindingPrimeFactorsofanumber {
    public static void main(String[] args) {
        int n = 14;

        System.out.println(primeFactors(n));
    }

    public static List<Integer> primeFactors(int n) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    res.add(i);
                }
                if (isPrime(n / i)) {
                    res.add(n / i);
                }
            }
        }

        return res;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
