import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        int [] nums = {2,3,7,9,11};
        int target = 11;
        System.out.println(so.twoSum(nums,target));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hashtable.containsKey(target - nums[i])){
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}