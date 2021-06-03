package Review;

import java.util.Scanner;

public class Q19_Fibonacci数列 {
    // 输入一个正整数N
    // 输出一个最小的步数变成Fibonacci数

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        while(f2 < N){
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        int dis1 = N - f1;
        int dis2 = f2 - N;
        System.out.println(dis1 < dis2? dis1:dis2);
    }
}
