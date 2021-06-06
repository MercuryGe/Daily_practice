package june_four;

import java.util.Scanner;
import java.util.Stack;

public class Emacs计算器 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            Stack<String> stack = new Stack<>();
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                String s = scanner.next();
                switch (s){
                    case "+":
                        stack.push(String.valueOf(Integer.valueOf(stack.pop())+Integer.valueOf(stack.pop())));
                        break;

                    case "-":

                        stack.push(String.valueOf(-(Integer.valueOf(stack.pop())-Integer.valueOf(stack.pop()))));

                        break;

                    case "*":
                        stack.push(String.valueOf(Integer.valueOf(stack.pop())*Integer.valueOf(stack.pop())));

                        break;

                    case "/":
                        stack.push(String.valueOf(Integer.valueOf(stack.pop())/Integer.valueOf(stack.pop())));

                        break;
                    default:
                        stack.push(s);
                        break;
                }
            }
            System.out.println(stack.pop());

        }
    }
}
