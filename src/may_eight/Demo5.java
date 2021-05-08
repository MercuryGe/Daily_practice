package may_eight;
import java.util.Scanner;

/**
 * 实现通配符
 * ? 匹配一个字符  [0-9A-Za-z]{1}
 * * 匹配0个或以上的字符  [0-9A-Za-z]{0,}
 * （字符由英文字母和数字0-9组成，不区分大小写。下同）
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String regx = scanner.nextLine();
            String string = scanner.nextLine();
            //做相应的替换
            regx = regx.replaceAll("\\?", "[0-9A-Za-z]{1}");
            regx = regx.replaceAll("\\*", "[0-9A-Za-z]{0,}");
            regx = regx.replaceAll("\\.", "\\\\.");
            boolean result = string.matches(regx);
            System.out.println(result);
        }
    }
}