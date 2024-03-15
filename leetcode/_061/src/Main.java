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
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        // Build references between nodes
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Solution so = new Solution();
        int k = 7;
        System.out.println(so.rotateRight(n0,k));
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode oldTail = head;
        int length;
        for (length = 1; oldTail.next != null; length++) {
            oldTail = oldTail.next;
        }

        // 闭合成环
        oldTail.next = head;

        // 找到新的尾部：(length - k % length - 1) 位置
        ListNode newTail = head;
        for (int i = 0; i < length - k % length - 1; i++) {
            newTail = newTail.next;
        }

        // 找到新的头部
        ListNode newHead = newTail.next;

        // 断开环
        newTail.next = null;

        return newHead;
    }
}