package Review;

import java.util.Scanner;

public class 第一题_排序子序列 {
    // 把数组A[1 2 3 2 2 1] 划分为 [1 2 3] 和[2 2 1]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            // 长度给到 n+1 防止越界
            int[] array = new int[n + 1];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int i = 0;
            int count = 0;
            while(i < n){
                if(array[i] < array[i+1]){
                    while (i < n && array[i] <= array[i+1]){
                        i++;
                    }
                    count++;
                    i++;
                }else if( array[i] == array[i+1]){
                    i++;
                }else{
                    while(i < n && array[i] >= array[i+1]){
                        i++;
                    }
                    count++;
                    i++;
                }
            }
        }
    }
}
