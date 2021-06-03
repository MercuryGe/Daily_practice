package Review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q15_两种排序方法 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 从字符流中读取文本并且缓存
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bi.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = bi.readLine();
        }
        // 判断
        if(isSortZidian(str) && isSortLength(str)){
            System.out.println("both");
        }else if(isSortZidian(str)){
            System.out.println("lexicographically");
        }else if(isSortLength(str)){
            System.out.println("lengths");
        }else {
            System.out.println("none");
        }
    }

    public static boolean isSortZidian(String[] str){
        for (int i = 0; i < str.length - 1; i++) {
            // 用当前的字符串和后一个字符串比较，如果i的字典序大于i+1的字典序，直接返回false;
            if(str[i].compareTo(str[i+1]) > 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isSortLength(String[] str){
        for (int i = 0; i < str.length - 1; i++) {
            // 如果当前字符串的长度大于后一个字符串的长度，那么排序混乱，返回false
            if(str[i].length() > str[i+1].length()){
                return false;
            }
        }
        return true;
    }
}
