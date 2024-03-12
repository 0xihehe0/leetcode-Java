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
        int n = 2;
//        System.out.println(so.removeNthFromEnd(n0, n));
        System.out.println(so.removeNthFromEnd2(n0, n));
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int index = 0;
        ListNode checkNode = new ListNode(0);
        checkNode.next = head;
        ListNode first = head;
        while(first.next != null){
            index ++;
            first = first.next;
        }
        first = checkNode;
        for (int i = 0; i < index - n + 1; i++) {
            first = first.next;
        }
        first.next = first.next.next;
        return checkNode.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode nes =  new ListNode(0);
        ListNode first = nes;
        ListNode second = nes;
        second.next = head;
        int index = 0;
        while (first.next != null){
            index ++;
            first = first.next;
            if(index > n){
                second = second.next;
            }
        }
        second.next = second.next.next;
        ListNode res = nes.next;
        return res;
    }
}