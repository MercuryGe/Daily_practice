package june_one;


import java.util.*;

public class 红与黑 {
    // 使用BFS，标记开始的结点，把结点放入队列，往前后左右变量，将符合条件的放入队列
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int m = scanner.nextInt(); // 输入行
            int n = scanner.nextInt(); // 输入列
            scanner.nextLine(); // 换行

            // 二维数组保存
            Character[][] map = new Character[m][n];

            // start结点表示 一开始站的位置
            Node start = null;
            for (int i = 0; i <m ; i++) {
                String s= scanner.nextLine();
                for (int j = 0; j < n; j++) {
                     map[i][j] = s.charAt(j);
                     // 找到字符“@”，用start表示
                    if(s.charAt(j) == '@')
                        start = new Node(i,j);
                }
            }

            // 方向数组 表示往上、下、左、右移动一位所需要增加的坐标量
            int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            // 广度优先遍历
            bfs(map, direction, start);
        }
    }

    private static void bfs(Character[][] map, int[][] direction, Node start) {
        // 定义Node队列，把可以走到的结点放进去
        Queue<Node> queue = new LinkedList<Node>();

        // 定义可以走到的二维数组
        boolean[][] visited = new boolean[map.length][map[0].length];
        queue.add(start);
        // 令当前所在瓷砖位置为true
        visited[start.x][start.y] = true;
        int count = 1;
        while( !queue.isEmpty()){
            // 取出队列第一个元素
            Node cur = queue.poll();
            // 遍历它上下左右的元素
            for (int i = 0; i < 4 ; i++) {
                Node next = new Node(cur.x + direction[i][0], cur.y + direction[i][1]);
                if(next.x >= 0 && next.x < map.length && next.y >= 0 && next.y < map[0].length
                        && map[next.x][next.y] != '#' && ! visited[next.x][next.y]) {
                    count ++ ;
                    queue.add(next);
                    visited[next.x][next.y] = true;
                }
            }
        }
        System.out.println(count);

    }

    static  class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }


}
