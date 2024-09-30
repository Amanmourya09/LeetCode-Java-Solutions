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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode  cur = head;
        while(cur != null && cur.next != null) {
            int tmp = cur.val;
            cur.val = cur.next.val;
            cur.next.val = tmp;

            cur  = cur.next.next;
        }
        return head;
    }
}