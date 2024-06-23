package GettingStarted;

public class EvenorOddnumber {
    public static void main(String[] args) {
        int n = 122;

        System.out.println(check(n));
    }

    public static String check(int n) {
        if ((n & 1) == 1) {
            return "Odd";
        }

        return "Even";
    }
}
