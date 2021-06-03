package june_three;

import java.util.Scanner;


public class 发邮件 {

    // 递推公式：f（n）=(n-1)*(f(n-1)+f(n-2))
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            long sum = count(num);
            System.out.println(sum);
        }
    }

    private static long count(int num) {
        if(num == 1){
            return 0;
        }else if(num == 2) {
            return 1;
        }else {
            return (num - 1) * (count(num - 1) + count(num - 2));
        }


    }
}
