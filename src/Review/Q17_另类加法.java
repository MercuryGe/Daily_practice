package Review;

import com.sun.org.apache.regexp.internal.RE;

public class Q17_另类加法 {
    // 二进制位相异或的结果，是两个数对应位相加后的结果

    // 二进制位与后 左移一位的结果， 是两个数相加仅为后的结果（只考虑进位）

    // 两个数相加，如果不需要进位的话，那么这两个数异或的值就是这两个数的和
    public int addAB(int A, int B){
        if(B == 0) return A;

        int sum = 0;
        int carray = 0;
        while(B != 0){
            sum = A^B;
            carray = (A&B) << 1;
            A = sum;
            B = carray;
        }
        return A;
    }

}
