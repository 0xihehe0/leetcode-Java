class ListNode {
    int val;        // Node value
    ListNode next;  // Reference to the next node

    ListNode(int x) {
        val = x;
    }  // Constructor
}


public class Main {

    public static void main(String[] args) {
        /* Initialize linked list: 1 -> 3 -> 2 -> 5 -> 4 */
        // Initialize each node
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        // Build references between nodes
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Solution so = new Solution();
        System.out.println(so.addTwoNumbers(n0,n0));
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resNode = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode checkNode = resNode;
        int carry = 0;
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            checkNode.next = new ListNode(sum % 10);
            checkNode = checkNode.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            checkNode.next = new ListNode(carry);
        }
        return resNode.next;
    }
}

