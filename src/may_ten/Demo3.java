package may_ten;

import java.util.Scanner;

public class Demo3 {
    // 动态规划解法
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            getCommenStrLength(s1,s2);
        }
    }
    public static void getCommenStrLength(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[][] dp = new int[c1.length+1][c2.length+1];
        int max = 0;
        int num = 0;
        StringBuffer sb = new StringBuffer();
        // 得到动态序列
        for(int i = 1; i < c1.length; i++){
            for (int j = 0; j < c2.length; j++) {
                if(c1[i-1] == c2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
            }
        }
        // 根据题意，得到dp序列后，根据dp定位字符串位置
        if(c1.length < c2.length){
            for (int i = 0; i < c1.length; i++) {
                for (int j = 0; j < c2.length; j++) {
                    if(dp[i][j] > max){
                        max = dp[i][j];
                        num =i;
                    }
                }
            }
        }
    }
}
