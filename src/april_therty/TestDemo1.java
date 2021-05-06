package april_therty;

import java.util.*;

public class TestDemo1{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        while(scan.hasNext()){
//            int num = scan.nextInt();
//            int result = count(num);
//            System.out.println(result);
//        }
//    }
//    public static int count(int num){
//        int[] arr = {2,3,5};
//        HashSet<Integer> set = new HashSet<>();
//        int tmp;
//        set.add(1);
//        for(int i = 0; i < arr.length; i++){
//            tmp = arr[i];
//            while(num % tmp == 0){ // 当前数余2等于0
//                set.add(num);
//                set.add(tmp);
//                num = num / tmp;
//            }
//        }
//
//        int count = set.size();
//        return count;
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int N = in.nextInt();
            int count = 0;
            for(int i=1;i<=N;i++){
                int sum=0;
                for(int j=1;j<i;j++){
                    if(i%j==0){
                        sum+=j;
                    }
                }
                if(sum==i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}