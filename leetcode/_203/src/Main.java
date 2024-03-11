/* Linked List Node Class */
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
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        // Build references between nodes
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Solution so = new Solution();
        int val = 3;
        System.out.println(so.removeElements(n0, val));
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode defaltNode = new ListNode(0);
        defaltNode.next = head;
        ListNode checkNode = defaltNode;
        while (checkNode.next != null) {
            if (checkNode.next.val == val) {
                checkNode.next = checkNode.next.next;
            } else {
                checkNode = checkNode.next;
            }

        }
        return defaltNode.next;
    }
}