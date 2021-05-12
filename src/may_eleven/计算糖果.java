package may_eleven;

import java.util.Scanner;

public class 计算糖果 {
    // 输入为一行，一共四个整数，分别为A-B  B-C  A+B    B+C
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int A = (a + c) / 2;
            int B1 = (c - a) / 2;
            int B2 = (b + d) / 2;
            int C = (d - b) / 2;

            if(B1 != B2){
                System.out.println("No");
            }else {
                System.out.println(A + " " + B1 + " " + C);
            }
        }
    }
}
