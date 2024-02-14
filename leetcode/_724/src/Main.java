import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] list = {1, 7, 3, 6, 5, 6};
        System.out.println(solution.pivotIndex(list));
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int leftValue = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            int rightValue = total - value - leftValue;
            System.out.println(leftValue + "," + rightValue);
            if(leftValue == rightValue){
                return i;
            }

            leftValue += value;
        }
        return -1;
    }
}