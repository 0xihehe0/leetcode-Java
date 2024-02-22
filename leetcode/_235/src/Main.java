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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        Solution solution = new Solution();
        TreeNode p = root.left.right;
        TreeNode q = root.left.left;
        System.out.println(solution.lowestCommonAncestor(root, p, q));
    }

}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        return root;
    }
}