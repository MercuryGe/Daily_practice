package april_twenty_seven;

import java.lang.reflect.Array;
import java.util.*;
public class Test2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println(leastJumpTime(n,m));
        }
    }

    // 动态规划
    public static int leastJumpTime(int n, int m){
        if(m == n){
            return 0;
        }
        int steps = m - n + 1; // 总共有多少个台阶（位置）
        int[] dp = new int[steps]; // 到每个位置需要的最小步数
        dp[0] = 0; //起点
        for(int i = 1; i < steps; i++){
            dp[i] = Integer.MAX_VALUE; // 初始化动态数组，先表示都不能到达
        }
        for(int i = 0; i < steps; i++){
            if(dp[i] == Integer.MAX_VALUE){
                dp[i] = 0;
                continue;
            }
            ArrayList<Integer> list = getAppNums(i+n);
            for(int j = 0; j < list.size(); j++){
                int x = list.get(j);
                if(i + n + x <= m){
                    dp[i + x] = Math.min(dp[i+x], dp[i] + 1);
                }
            }
        }
        if(dp[steps - 1] == 0){
            return -1;
        }else{
            return dp[steps - 1];
        }
    }


    // 求因数 时间复杂度较低
    public static ArrayList<Integer> getAppNums(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }

}