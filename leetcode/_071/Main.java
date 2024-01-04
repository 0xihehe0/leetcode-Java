package _071;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();

        System.out.println(so.simplifyPath("/./a/../"));
    }
}

class Solution {
    public String simplifyPath(String path) {
        String input = "/../../../";
        Stack<String> stack = new Stack<>();

        String[] temp;
        String delimeter = "/";  // 指定分割字符
        temp = path.split(delimeter); // 分割字符串
        // 普通 for 循环
        for(int i =0; i < temp.length ; i++){
            stack.push(temp[i]);
            System.out.println(temp[i]);
            System.out.println("");
        }

        // Print the stack
        System.out.println(stack);
        for (int i = 0; i < stack; i++) {

        }
        return "123";
    }
}