package may_ten;

import java.util.Scanner;

public class Demo7 {
    // 输出字符串str中连续最长的数字串
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String cur = "";
        String ret = "";
        int i = 0;
        for (; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch > '0' && ch <= '9'){
                cur = cur + ch + "";
            }else{
                if(cur.length() > ret.length()){
                    ret = cur;
                }else{
                    cur = "";
                }
            }
        }
        if(i == str.length() && cur.length() > ret.length()){
            ret = cur;
        }
        System.out.println(ret);
    }
}
