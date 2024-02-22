import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(Integer x) {
        val = x;
    }
}

public class Main {
    // 这里插入上述的 levelOrder 方法

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);

        Solution solution = new Solution();
        System.out.println(solution.isSymmetric(root));
    }

}

class Solution {
    boolean isSymmetricStatus = true;

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return preOrderLeft(root.left, root.right);
    }

    private boolean preOrderLeft(TreeNode leftroot, TreeNode rightroot) {
        if (leftroot == null && rightroot == null) return true;
        if (leftroot == null || rightroot == null) return false;
        if (leftroot.val != rightroot.val) return false;
        return preOrderLeft(leftroot.left, rightroot.right) && preOrderLeft(leftroot.right, rightroot.left);
    }
}
