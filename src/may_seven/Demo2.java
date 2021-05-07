package may_seven;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(addLongInteger(str1, str2));
        }
        scanner.close();
    }

    // 将整数字符串表示成整数数组
    // 得到的整数数组下标从小达到位数从低到高
    private static int[] getNumber(String n){
        int[] r= new int[n.length()];
        for(int i = 0; i < r.length; i++){
            r[i] = n.charAt(n.length() - i - 1) - '0';
        }
        return r;
    }

    // 将两个整数数组相加
    private static int[] add(int[] m, int[] n){

        // 保证n数组（大小）长度永远不小于m数组
        if(m.length > n.length){
            int[] t = m;
            m = n;
            n = t;
        }

        // 两整数相加，其结果的最大长度可能会比原长度大于1
        int[] r = new int[n.length + 1];

        // 来自低位的进位
        int c = 0;

        for (int i = 0; i < m.length; i++) {
            r[i] = m[i] + n[i] + c;
            c = r[i] / 10;
            r[i] %= 10;
        }

        // 计算余下部分
        for (int i = m.length; i < n.length; i++) {
            r[i] = n[i] + c;
            c = r[i] / 10;
            r[i] %= 10;

        }
        // 当上面的全都走完了c还不为0则需要进位
        // 进位
        if(c != 0){
            r[r.length - 1] = c;
            return r;
        }else{
            // 不进位的情况
            int[] ret = new int[r.length - 1];
            System.arraycopy(r,0,ret,0,ret.length);
            return ret;
        }

    }

    // 将数组表示的整数转换成字符串
    private static String toNumber(int[] r){
        if(r == null){
            return null;
        }
        StringBuffer b = new StringBuffer(r.length);
        // 数组下标从小到达，位数从低到高，所以要逆序
        for (int i = r.length - 1; i >= 0; i--){
            b.append(r[i]);
        }
        return b.toString();
    }

    private static String addLongInteger(String ns, String ms){
        int[] n = getNumber(ns);
        int[] m = getNumber(ms);

        int[] r= add(m, n);

        return toNumber(r);

    }
}
