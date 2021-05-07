package may_seven;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            if(num == 1 || num == 2){
                System.out.println(-1);
                continue;
            }else if(num % 4 == 1 || num % 4 == 3){
                System.out.println(2);
                continue;
            }else if(num % 4 == 0){
                System.out.println(3);
                continue;
            }else if(num % 4 == 2){
                System.out.println(4);
                continue;
            }
        }
    }
}
