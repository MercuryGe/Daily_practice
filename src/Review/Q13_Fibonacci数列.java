package Review;

import java.util.Scanner;

public class Q13_Fibonacci数列 {
    // 输入一个数N
    // 求N变为斐波那契数列中的数需要几步
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        while(f2 < n){
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        // 循环结束时会得到一个 f1 < n <= f2
        int min = Math.min(n - f1, f2 - n);
        System.out.println(min);
    }
}
