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
        // 创建二叉树
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        Solution solution = new Solution();
        int k = 5;
        System.out.println(solution.kthSmallest(root,k));
    }

}

class Solution {
    private int index;
    private int key;
    public int kthSmallest(TreeNode root, int k) {
        this.key = k;
        inOrder(root);
        return index;
    }

    int inOrder(TreeNode root) {
        if (root == null)
            return 0;
        inOrder(root.left);
        if(key == 0){
            return 0;
        }
        if(--key == 0){
            index = root.val;
        }
        inOrder(root.right);
        return 0;
    }
}