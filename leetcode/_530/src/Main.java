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
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);

        Solution solution = new Solution();
        System.out.println(solution.getMinimumDifference(root));
    }
}

class Solution {
    int minValue = Integer.MAX_VALUE;
    int checkValue;

    public int getMinimumDifference(TreeNode root) {
        checkValue = -1;
        CheckDfs(root);
        return minValue;
    }

    public void CheckDfs(TreeNode root) {
        if (root == null) {
            return;
        }
        checkValue = Math.abs(root.val - checkValue);
        CheckDfs(root.left);
        if (checkValue == -1) {
            checkValue = root.val;
        } else {
            minValue = Math.min(root.val - checkValue, minValue);
            checkValue = root.val;
        }

        CheckDfs(root.right);
    }
}