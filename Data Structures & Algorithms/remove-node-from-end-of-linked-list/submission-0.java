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
        if(head.next==null && n==1) return null;
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        if(len==n){
            return head.next;
        }
        ListNode t = head;
        for(int i = 0;i<len-n-1;i++){
            t = t.next;
        }
        t.next = (t.next!=null)?t.next.next:null;
        return head;
    }
}
