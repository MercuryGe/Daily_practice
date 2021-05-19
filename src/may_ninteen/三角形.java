package may_ninteen;

import java.util.Scanner;

public class 三角形 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String a = scan.next();
            String b = scan.next();
            String c = scan.next();
            isAngle(a, b, c);
        }
    }
    public static void isAngle(String a, String b, String c){
        if((a+b).compareTo(c) == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
