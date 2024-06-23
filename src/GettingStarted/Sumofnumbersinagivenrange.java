package GettingStarted;

public class Sumofnumbersinagivenrange {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;

        System.out.println(sum(start, end));
    }

    public static int sum(int start, int end){
        int left = ((start - 1) * (start)) / 2;
        int right = (end * (end + 1)) / 2;

        return right - left;
    }
}
