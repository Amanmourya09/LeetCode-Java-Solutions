/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;
        ListNode last = head;
        ListNode secLast = head;
        ListNode tmp = head.next;

        while(last.next != null ) {
            secLast = last;
            last = last.next;
        }
        head.next = last;
        last.next = tmp;
        secLast.next = null;
        reorderList(tmp);
    }
}