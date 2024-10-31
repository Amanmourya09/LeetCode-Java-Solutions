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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        while(head != null) {
            lst.add(head.val);
            head = head.next;
        }
        int[] output = new int [lst.size()];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<lst.size(); i++) {
            while(!stack.isEmpty() && lst.get(stack.peek()) < lst.get(i)) {
                output[stack.pop()] = lst.get(i);
            }
            stack.add(i);
        }
        return output;
    }
}