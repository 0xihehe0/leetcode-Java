public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcd";
        String goal = "ceab";
        System.out.println(solution.rotateString(s,goal));
    }
}

class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}