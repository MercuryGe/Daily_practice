package Review;

import java.util.Scanner;

public class Q11_不要二 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int count = 0;
        int[][] array = new int[w][h];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if(array[i][j] == 0){
                    count++;
                    if(i + 2 < w) {
                        array[i + 2][j] = 1;
                    }
                    if(j + 2 < h){
                        array[i][j + 2] = 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
