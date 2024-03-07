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
        solution.flatten(root);
    }
}

class Solution {
    List list = new ArrayList<>();
    TreeNode checkRoot = new TreeNode(0);
    public void flatten(TreeNode root) {
        checkRoot.val = root.val;
        firstTree(root);
        System.out.println(list);

    }

    public void firstTree(TreeNode root){
        if(root == null){
            return;
        }

        checkTree(root);
        firstTree(root.right);
        firstTree(root.left);

        list.add(root.val);
    }

    public void checkTree(TreeNode root){

    }
}

