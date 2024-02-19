public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] list = {1, 7, 3, 6, 5, 6};
        System.out.println(solution.runningSum(list));
    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
            System.out.println(nums[i]);
        }
        return nums;
    }
}