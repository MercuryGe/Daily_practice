package may_fourteen;

import java.util.Scanner;

public class 计算字符串的距离 {
    public static  int calStringDistance(char[] charA, char[] charB){
        // 动态规划
        int[][] len = new int[charA.length + 1][charB.length + 1];

        for (int i = 0; i < len.length; i++) {
            len[i][0] = i;
        }
        for (int j = 0; j < len[0].length; j++) {
            len[0][j] = j;
        }

        for (int i = 1; i < len.length; i++) {
            for (int j = 1; j < len[0].length; j++) {
                if (charA[i - 1] == charB[j - 1]) {
                    len[i][j] = len[i - 1][j - 1];
                } else {
                    len[i][j] = Math.min(Math.min(len[i - 1][j], len[i - 1][j - 1]), len[i][j - 1]) + 1;
                }
            }
        }
        return len[len.length - 1][len[0].length - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String charA = scanner.nextLine();
            String charB = scanner.nextLine();
            System.out.println(calStringDistance(charA.toCharArray(), charB.toCharArray()));
        }
    }
}
