package may_ten;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {
    // 倒置字符串
    // 1、整个字符串进行逆置
    // 2、每个单词进行逆置

    public static void reverse(char[] array, int start, int end){
        while(start < end){
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] ch = s.toCharArray();
        // 1、整体进行逆置
        reverse(ch, 0, ch.length-1);

        // 2、分别定义一个i从0下标开始，j从i下表开始，找当前单词的末尾
        int i = 0; // 遍历ch数组
        while(i < ch.length){
            int j = i;
            while(j < ch.length && ch[j] != ' '){
                j++;
            }

            // 此时有两种情况
            // ① j < len 即ch数组没走完，遇到了空格
            if(j < ch.length){
                // 要进行逆置
                reverse(ch, i ,j-1);
                i = j + 1; // i走向下一个单词的首字母
            }else{
                // ② 数组走完了
                // 逆置最后一个单词数组，逆置后，i和j都已经等于数组长度
                reverse(ch, i ,j-1);
                i = j;
            }
        }
        String str = new String(ch);
        System.out.println(str);
    }
}
