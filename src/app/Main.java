package app;

public class Main {
    static int count;
    static int sum;
    static int[] arr;

    public static void main(String[] args) {
        arr = new int[]{1, 2, 3, 4, 5, 6};
        sum = 0;
        count = 0;

        for (int arrItem: arr) {
            sum += arrItem;
            count++;

            System.out.println(count + ") Num is " + arrItem + ", sum is " + sum);
        }

        System.out.println("Sum of numbers is " + sum);
    }
}
