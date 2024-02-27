import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String ransomNote = "aab";
        String magazine = "baa";
        Solution solution = new Solution();
        System.out.println(solution.canConstruct(ransomNote,magazine));
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean isConstruct = true;
        for (int i = 0; i < magazine.length(); i++) {
            char value = magazine.charAt(i);
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char value = ransomNote.charAt(i);
            if(!map.containsKey(value)){
                isConstruct = false;
                return isConstruct;
            }
            map.put(value, map.getOrDefault(value, 0) - 1);
            if(map.get(value) == 0){
                map.remove(value);
            }
        }

        return isConstruct;
    }
}

