package may_eleven;

import java.util.Scanner;

public class Demo2 {
    // 公共字串计算
    // 计算两个字符串的最大公共子串的长度，字符串不区分大小写
    // 状态转移方程：
    //      dp[i][j] —— 表示str1[i] 和 str2[i]为结尾的最长公共子串
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            System.out.println(getCommonStrLength(str1, str2));
        }
    }

    private static int getCommonStrLength(String str1, String str2) {
        // 使用动态规划

        // 初始化动态转移矩阵
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                dp[i][j] = 0;
            }
        }

        // 既然要找公共子串，那就要找到转移矩阵中两字符串相同的字符
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }  else {
                    dp[i][j] = 0;
                    // 要找的是最长公共子串，要求得连续，所以不连续的位置就直接置零，
                    //      不续接起那面的子串，与公共子序列不同
                }
            }
        }

        int max = 0;
        for(int i = 0; i <= str1.length(); i++){
            for (int j = 0; j <= str2.length(); j++) {
                if(max < dp[i][j]){
                    max = dp[i][j];
                }
            }
        }
        return max;

    }
}
