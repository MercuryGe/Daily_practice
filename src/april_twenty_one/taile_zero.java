package april_twenty_one;
import java.util.*;

public class taile_zero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int ret = n;
            while(n != 1){
                n--;
                ret = ret * n;
            }
            int result = 0;
            while( ret % 10 == 0){
                result++;
                ret = ret / 10;
            }
            System.out.println(result);
        }
    }
}



