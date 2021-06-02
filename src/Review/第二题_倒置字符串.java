package Review;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 第二题_倒置字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            char[] ch = str.toCharArray();
            // 整体逆置
            reseverStr(ch, 0, ch.length-1);
            int i = 0;
            while(i < ch.length -  1){
                int j = i;
                while(j < ch.length - 1 && ch[j] != ' '){
                    j++;
                }
                if(j < ch.length-1){
                    reseverStr(ch, i, j-1);
                    i = j + 1;
                }else{
                    reseverStr(ch, i, j-1);
                    i = j; // 此时i已经等于len了
                }
            }
            String result = new String(ch);
            System.out.println(result);
        }
    }

    private static void reseverStr(char[] array, int start, int end) {
        while(start < end){
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
    }




}
