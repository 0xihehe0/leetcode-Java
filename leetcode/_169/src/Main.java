public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] list = {2,2,1,1,1,1,12,2};
        System.out.println(solution.majorityElement(list));
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int maxNum = nums[0];
        int countNum = 1;
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            if(countNum == 0){
                maxNum = value;
            }
            if(maxNum == value){
                countNum ++;
            }else{
                countNum -- ;
            }
        }
        return maxNum;
    }
}

