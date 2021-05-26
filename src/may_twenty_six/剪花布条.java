package may_twenty_six;

import java.util.Scanner;

public class 剪花布条 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s1 = scanner.next();
            String s2 = scanner.next();
            int count = 0;
            while(s1.contains(s2)){
                s1 = s1.replaceFirst(s2,""); //使用空字符替换原字符串中的ab
                count++;

            }
            System.out.println(count);
        }
    }
}
