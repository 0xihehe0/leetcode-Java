public class Main {
    public static void main(String[] args) {
        int m = 0;
        int n = 1;
        int[] nums1 = {0};
        int[] nums2 = {1};
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int leftIndex = m - 1;
        int rightIndex = n - 1;
        int allIndex = m + n - 1;
        while (leftIndex >= 0 && rightIndex >= 0) {
            if (nums1[leftIndex] > nums2[rightIndex]) {
                nums1[allIndex] = nums1[leftIndex];
                leftIndex--;
            } else {
                nums1[allIndex] = nums2[rightIndex];
                rightIndex--;
            }
            allIndex--;
        }
        while(rightIndex >= 0){
            nums1[allIndex] = nums2[rightIndex];
            allIndex --;
            rightIndex --;
        }

    }
}