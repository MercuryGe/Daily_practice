package june_two;

import java.util.Scanner;

public class 最长公共子序列 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str1 = scan.next();
            String str2 = scan.next();
            LongestCommonSeq(str1, str2);
        }
    }
    public static void LongestCommonSeq(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 == 0 || len2 == 0){
            System.out.println(0);
            return;
        }

        int[][] dp = new int[len1 + 1][len2 + 1];
        // 在dp数组中找到最大的
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(str1.charAt(i - 1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[len1][len2]);
    }
}
