package april_twentyeight;

import java.util.Map;

// 统计手上有多少个不同种类的球，每次从特定种类的球取0~N个，看取出来的组合成的和能否大于积
// 剪枝：当前积大于和，就不往下求，任意乘一个都会比和要大

public class Test2 {

    // 统计重复球数
    private static Map<Integer,Integer> countMap;
    // 球的个数
    private static int N;
    // 一共有多少种情况
    private static int sum;
    // 唯一的编号有多少个
    private static int[] uninum;
    // 每个数字的个数
    private static int[] numNum;
    // 总共的唯一个数
    private static int sizeN;

}
