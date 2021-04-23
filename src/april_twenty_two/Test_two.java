package april_twenty_two;

import april_twenty_one.Test;

public class Test_two {
    public int add(int a, int b){
        try{
            //int c= a+b;
            return a+b;
        }catch (Exception e){
            System.out.println("catch语句块");
        }finally {
            System.out.println("finally语句块");
        }
        return 0;
    }
    public static void main(String argv[]){
        Test_two test = new Test_two();
        System.out.println("和是：" + test.add(9,34));
    }
}
