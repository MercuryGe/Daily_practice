package may_eleven;

import java.util.Scanner;

public class 进制转换 {
    // 进制转化
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            // 存放结果
            StringBuilder result = new StringBuilder();

            // 给一个数组用于映射
            String table = "0123456789ABCDEF";

            boolean flag = false;
            if(m < 0){
                m = -m;
                flag = true;
            }

            while(m != 0){
                result.append(table.charAt(m % n));
                m = m / n;
            }
            if(flag){
                result.append("-");
            }
            result.reverse();
        }
    }
}
