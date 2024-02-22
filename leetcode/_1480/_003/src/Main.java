import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "au";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        HashMap map = new HashMap<>();
        int maxLength = 0;
        int start = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                start = Math.max(start, (Integer) map.get(c));
            }
            map.put(c,i);
            maxLength = Math.max(maxLength,i - start);
        }
        return maxLength;
    }
}