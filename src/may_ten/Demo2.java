package may_ten;

import java.util.Scanner;

public class Demo2 {
    // 查找两个字符串a,b中的最长公共子串——遍历解法
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            // System.out.println(fingLongestSubstring(str1, str2));
            fingLongestSubstring(str1, str2);
        }
    }
    public static void fingLongestSubstring(String s1, String s2){
//        String max = str1.length() >= str2.length() ? str1 : str2;
//        String min = str1.length() >= str2.length() ? str2 : str1;
//        int l = 0;
//        String result = "";
//        for (int i = 0; i < min.length(); i++){
//             for (int j = i + 1; j < min.length(); j++){
//                 if (max.contains(min.substring(i,j)) && j - i > 1){
//                     l = j - 1;
//                     result = min.substring(i,j);
//                 }
//             }
//        }
//        return  result;
            String max = s1.length() >= s2.length()?s1:s2;
            String min = s1.length() >= s2.length()?s2:s1;
            int l = 0;
            String s ="";
            for(int i=0;i<min.length();i++){
                    for(int j=i+1;j<=min.length();j++){
                       if(max.contains(min.substring(i,j)) && j-i>l){
                        l=j-i;
                        s=min.substring(i,j);
                    }
                }
            }
            System.out.println(s);
        }
    }