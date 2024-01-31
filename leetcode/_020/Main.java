
package leetcode._020;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.isValid("123"));
        System.out.println(so.isValid("(}{)"));
    }
}

class Solution {
    public boolean isValid(String s) {
        boolean checkStatus = false;
        return checkStatus;

    }
}
        boolean checkStatus = false;
        if(s.length() % 2 == 1){
            return checkStatus;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(stack.isEmpty() || map.get(c) != stack.peek()){
                    return checkStatus;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
