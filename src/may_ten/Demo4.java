package may_ten;

import java.util.Scanner;

public class Demo4 {
    // 排序子序列
    // 定义排序子序列位一个数组中一段连续的子序列，并且这段子序列是非递增或者非递减排序的。
    // 有一个长度为n的整数数组A，有一个任务是把数组A分成若干个排序子序列
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n+1];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int i = 0;
        int count = 0;
        while(i < n){
            if(array[i] < array[i+1]){
                while(i < n && array[i] < array[i+1]){
                    i++;
                }
                // 当不小于时，说明这一段已经走完了
                count++;
                i++; // 下标往后走一个，进入下一个段
            }else if(array[i] == array[i+1]){
                i++;
            }else{
                while(i < n &&array[i] > array[i+1]){
                    i++;
                }
                count++;
                i++;
            }
            i++;
        }
    }
}
