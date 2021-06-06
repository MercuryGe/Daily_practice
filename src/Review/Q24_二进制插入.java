package Review;

public class Q24_二进制插入 {

    // 给定两个32位整数n和m，同时将m的二进制数位插入到n的二进制的第j到第i位，保证n的第j到第i位均为零
    // 且m的二进制位数小于等于i - j + 1，其中二进制的位数从0开始由低到高

    public int binInsert(int n, int m, int j, int i){
        m <<= j; // m右移j位
        return m | n;

    }
}
