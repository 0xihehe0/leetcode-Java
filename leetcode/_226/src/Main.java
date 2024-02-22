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
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Solution solution = new Solution();
        System.out.println(solution.invertTree(root));
    }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        invertNode(root);
        return root;
    }

    void invertNode(TreeNode root){
        if(root == null)return;
        TreeNode checkNode = root.left;
        root.left = root.right;
        root.right = checkNode;
        invertNode(root.left);
        invertNode(root.right);
    }
}
