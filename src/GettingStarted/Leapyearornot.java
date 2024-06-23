package GettingStarted;

public class Leapyearornot {
    public static void main(String[] args) {
        int n = 2100;

        System.out.println(check(n));
    }

    public static boolean check(int year) {
        if (year % 400 == 0) {
            return true;
        } else return year % 4 == 0 && year % 100 != 0;
    }
}
