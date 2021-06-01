package june_one;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mkdir {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            String[] arr = new String[num];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.next();
            }
            Arrays.sort(arr);
            List<String> res = new ArrayList<>();
            for (int i = 1; i < arr.length; i++) {
                if(!arr[i].startsWith(arr[i - 1] + "/")){  // startsWith() 方法用于检测字符串是否以指定的前缀开始。
                    res.add(arr[i - 1]);
                }
            }
            res.add(arr[num - 1]);
            for (String s: res) {
                System.out.println("mkdir -p " + s);
            }
            System.out.println();
        }
    }
}
