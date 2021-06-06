package june_four;

import java.util.Scanner;

public class 五子棋 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int m = 20, n = 20;
            char[][] CheckerBoard = new char[m][n];

            // 逐行将字符串
            for (int i = 0; i < m; i++) {
                String s= scanner.next();
                for (int j = 0; j < 20; j++) {
                    CheckerBoard[i][j] = s.charAt(j);
                }
            }

            if(check(CheckerBoard)) System.out.println("Yes");
            else System.out.println("No");

        }
    }


    static int[][] direction = {{0, 1}, {0, - 1}, {1, 0}, { - 1, 0}, {1, 1}, {1, - 1}, { - 1, 1}, { - 1, - 1}};


    private static boolean check(char[][] map) {
        for (int i = 0; i < 20; i ++ ) {
            for (int j = 0; j < 20; j ++ ) {
                if(map[i][j] == '*' || map[i][j] == '+') {
                    for (int k = 0; k < 8; k ++ ) {
                        int count = 1;
                        int x = i + direction[k][0];
                        int y = j + direction[k][1];
                        while (x >= 0 && x < 20 && y >= 0 && y < 20 && map[x][y] == map[i][j]) {
                            count ++ ;
                            x += direction[k][0];
                            y += direction[k][1];
                        }
                        if(count == 5) return true;
                    }
                }
            }
        }
        return false;
    }
}
