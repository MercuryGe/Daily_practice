package Review;

import java.util.Scanner;

public class Q12_字符串转换整数 {
    public static int strToInt(String str){
        char[] chs = str.toCharArray();
        if(chs.length == 0) return 0;

        int flg = 1;
        if(str.charAt(0) == '-'){
            flg = -1;
            chs[0] = '0';
        }else if(chs[0] == '+'){
            flg = 1;
            chs[0] = '0';
        }
        int  sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(chs[i] < '0' || chs[i] > '9'){
                sum = 0;
                break;
            }
            sum = sum * 10 + chs[i] - '0';
        }
        return flg * sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(strToInt(str));


    }
}
