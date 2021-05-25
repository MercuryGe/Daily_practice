package may_twenty_five;

import java.util.Scanner;

public class 斐波那契凤尾 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long[] a=new long[100002];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<a.length;i++)
            a[i]=(a[i-1]+a[i-2])%1000000;   //只需输出后六位，故数字相加超过六位的进位就可以抛弃

        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.printf((n<25?"%d\n":"%06d\n"), a[n]);
        }
    }
}
