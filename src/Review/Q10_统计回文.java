package Review;

import java.util.Scanner;

public class Q10_统计回文 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int len = str1.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            StringBuffer str = new StringBuffer(str1);

            str.insert(i, str2);
            StringBuffer tmp = new StringBuffer(str);
            StringBuffer strResult = tmp.reverse();

            if(strResult.toString().equals(str.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}
