package day01;
import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "()";

       System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if (top == '(' && ch == ')') {
                    stack.pop();
                } else if (top == '[' && ch == ']') {
                    stack.pop();
                } else if (top == '{' && ch == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
