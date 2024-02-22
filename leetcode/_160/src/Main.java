public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(6);
        n0.next = n1;
        n1.next = n2;
        n2.next = null;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        System.out.println(solution.getIntersectionNode(n0,n3));
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = a != null ? b : a.next;
            b = b != null ? a : b.next;
        }
        return a;
    }
}