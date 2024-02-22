import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.longestPalindrome("peeepsf"));
    }
}

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int all = 0;
        boolean isOdd = false;
        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            map.put(value, map.getOrDefault(s.charAt(i), 0) + 1);
        }
//        System.out.println(map);
        for (Map.Entry<Character, Integer> kv: map.entrySet()) {
            int value = kv.getValue();
            if(value % 2 == 0){
                all += value;
            }
            else {
                all += value - 1;
                isOdd = true;
            }
        }
        if(isOdd){
            all += 1;
        }
        return all;
    }
}