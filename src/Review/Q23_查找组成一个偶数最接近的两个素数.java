package Review;

import java.util.Scanner;

public class Q23_查找组成一个偶数最接近的两个素数 {
    // 题目描述：
    // 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数又跟多种情况，
    // 本题目要求输出组成指定偶数的两个素数差值最小的素数对

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int half = n / 2;  // 从中间开始，是为了让两个数的差值最小
        for (int i = half; i > 0; i++) {
            if(isPrime(i) && isPrime(n - i)){
                System.out.println(n - i);
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isPrime(int m){
        for (int i = 2; i * i < m; i++) {
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }
}
