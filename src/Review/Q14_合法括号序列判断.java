package Review;

import java.util.Scanner;
import java.util.Stack;

public class Q14_合法括号序列判断 {
    public static boolean chkParenthesis(String A, int n){
        if(n % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : A.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty()){
                    // 右括号先于左括号出现，为非法
                    return false;
                }else if(stack.peek() == '('){
                    // 匹配成功
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int num = scanner.nextInt();
            System.out.println(chkParenthesis(str, num));
        }
    }
}
