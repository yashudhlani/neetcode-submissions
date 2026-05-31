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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        if (size == 1) return null;

        int count = size - n;
        if (count == 0) return head.next;
        curr = head;
        while (count > 1) {
            curr = curr.next;
            count--;
        }
        curr.next = curr.next.next;
        return head;
    }
}
