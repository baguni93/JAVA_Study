package day01;
import java.util.*;

public class ValidParentheses_Easy {

    public static void main(String[] args) {
        String s = "()()";

        isValid(s);
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray())
        {
            if(c == '(') stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
