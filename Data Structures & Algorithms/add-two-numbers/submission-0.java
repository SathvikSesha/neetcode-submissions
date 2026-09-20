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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode tail = null;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while (temp1 != null || temp2 != null || carry > 0) {
            int sum = 0;
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            if (head == null) {
                head = new ListNode(sum);
                tail = head;
            }
            else{
                tail.next = new ListNode(sum);
                tail = tail.next;
            }
        }
        return head;
    }
}
