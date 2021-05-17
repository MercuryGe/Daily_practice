package may_seventeen;
import java.util.*;
public class 数根 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String num = scan.next();
            int result = 0;
//            do{
//                result=0;
//                for(int i=0;i<num.length();i++){
//                    char u = num.charAt(i);
//                    result+=num.charAt(i)-48;  //ASCII表中0对应的是48
//                }
//                num=result+"";
//            }while(result>=10);
            while(num.length() > 1){
                int ret = 0;
                for (int i = 0; i < num.length(); i++) {
                    ret += num.charAt(i) - 48;
                }
                num = ret + "";
            }
            System.out.println(result);
        }
    }
}
