package may_twenty_four;

import java.util.Scanner;

public class 分解因数 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            if (isPrimer(n)) {
                System.out.println(n + " = " + n);
                continue;
            }
            System.out.print(n + " = ");
            int i = 2, len = n / 2;
            for (; i <= len; ) {
                if (n % i == 0) {
                    System.out.print(i);
                    n /= i;
                    if (n / i != 0) System.out.print(" * ");
                    else break;
                } else i++;
            }
            System.out.println();
        }
    }

    public static boolean isPrimer(int n) {
        for (int i = 2; i <= Math.pow(n, 0.5); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
