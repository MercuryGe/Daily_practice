package Review;

import java.util.Scanner;

public class Q20_机器人走方格 {
    // 递归思想，每次走一格，要么向右，要么向下
    // 向右就变成在（X-1）Y矩阵中求、
    // 向下就变成在X（Y-1）举证中求。
    // 当整个矩阵中只有一行 或 一列的时候只有一种走法
    public static int countWays(int x, int y){
        if(x == 1 || y == 1) return 1;

        return countWays(x - 1, y) + countWays(x, y - 1);
    }


    // 动态规划思想
    public static  int countWays2(int x, int y){
        int[][] dp = new int[x][y];
        dp[0][0] = 1;

        // 设置第一行和第一列都为一，因为到边界时，只有一种走法
        // 设置第一列的都为1
        for (int i = 1; i < x; i++) {
            dp[i][0] = dp[i-1][0];
        }
        // 设置第一行都为1
        for (int j = 1; j < y; j++) {
            dp[0][j] = dp[0][j-1];
        }
        //
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[x-1][y-1];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(countWays(x, y));
        }
    }
}
