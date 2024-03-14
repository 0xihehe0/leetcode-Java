import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;        // Node value
    ListNode next;  // Reference to the next node

    ListNode(int x) {
        val = x;
    }  // Constructor
}

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
        /* Initialize linked list: 1 -> 3 -> 2 -> 5 -> 4 */
        // Initialize each node
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        // Build references between nodes
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Solution so = new Solution();
        int n = 2;
        System.out.println(so.sortedListToBST(n0));
    }
}

class Solution {
    static List list = new ArrayList<>();
    static int [] nums = null;
    public TreeNode sortedListToBST(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast)
        TreeNode node = new TreeNode(0);
        return node;
    }

    static TreeNode checkTree(int left, int right){
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode((Integer) list.get(mid));
        node.left = checkTree(left, mid - 1);
        node.right = checkTree(mid + 1, right);
        return node;
    }
}
