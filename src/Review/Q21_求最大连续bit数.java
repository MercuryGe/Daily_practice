package Review;

import java.util.Scanner;

public class Q21_求最大连续bit数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n =scanner.nextInt();
            int count = 0;
            int modeCount = 0;
            while(n != 0){
                if((n & 1) == 1){
                    count++;
                    modeCount = Math.max(count, modeCount);
                }else{
                    count = 0;
                }
                n >>= 1;
            }
            System.out.println(modeCount);
        }

    }
}
