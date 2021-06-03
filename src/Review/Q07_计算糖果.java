package Review;

import java.util.Scanner;

public class Q07_计算糖果 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int A  = (a + c) / 2;
        int B1 = (c - a) / 2;
        int B2 = (b + d) / 2;
        int C  = (d - b) / 2;

        if(B1 != B2){
            System.out.println("No");
        }else {
            System.out.println(A + " " + B1 + " " + C);
        }

    }


}
