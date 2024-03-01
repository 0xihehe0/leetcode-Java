public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        Solution solution = new Solution();
        solution.plusOne(list);
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        boolean isAddStatus = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            int value = digits[i];
            if (value != 9) {
                digits[i]++;
                for (int j = i + 1; j < digits.length; j++) {
                    digits[0] = 0;
                }
                return digits;
            }
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}

