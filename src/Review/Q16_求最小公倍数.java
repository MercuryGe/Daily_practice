package Review;

import java.util.Scanner;

public class Q16_求最小公倍数 {
    // 求A 和 B的最小公倍数 = A*B/（A,B） ,其中(A,B)表示A和B的最大公约数

    // 根据欧几里得：
    // (A,B) = (A*B+B. B) = (B,A) = (B*K+A, A)
    // (10,6) = (4+6,6) = (4,6) = (4, 4+2) = (4,2) = (2+2,2) = (2,2) = (2,2+0) = (2,0) = 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // 求mn的最大公约数
       int mn = gbc(m, n);

        System.out.println(m * n / mn);
    }
    public static int gbc(int m, int n){
         if(m == n){
             return m;
         }
         if(m < n){
             int tmp = m;
             m = n;
             n = tmp;
         }
         int r;
         while((r = m % n) > 0){
             m = n;
             n = r;
         }
         return n;
    }
}
