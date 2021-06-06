package Review;

import java.util.Scanner;

public class Q25_参数解析 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // 遇到双引号的时候，要一直遍历，直到碰到第二个双引号
            // 才说明双引号中的参数遍历完了
            if(str.charAt(i) == '"'){
                do {
                    i++;
                }while (str.charAt(i) != '"');
            }
            // 碰到双引号以外的空格 count++
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        // 参数的个数等于 空格的个数+1
        System.out.println(count+1);


        int flag = 1;
        // 当碰到第一个双引号，flag变为0，当碰到第二个双引号flag变为1
        // 说明在flag==0时，我们是一直在遍历双引号中的参数
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '"'){
                flag ^= 1;
            }
            // 除了双引号中的空格和双引号，其他是字符都输出
            if(str.charAt(i) != ' ' && str.charAt(i) != '"'){
                System.out.print(str.charAt(i));
            }
            // 双引号里面的空格需要输出
            if(str.charAt(i) == ' ' && flag == 0){
                System.out.print(str.charAt(i));
            }
            // 碰到双引号以外的空格需要换行
            if(str.charAt(i) == ' ' && flag == 1){
                System.out.println();
            }

        }
    }
}
