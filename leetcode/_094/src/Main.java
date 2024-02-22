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
        System.out.println(solution.inorderTraversal(root));
    }

}

class Solution {
    List list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
            inOrder(root);
            return list;
    }

    void inOrder(TreeNode root){
        if (root == null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}