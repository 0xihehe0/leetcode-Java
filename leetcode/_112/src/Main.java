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
        int value = 6;
        Solution solution = new Solution();
        System.out.println(solution.hasPathSum(root,value));
    }

}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return checkHasTotal(root,targetSum);
    }

    static boolean checkHasTotal(TreeNode root, int num){
        if(root == null) return false;
        int checkNum = num - root.val;
        if(root.left == null && root.right == null && checkNum == 0){
            return true;
        }
        return checkHasTotal(root.left,checkNum) || checkHasTotal(root.right,checkNum);
    }
}