package may_thirteen;

import april_twenty_one.First;

import java.util.HashMap;
import java.util.Scanner;

public class 找出字符串中第一个只出现一次的字符 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int result = FirstNotRepeatingChart(str);
            if(result == -1){
                System.out.println(-1);
            }else{
                System.out.println(str.charAt(result));
            }
        }
    }

    private static int FirstNotRepeatingChart(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
