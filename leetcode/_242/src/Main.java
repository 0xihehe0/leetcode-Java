import javafx.scene.chart.Chart;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isAnagram("aabb","aabb"));
    }

}


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            map.put(value, map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char value = t.charAt(i);
            if(!map.containsKey(value)){
                return false;
            }
            map.put(value, map.getOrDefault(t.charAt(i), 0) - 1);
            if(map.get(value) == 0){
                map.remove(value);
            }
        }
        if(map.size() == 0){
            return true;
        }

        return false;
    }
}