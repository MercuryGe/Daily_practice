package june_one;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 数据库连接池 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int curLink = 0;
            int maxLink = 0;
            Set<String> linkPool = new HashSet<>();
            for (int i = 0; i < num; i++) {
                String name = scanner.next();
                String state = scanner.next();
                if(!linkPool.contains(name) && "connect".equals(state)){
                    linkPool.add(name);
                    ++curLink;
                    maxLink = Math.max(curLink, maxLink);
                    continue;
                }
                if(linkPool.contains(name) && "disconnect".equals(state)){
                    --curLink;
                    linkPool.remove(name);
                }
            }
            System.out.println(maxLink);
        }
        scanner.close();
    }
}
