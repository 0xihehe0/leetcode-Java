import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.firstUniqChar("apple"));
    }
}

class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0){
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            if(map.containsKey(value)){
                map.put(value,i);
            }else{
                map.put(value,-1);
            }
        }
        System.out.println(map);

        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            if(map.get(value) == -1){
                return i;
            }
        }
        return -1;
    }
}