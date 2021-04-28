package april_twentyeight;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    // 该方法不能通过全部用例
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            int[] arr = new int[num];
            for(int i = 0; i < num; i++){
                arr[i] = scan.nextInt();
            }
            int type = hasLuckyNum(arr);
            System.out.println(type);
        }
    }
    public static int hasLuckyNum(int[] arr){
        // 使用动态规划，定义两个动态数组，一个存放和一个存放积
        int[] dpsum = new int[arr.length]; // 第i位置及其以前位置的和
        int[] dpmul = new int[arr.length]; // 第i位置及其以前位置的积
        // 每一个
        dpsum[0] = arr[0]; // 第一个位置的和就是它本身
        dpmul[0] = arr[0]; // 第一个位置的积理应也是它本身，
        for(int i=1; i < arr.length; i++){
            dpsum[i] = arr[i] + dpsum[i-1];
            dpmul[i] = arr[i] * dpmul[i-1];
        }
        //System.out.println(Arrays.toString(dpsum));
        //System.out.println(Arrays.toString(dpmul));
        int count = 0;
        for (int i = 0; i < dpsum.length; i++) {
            if(dpsum[i] > dpmul[i]){
                count++;
            }
        }
        return count;
    }
}
