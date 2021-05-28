package may_twenty_eight;

import java.util.ArrayList;
import java.util.Scanner;

public class 年会抽奖 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            // count无人获奖，每个人都没有抽到自己的名字有多少种情况
            // probability 无放回的方式，总共有多少种抽奖的可能性
            float result = (count(n))/probability(n)*100;
            System.out.println(String.format("%.2f", result) + "%");
        }

    }

    private static float probability(int n) {
        // 求阶乘
        if(n == 0){
            return  1;
        }else{
            return n*probability(n-1);
        }
    }

    private static float count(int n) {
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }else {
            return (n-1)*(count(n-1) + count(n-2));
        }
    }
}
