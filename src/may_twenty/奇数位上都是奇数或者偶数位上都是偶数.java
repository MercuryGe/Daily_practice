package may_twenty;

import java.util.Arrays;
import java.util.Scanner;

public class 奇数位上都是奇数或者偶数位上都是偶数 {
    public  static final  void oddInOddEvenInEven(int[] arr) {
        int[] result = new int[arr.length];
        int Even = 0;
        int Odd = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                // 说明是奇数
                result[Odd] = arr[i];
                Odd = Odd + 2;
            }else{
                // 说明是偶数
                result[Even] = arr[i];
                Even = Even + 2;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        oddInOddEvenInEven(arr);
    }



    public void oddInOddEvenInEven2(int[] arr) {
        if(arr==null || arr.length<2){
            return;
        }
        int even=0;
        int odd=1;
        int end=arr.length-1;
        while(even <=end && odd<=end){
            if(arr[end]%2==0){
                swap(arr,end,even);
                even += 2;
            }else{
                swap(arr,end,odd);
                odd += 2;
            }
        }
    }
    public void swap(int[]array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
