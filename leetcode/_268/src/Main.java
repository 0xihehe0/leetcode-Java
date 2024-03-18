public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        int [] nums = {1,2,3,4,5,7,8,9};
        System.out.println(so.missingNumber(nums));
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int total = len * (len + 1) / 2;
        int arrSum = 0;
        for (int num : nums) {
            arrSum += num;
        }
        return total - arrSum;
    }
}

