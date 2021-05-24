package may_twenty_one;

import java.util.Arrays;
import java.util.Scanner;

public class 求正数数组的最小不可组成和 {

    public static int getFirstUnFormedNum(int[] arr) {

        // arr全是正整数
        // 首先拿到最小的Min
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max += arr[i];
        }
        int[] arrZi = new int[max - min + 1];
        int len = max - min+1;
        for (int i = 0; i < len; i++) {
            arrZi[i] = min++;
        }

        for (int i = 0; i < arr.length; i++) {
            
        }


        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5};
        int result = getFirstUnFormedNum(arr);
        System.out.println(result);

    }
}
