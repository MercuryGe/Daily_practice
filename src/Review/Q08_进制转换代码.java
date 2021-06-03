package Review;

import java.util.Scanner;

public class Q08_进制转换代码 {
    // 给定一个十进制数M，以及需要转换的进制数N
    // 将时十进制数M转化为N进制数

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        StringBuilder s = new StringBuilder();
        String table = "0123456789ABCDEF";
        boolean flg = false;

        if(m < 0){
            m = -m;
            flg = true;
        }

        while(m != 0){
            s.append(table.charAt(m % n));
            m = m / n;
        }

        if(flg){
            s.append("-");
        }
        s.reverse();
        System.out.println(s);
    }





}
