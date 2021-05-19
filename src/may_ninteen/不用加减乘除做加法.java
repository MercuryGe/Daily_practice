package may_ninteen;

import java.util.Scanner;

public class 不用加减乘除做加法 {
    public static int Add(int num1, int num2) {
        int result = 0;
        int carry = 0;
        do{
            result = num1 ^ num2; // 不产生进位的情况
            carry = (num1 & num2) << 1; // 产生进位的情况
            num1 = result;
            num2 = carry;
        }while (carry != 0); // 进位不为零则继续执行加法处理
        return  result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(Add(num1, num2));
        }
    }
}
