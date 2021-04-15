package april_fifteen;

import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main1(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            //longestDigitString(str);
            System.out.println(longestDigitString(str));
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,2,5,4,2};
        int result = MoreThanHalfNum_Solution(array);
        System.out.println(result);
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        //必须考虑非法输入保证健壮性
        if(array == null || array.length <= 0)
            return 0;
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int i = 0; i < array.length; i++) {
            if(!count.containsKey(array[i])) {
                count.put(array[i], 1);
            }
            else {
                int value = count.get(array[i]);
                count.put(array[i], ++value);
            }
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(entry.getValue() > array.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
    private static String longestDigitString(String str) {
        int max = 0, count = 0, end = 0;
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                count++;
                if(max < count){
                    max = count;
                    end = i;
                }
            }else{
                count = 0;
            }
        }
        return str.substring(end-max+1,end+1);
    }
}
