import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();

        // 创建链表1
        ListNode A = new ListNode(1);
        A.next = new ListNode(2);
        A.next.next = new ListNode(4);

        // 创建链表2
        ListNode B = new ListNode(3);
        B.next = new ListNode(5);

        ListNode result = so.mergeTwoLists(A, B);

        // 打印合并后的链表
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        System.out.print(list1);
        ListNode first = new ListNode(-1);
        ListNode two = first;
        while(list1 != null && list2 != null){
            if(list1.val >= list2.val){
                two.next = list1;
                list1 = list1.next;
            }
            else if(list1.val <= list2.val){
                two.next = list2;
                list2 = list2.next;
            }
            two = two.next;
        }


        first.next = list1 == null ? list1 : list2;
        System.out.print(first.next);
        return first.next;
    }
}
