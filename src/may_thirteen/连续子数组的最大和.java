package may_thirteen;

import java.util.Scanner;

public class 连续子数组的最大和 {
    // 动态规划
    // 状态方程式： max(dp[i]) = getMax (max(dp[i - 1]) + arr[i], arr[i])
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        int sum = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
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
