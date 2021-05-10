package may_ten;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            if (num > 0){
                System.out.println(drinkSoda(num));
            }
        }
    }
    public static int drinkSoda(int num){
        int remainder = 0;  // 余数
        int count = 0; // 可以兑换的次数
        int drink = 0; // 可以喝到的个数
        while(num >= 3){// TODO: 终止条件
            remainder = num % 3;
            num = num / 3;
            count = num;
            drink += num;
            num = num + remainder;
        }
        if(num == 2) {
            count++;
            drink++;
        }
        // System.out.println(count);
        // System.out.println(drink);
        return drink;
    }
}
