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
        System.out.println(so.swapPairs(n0));
        System.out.println(so.swapPairs2(n0));
    }
}
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fristNode = head.next;
        ListNode secondNode = head.next.next;
        fristNode.next = head;
        head.next = swapPairs(secondNode);
        return fristNode;
    }

    public ListNode swapPairs2(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode temp = dummyNode;
        while (temp.next != null && temp.next.next != null){
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return  dummyNode.next;
    }
}
