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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode output = dummy;
        dummy.next = head;

        while(head != null) {
            if(head.val == val){
                head = head.next;
                dummy.next = head;
            } else {
                head = head.next;
                dummy = dummy.next;
            }
        }
        return output.next;
    }
}