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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        Solution solution = new Solution();
        System.out.println(solution.isValidBST(root));
    }
}

class Solution {
    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean isLeftCheck = isValidBST(root.left);
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        boolean isRightCheck = isValidBST(root.right);
        return isLeftCheck && isRightCheck;
    }
}