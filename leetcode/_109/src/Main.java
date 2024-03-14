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
    public TreeNode sortedListToBST(ListNode head) {
           return checkTree(head,null);
    }

    public TreeNode checkTree(ListNode left, ListNode right){
        if(left == right){
            return null;
        }
        ListNode mid = checkMidNode(left,right);
        TreeNode res = new TreeNode(mid.val);
        res.left = checkTree(left,mid);
        res.right = checkTree(mid.next,right);
        return res;
    }

    public ListNode checkMidNode(ListNode left, ListNode right) {
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
