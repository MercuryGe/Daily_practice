package june_eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class 电话号码 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            ArrayList<String> arrayList = new ArrayList<>();
            HashSet<String> result = new HashSet<>();
            for(int i = 0 ; i < num; i++){
                arrayList.add(scan.next());
            }
            String str = "";
            for (int i = 0; i < arrayList.size(); i++) {
                str = arrayList.get(i);
                // 判断当前str是否为纯数字(顺便去掉所有-)
                str = isAllNumber(str);
                // 将所有字符转换成数字
                str = transToNum(str);
                // 去掉所有的不
                // 存放进HashSet中
                result.add(str);
            }
            // 将去重后的拿出来，从小到大排序
            StringBuffer sb = new StringBuffer(result.size());
            for (String s : result) {
                sb.append(s);
                sb.append(' ');
            }
            // 以空格分成多个字符数组
            String sbToString = sb.toString();
            String[] splitUseSpace = sbToString.split(" ");
            // 排序
            Arrays.sort(splitUseSpace);
            // 在第三个位置后加 - 符号
            String[] addSeparator = addSeparator(splitUseSpace);
            // 输出
            for (String s : addSeparator) {
                System.out.println(s);
            }
//            System.out.println();

//            System.out.println(Arrays.toString(addSeparator));
        }
    }

    private static String[] addSeparator(String[] splitUseSpace) {
        String[] strings = new String[splitUseSpace.length];
        int i = 0;
        for (String s : splitUseSpace) {
            s = addseparator(s);
            strings[i] = s;
            i++;
//            System.out.println(s);
        }
        return strings;
    }

    private static String addseparator(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if(i == 2){
                sb.append('-');
            }
        }
//        System.out.println(sb);
        return sb.toString();
    }


    private static String transToNum(String str) {
        char[] arrStr = str.toCharArray();
        ArrayList<Character> result = new ArrayList<>();
        for (char s : arrStr) {
            if(s == 'A' || s == 'B' || s == 'C'){
                result.add('2');
            }else if(s == 'D' || s == 'E' || s == 'F'){
                result.add('3');
            }else if(s == 'G' || s == 'H' || s == 'I'){
                result.add('4');
            }else if(s == 'J' || s == 'K' || s == 'L'){
                result.add('5');
            }else if(s == 'M' || s == 'N' || s == 'O'){
                result.add('6');
            }else if(s == 'P' || s == 'Q' || s == 'R' || s == 'S'){
                result.add('7');
            }else if(s == 'T' || s == 'U' || s == 'V'){
                result.add('8');
            }else if(s == 'W' || s == 'X' || s == 'Y' || s == 'Z'){
                result.add('9');
            }else if(s != '[' && s !=']' && s != ',' && s != ' '){
                result.add(s);
            }
        }
        // 去掉所有除数字以外的字符
        StringBuilder stringBuffer = new StringBuilder();
        for (char s : result) {
            if(s >= '0' && s <= '9'){
                stringBuffer.append(s);
            }
        }
        return stringBuffer.toString();
    }


    private static String isAllNumber(String str) {
//        char[] arrStr = new char[str.length()];
        char[] arrStr = str.toCharArray();
        ArrayList<Character> result = new ArrayList<>();
        for (char s : arrStr) {
            if(s >= '0' && s <= '9'){
                result.add(s);
            }else if((s < '0' || s > '9') && s != '-'){
                result.add(s);
            }
        }


        return result.toString();
    }
}
