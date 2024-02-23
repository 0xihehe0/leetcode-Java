import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(Integer x) {
        val = x;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Solution solution = new Solution();
        System.out.println(solution.sortedArrayToBST(nums));
    }
}

class Solution {
    static int [] nums = null;
    List list = new ArrayList<>();
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        int left = 0;
        int right = nums.length - 1;
        return checkTree(left,right);
    }

    static TreeNode checkTree(int left, int right){
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = checkTree(left, mid - 1);
        node.right = checkTree(mid + 1, right);
        return node;
    }
}