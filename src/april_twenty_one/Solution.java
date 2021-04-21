package april_twenty_one;

public class Solution {
    static int cnt = 6;
    static {
        cnt += 9;
    }

    public static void main(String[] args) {
        System.out.println("cnt = " + cnt);
    }
    static {
        cnt /= 3;
    }
}
