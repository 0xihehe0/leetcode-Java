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
        System.out.println(so.deleteDuplicates(n0));
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode checkHead = dump;
        while(checkHead.next != null && checkHead.next.next != null){
            if(checkHead.next.val == checkHead.next.next.val){
                int value = checkHead.next.val;
                while(checkHead.next != null && checkHead.next.val == value){
                    checkHead.next = checkHead.next.next;
                }
            }else{
                checkHead = checkHead.next;
            }
        }
        return dump.next;
    }
}