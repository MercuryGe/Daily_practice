package june_three;

import java.util.Scanner;

public class 最长上升子序列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int len = scanner.nextInt();
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(findLongest(array, len));
        }
    }

    private static int findLongest(int[] array, int len) {
        if(array == null || len <= 0 || array.length != len) return 0;

        // dp[i] 表示以i为结尾的最长递增子序列的长度
        int[] dp =  new int[len];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < len; i++) {
            dp[i] = 1;
            for (int j = i-1; j >= 0; j--) {
                if(array[i] > array[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if(max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}
