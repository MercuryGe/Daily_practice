package may_eleven;

import java.util.Scanner;

public class Demo1 {
    // 反转字符串
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            reverse(str, 0, str.length()-1);
        }
    }

    private static void reverse(String str, int start, int end) {
        char[] ch = str.toCharArray();
        while(start < end){
            char tmp = ch[start];
            ch[start] = ch[end];
            ch[end] = tmp;
            start++;
            end--;
        }
        String result = new String(ch);
        System.out.println(ch);

    }
}
