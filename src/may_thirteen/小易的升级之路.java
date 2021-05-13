package may_thirteen;

import java.util.Scanner;

public class 小易的升级之路 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int monsterNum = scanner.nextInt();
            int initAble = scanner.nextInt();
            int[] monsterDenfenseArray = new int[monsterNum];
            for (int i = 0; i < monsterDenfenseArray.length; i++) {
                monsterDenfenseArray[i] = scanner.nextInt();
            }
            int levelAble = upGrade(initAble, monsterDenfenseArray);
            System.out.println(levelAble);
        }
    }

    private static int upGrade(int initAble, int[] monsterDenfenseArray) {
        int nowAble = initAble;
        for (int i = 0; i < monsterDenfenseArray.length; i++) {
            if(nowAble >= monsterDenfenseArray[i]){
                nowAble += monsterDenfenseArray[i];
            }else{
                nowAble += greatestCommonDivisor(nowAble, monsterDenfenseArray[i]);
            }
        }
        return nowAble;
    }

    private static int greatestCommonDivisor(int nowAble, int monsterAble) {
        // 求最大公约数
        if(nowAble % monsterAble == 0){
            return monsterAble;
        }else{
            return greatestCommonDivisor(monsterAble, nowAble % monsterAble);
        }
    }
}
