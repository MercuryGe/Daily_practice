package may_eight;

import java.util.Scanner;

public class Demo4 {
    // 兔子在出身3个月后每个月都会生一只兔子
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int input = scanner.nextInt();
            System.out.println(getNumber(input));
        }
    }
    public static int getNumber(int month){
        if(month == 1 || month == 2) return 1;
        int templod = 1;
        int tempyoung = 1;
        int month1 = 1;
        int month2 = 0;
        for(int j = 4; j <= month; j++){
            // 在两个月大的兔子变成有生育能力的兔子
            templod += month2;
            // 一个月大的兔子变成了两个月大的兔子
            month2 = month1;
            // 有生育能力的兔子胜出了一个月大的兔子
            month1 = templod;
            // 当月所有无生育能力的兔子综合
            tempyoung = month1 + month2;
        }
        return templod + tempyoung;

    }
}
