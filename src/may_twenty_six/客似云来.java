package may_twenty_six;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 客似云来 {

    private static Map<Integer, Long> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int from = scanner.nextInt();
            int to   = scanner.nextInt();
            long count = 0;
            for (int i = from; i <= to; i++) {
                count = count + getPersonCount(i);
            }
            System.out.println(count);
        }
    }

    private static long getPersonCount(int day) {
        if(day == 1) return 1;
        if(day == 2) return 1;
        long perPreNum = 1;
        long preNum = 1;
        long result = 0;
        if(map.containsKey(day)){
            return map.get(day);
        }else{
            for (int i = 3; i <= day ; i++) {
                result = perPreNum + preNum;
                map.put(i, result);
                perPreNum = preNum;
                preNum = result;
            }
            return result;
        }


    }


}
