package april_twenty_three;

import java.util.Scanner;


//byte 的范围是-128~127
public class Test3 {

    public static void main(String[] args) {
        //读入byte类型的整数
        Scanner cin = new Scanner(System.in) ;
        byte num = cin.nextByte() ;
        cin.close() ;

        int max = 0 ;    //记录最大的连续bit位数
        int count = 0 ;  //临时记录当前的连续bit位数
        int temp = 1 ;
        boolean lastFlag = false ;  //记录上一个比特位为0（false）还是1
        //byte类型共8位，所以执行8次就可以了
        for(int i = 0 ; i < 8 ; i++){
            //temp & num 不为0表示当前位为1
            if((temp & num) != 0){
                if(lastFlag){
                    count++ ;
                }else{
                    count = 1 ;
                    lastFlag = true ;
                }
                //将最大的连续bit位数记为max
                max = max > count ? max : count ;
            }else{
                lastFlag = false ;
            }
            //将temp左移一位，进入下一位的比较准备
            temp = temp << 1 ;
        }

        System.out.println(max) ;

    }

}