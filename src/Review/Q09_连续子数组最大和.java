package Review;

import java.util.Scanner;

public class Q09_连续子数组最大和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = array[0];
        int max = array[0];

        for (int i = 0; i < size; i++) {
            sum = getMax(sum + array[i], array[i]);
            if(sum >= max){
                max = sum;
            }
        }
        System.out.println(max);
    }

    private static int getMax(int a, int b) {
        return a > b ? a : b;
    }

}
