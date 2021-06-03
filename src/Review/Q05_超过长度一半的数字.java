package Review;

public class Q05_超过长度一半的数字 {
    // 抵消法
    public static void main(String[] args) {

    }
    public int MoreThanHalfNum_Solution(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        int result = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {

            if(times != 0){
                // time不等于零有两种情况
                if(array[i] == result) {
                    // i下标和目标值相等
                    times++; // 出现次数再+1
                }else {
                    // i下标和目标值不相等
                    times--;
                }
            }else {
                // 当times等于零时 result和times都要发生改变
                // 重新找一个数，开始新的计数
                result = array[i]; // 此时result的值是等于当前i下标位置的值
                times = 1;
            }
        }
        // 遍历数组，看得出的结果是否为众数
        times = 0; //不定义新的变量了，用之前的计数器
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == result){
                times++;
            }
        }
        if(times > array.length/2){
            return result;
        }
        return 0; // 0代表没有找到
    }
}
