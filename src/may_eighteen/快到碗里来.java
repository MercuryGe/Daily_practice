package may_eighteen;

import java.util.Scanner;

public class 快到碗里来 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            long catRadiu = scan.nextLong();
            long bowlRadiu = scan.nextLong();
            inBowl(catRadiu, bowlRadiu);
        }
    }
    public static void inBowl(long catRadiu, long bowlRadiu){

        double bowl = 2 * 3.14 * bowlRadiu;
        if(catRadiu <= bowl){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}