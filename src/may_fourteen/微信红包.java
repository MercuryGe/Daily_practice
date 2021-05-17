package may_fourteen;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 微信红包 {
    public int getValue(int[] gifts, int n) {
        // write code here
        if(gifts == null || gifts.length == 0) return 0;
        Arrays.sort(gifts);
        int midNum = gifts[n/2];
        int count =0;
        for (int i = 0; i < n; i++) {
            if(gifts[i] == midNum) count++;
        }
        if(count > n / 2){
            return midNum;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}