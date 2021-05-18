package may_eighteen;

import java.util.Scanner;

public class 变态跳台阶 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(jumpStep(n));
        }
    }

    private static int jumpStep(int number) {
        // 对一个n阶的台阶有多少种跳法
        if(number == 0){
            return 0;
        }
        int a[] = new int[number];
        for (int i = 0; i < number; i++){
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += a[j];
            }
            a[i] = sum + 1;
        }
        return a[number - 1];
    }
}