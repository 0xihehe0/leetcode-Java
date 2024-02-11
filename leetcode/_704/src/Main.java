public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 5, 6, 7, 8, 12};
        int target = 5;
        System.out.println(solution.search(nums,target));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (int) Math.floor((double) (left + right) /2);
            if(target < nums[mid]){
                left = mid + 1;
            }
            else if(target > nums[mid]){
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}