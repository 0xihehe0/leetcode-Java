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
        System.out.println(so.detectCycle(n0));
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head != null || head.next != null){
                return null;
        }

        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while(slowNode != fastNode){
            if(fastNode == null || fastNode.next != null){
                return null;
            }
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return fastNode.next;
    }
}