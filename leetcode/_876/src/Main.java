import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode n0 = new ListNode(1);

        solution.middleNode(n0);
    }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        LinkedList<String> list = new LinkedList<>();
        int fastIndex = 0;
        int slowIndex = 0;
        ListNode n0 = new ListNode(1);
        System.out.println(head);
        return n0;
    }
}