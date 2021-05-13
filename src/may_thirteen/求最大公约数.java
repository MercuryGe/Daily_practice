package may_thirteen;

public class 求最大公约数 {
    // 辗转相除法
    public static int getGCD(int a, int b){
        if(a % b == 0){
            return b;
        }else{
            return getGCD(b, a% b);
        }
    }
}
