package Review;

import java.util.Scanner;

public class Q18_走方格的方案数_求路径总数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println();
        }
    }
    public static int med(int n, int m){
        // 递归终止条件
        // m == 1 或者 n == 1
        if((n == 1&& m <=1) || (m == 1 && n >= 1)){
            return m+n;
        }
        // n > 1 && m > 1时
        return med(n - 1, m) + med(n, m - 1);
    }
}
