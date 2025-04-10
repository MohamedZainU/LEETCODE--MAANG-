/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "(ab)c)";
        StringBuilder res = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(res.length()); // Modified code
            } else if (!stack.isEmpty() && c == ')') {
                stack.pop();
            } else if (stack.isEmpty() && c == ')') {
                continue;
            }
            res.append(c);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            res.deleteCharAt(index);
        }

        System.out.println(res.toString());
    }
}

