package may_eleven;

import java.util.Scanner;

public class Demo3 {
    // 公共子序列
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            System.out.println(getCommonStrLenGth(str1, str2));
        }
    }

    private static int getCommonStrLenGth(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        //初始化动态转移矩阵
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                dp[i][j] = 0;
            }
        }

        // 根据题意将子串中相等的放进来 /放进的是此时子串的最长长度
        for (int i = 1; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
