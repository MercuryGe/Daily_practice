package Review;

import java.util.Scanner;

public class Q06_最长的数字串 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();

            String cur = "";
            String ret = "";

            int i = 0;
            for (; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch >= '0' && ch <= '9'){
                    cur = cur + ch +""; // 任何一个东西拼接一个字符串，就会成为一个字符串
                }else{
                    if(cur.length() > ret.length()){
                        ret = cur;
                    }else {
                        cur = ""; // 说明这一段不是我们想要的，将cur字符串重新置为空字符串
                    }
                }
            }
            if(i == str.length() && cur.length() > ret.length()){
                ret = cur;
            }
            System.out.println(ret);
        }
    }


}
