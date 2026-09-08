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
        if(head==null || head.next==null) return;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        ListNode temp = slow.next;
        slow.next = null;
        while(temp!=null){
            ListNode curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }
        ListNode temp1 = head;
        while(temp1!=null && prev!=null){
            ListNode t = temp1.next;
            ListNode q = prev.next;
            temp1.next = prev;
            prev.next = t;
            temp1 = t;
            prev = q;
        }
    }
}
