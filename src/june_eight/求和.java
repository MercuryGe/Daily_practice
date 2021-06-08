package june_eight;

import java.util.Scanner;

public class 求和 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt(); // 1 ~ n
            int m = scan.nextInt(); //  使和等于m
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if(i + j == m){
                        System.out.println(i + " " + j);
                    }else if(i == m){
                        System.out.println(i + " " + " ");
//                    }else if (j == m){
//                        System.out.println(" " + " " + j);
                    }
                }
            }

        }
    }
}
