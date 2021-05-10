package may_ten;

import java.util.Arrays;

public class Demo6 {
    // 数组中出现次数超过一半的数字
    // 方法一：对数组进行排序，取中间数
    public int MoreThanHalfNum(int[] array){
        if(array == null || array.length == 0) return 0;
        Arrays.sort(array);

        int midNumber = array[array.length/2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == midNumber){
                count++;
            }
        }
        if(count > array.length / 2){
            return midNumber;
        }else{
            return 0;
        }
    }


    // 方法二：众数与非众数抵消，如果有众数，剩下的一定是；如果没有众数，剩下一个数去遍历数组看这个数是不是超过了一半
    public int MoreThanHalfNum2(int[] array) {
        if(array == null || array.length==0) return 0;
        int result = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {
            if(times != 0){
                if(array[i] != result){
                    --times;
                }else{
                    ++times;
                }
            }else {
                result = array[i];
                times = 1;
            }
        }
        times = 0; // 计数器置零
        for (int i = 0; i < array.length; i++) {
            if(array[i] == result){
                times++;
            }
        }
        if(times > array.length / 2){
            return result;
        }
        return 0;
    }

}
